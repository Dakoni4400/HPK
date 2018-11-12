package de.lab4inf.wrb.matrix;

import static org.junit.Assert.assertTrue;

public class ParallelMultiplier {
	
	public static Matrix multiply(Matrix A, Matrix B) throws IllegalArgumentException, RuntimeException {
		double[][] a = A.getM();
		double[][] b = B.getM();
		
		if(a == null || b == null)
			throw new IllegalArgumentException("Matrizen können nicht null sein");
		
		if(a[0].length != b.length)
			throw new IllegalArgumentException("Matrizen sind nicht kompatibel für Matrix-Multiplication");
		
		double[][] res = new double[a.length][b[0].length];
		Matrix result = new Matrix(res);
		
		// 3 Threads für das splitten. Der vierte muss kann nicht innerhalb der Schleife instanziert werden
		MultiplierThread[] threads = new MultiplierThread[3];
		int rowsPerThread = a.length / threads.length;
		int startRow = 0;
		
		for(int i = 0; i < threads.length; ++i) {
			threads[i] = new MultiplierThread(A, B, result, startRow, i);
			threads[i].start();
			startRow += rowsPerThread;
		}
		
		// Letzter Thread wird direkt gestartet
		new MultiplierThread(A, B, result, startRow, rowsPerThread + a.length % rowsPerThread).run();
		
		// Threads wieder zusammenführen
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
		private final Matrix a;
		private final Matrix b;
		private final Matrix res;
		private final int startRow;
		private final int rows;
		
		public MultiplierThread(Matrix a, 
								Matrix b, 
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
				for (int j = 0; j < b.getM()[0].length; j++) {
					double sum = .0;
					
					for (int k = 0; k < a.getM()[0].length; k++) {
						sum += a.get(i, k) * b.get(k, j);
					}
					
					res.set(i, j, sum);
				}
			}
		}

	}	
}
