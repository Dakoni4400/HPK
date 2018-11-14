package de.lab4inf.wrb.matrix;

import java.util.ArrayList;

public class ParallelMultiplier {
	
	public static Matrix multiply(double[][] a, double[][] b) throws IllegalArgumentException, RuntimeException {
		return multiply(new Matrix(a), new Matrix(b));
	}
	
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
		/*
		 * Fehlerbehandlung
		 */
		
		if(A.getM() == null || B.getM() == null)
			throw new IllegalArgumentException("Matrizen können nicht null sein");
		
		if(A.getCols() != B.getRows())
			throw new IllegalArgumentException("Matrizen sind nicht kompatibel für Matrix-Multiplication");
		
		/*
		 * Setup
		 */
		
		Matrix D = B.transpose();
		
		Matrix res = new Matrix(A.getRows(), B.getCols());
		
		ArrayList<MultiplyThread> threads = new ArrayList<>();
		
		for(int i = 0; i < A.getRows(); i++) {
			MultiplyThread thread = new MultiplyThread(i, B.getCols(), A, D, res);
			threads.add(thread);
			thread.start();
		}
		
		for(MultiplyThread thread : threads) {
			try {
				thread.join();
			} catch (InterruptedException e) {
				throw new RuntimeException("Thread got interrupted!");
			}
		}
		
		return res;
	}	
	
	private static class MultiplyThread extends Thread {
		private final int i;
		private final int b_col;
		private final Matrix A;
		private final Matrix D;
		private final Matrix res;
		
		public MultiplyThread(int i, int b_col, Matrix A, Matrix D, Matrix res)  {
			this.i = i;
			this.b_col = b_col;
			this.A = A;
			this.D = D;
			this.res = res;
		}
		
		@Override
		public void run() {
			for(int j = 0; j < b_col; j++) {
				double sum = .0;
				for(int k = 0; k < A.getCols(); k++) {
					sum += A.get(i, k) * D.get(j, k);
				}
				res.set(i, j, sum);
			}
		}
	}
}
