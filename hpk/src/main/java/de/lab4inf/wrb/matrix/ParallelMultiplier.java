package de.lab4inf.wrb.matrix;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ParallelMultiplier {
	
	/**
	 * Parallele Matrizenmultiplikation für die Matrizen A, B
	 * 
	 * @param A
	 * @param B
	 * @return
	 * @throws IllegalArgumentException
	 * @throws RuntimeException
	 */
	public static Matrix multiply(Matrix A, Matrix B) throws IllegalArgumentException, RuntimeException {		
		double[][] a = A.getM();
		double[][] b = B.getM();
		
		if(a == null || b == null)
			throw new IllegalArgumentException("Matrizen können nicht null sein");
		
		if(a[0].length != b.length)
			throw new IllegalArgumentException("Matrizen sind nicht kompatibel für Matrix-Multiplication");
		
		double[][] res = new double[a.length][b[0].length];
		Matrix result = new Matrix(res);
		
		MultiplierThread[] threads = new MultiplierThread[4];
		int rowsPerThread = a.length / threads.length;
		int startRow = 0;
		
		for(int i = 0; i < threads.length; ++i) {
			threads[i] = new MultiplierThread(a, b, result, startRow, rowsPerThread + a.length % rowsPerThread);
			threads[i].start();
			startRow += rowsPerThread;
		}
		
		for (MultiplierThread thread : threads) {
			try {
				thread.join();
			} catch (InterruptedException ex) {
				throw new RuntimeException("A thread interrupted");
			}
		}
		
		return result;
	}
	
	public static Matrix multiply(double[][] a, double[][] b) throws IllegalArgumentException {
		return multiply(new Matrix(a), new Matrix(b));
	}
	
	private static class MultiplierThread extends Thread {
		private final double[][] a;
		private final double[][] b;
		private final Matrix res;
		private final int startRow;
		private final int rows;
		final Lock lock = new ReentrantLock();
		
		public MultiplierThread(double[][] a, 
								double[][] b, 
								Matrix res, 
								int startRow, 
								int rows) {
			this.a = a;
			this.b = b;
			this.res = res;
			this.startRow = startRow;
			this.rows = rows;
		}
		
		public void run() {
			for (int i = startRow; i < startRow + rows; i++) {
				for (int j = 0; j < b[0].length; j++) {
					lock.lock();
					double sum = .0;
					for (int k = 0; k < a[0].length; k++) {
						sum += a[i][k] * b[k][j];
					}
					res.set(i, j, sum);
					lock.unlock();
				}
			}
		}
	}	
}
