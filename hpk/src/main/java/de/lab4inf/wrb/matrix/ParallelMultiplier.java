package de.lab4inf.wrb.matrix;

public class ParallelMultiplier {
	
	/**
	 * Parallele Matrizenmultiplikation für die Matrizen A, B
	 * 
	 * BUG: Erste Zeile in der Ergebnismatrix ist komplett 0!
	 * 
	 * TRYED:
	 *  - Letzen Thread auch joinen -> Kein Erfolg
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
			threads[i] = new MultiplierThread(A, B, result, startRow, rowsPerThread + a.length % rowsPerThread);
			threads[i].start();
			startRow += rowsPerThread;
		}
		
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
					synchronized(res) {
						res.set(i, j, sum);
					}
				}
			}
		}

	}	
}
