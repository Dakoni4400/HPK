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
		
		MultiplierThread[] threads = new MultiplierThread[3];
		int rowsPerThread = a.length / threads.length;
		int startRow = 0;
		
		for(int i = 0; i < threads.length; ++i) {
			threads[i] = new MultiplierThread(A, B, result, startRow, i);
			threads[i].start();
			startRow += rowsPerThread;
		}
		
		new MultiplierThread(A, B, result, startRow, rowsPerThread + a.length % rowsPerThread).run();
		
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
	
	public static void main(String[] args) {
		double[][] a = new double[][] {{1,2,3,4}, {2,3,4,5}, {1,2,3,4}, {2,3,4,5}};
		double[][] b = new double[][] {{1,2,1,2}, {2,3,2,3}, {3,4,3,4}, {4,5,4,5}};
		
		double[][] res1 = new double[][] {{30,40,30,40}, {40,54,40,54}, {30,40,30,40}, {40,54,40,54}};
		double[][] res2 = new double[][] {{10,16,22,28}, {16,26,36,46}, {22,36,50,64}, {28,46,64,82}};
		
		Matrix A = new Matrix(a);
		Matrix B = new Matrix(b);
		Matrix res = new Matrix(res1);
		
		Matrix test = ParallelMultiplier.multiply(A, B);
		
		assertTrue(test.equals(res));
		
		res = new Matrix(res2);
		
		test = ParallelMultiplier.multiply(B, A);
		
		System.out.print(test.equals(res));
	}
	
}
