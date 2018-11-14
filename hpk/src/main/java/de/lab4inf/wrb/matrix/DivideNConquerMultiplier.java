package de.lab4inf.wrb.matrix;

import java.util.ArrayList;

public class DivideNConquerMultiplier {
	
	public static Matrix multiply(Matrix A, Matrix B) throws IllegalArgumentException, RuntimeException {
		/*
		 * Fehlerbehandlung
		 */
		
		if(A.getM() == null || B.getM() == null)
			throw new IllegalArgumentException("Matrizen können nicht null sein");
		
		if(A.getCols() != B.getRows())
			throw new IllegalArgumentException("Matrizen sind nicht kompatibel für Matrix-Multiplication");
		
		/**
		 * Setup
		 */
		
		Matrix C = new Matrix(A.getRows(), B.getCols());
		
		Matrix[][] splitA = split(A);
		Matrix[][] splitB = split(B);
		Matrix[][] splitC = split(C);
		Matrix[][][] temp = new Matrix[4][4][2];
		
		ArrayList<MultiplyThread> mulThreads = new ArrayList<>();
		
		/**
		 * Paralleler 1. Teil 
		 */
		
		for(int j = 0; j < 2; j++) {
			for(int k = 0; k < 2; k++) {
				MultiplyThread thread1 = new MultiplyThread(splitA[j][1], splitB[1][k], temp[j][k][1]);
				MultiplyThread thread2 = new MultiplyThread(splitA[j][2], splitB[2][k], temp[j][k][2]);
				mulThreads.add(thread1);
				mulThreads.add(thread2);
				thread1.start();
				thread2.start();
			}
		}
		
		/**
		 * Zusammenführen 1. Teil
		 */
		
		for(MultiplyThread thread : mulThreads) {
			try {
				thread.join();
			} catch (InterruptedException e) {
				throw new RuntimeException("MultiplyThread got interrupted!");
			}
		}
		
		/**
		 * Paralleler 2. Teil
		 */
		
		ArrayList<AddThread> addThreads = new ArrayList<>();
		for(int j = 0; j < 2; j++) {
			for(int k = 0; k < 2; k++) {
				AddThread thread = new AddThread(temp[j][k][1], temp[j][k][2], splitC[j][k]);
				addThreads.add(thread);
				thread.start();
			}
		}
		
		/**
		 * Merge 2. Teil
		 */
		
		for(AddThread thread : addThreads) {
			try {
				thread.join();
			} catch (InterruptedException e) {
				throw new RuntimeException("AddThread got Interrupted");
			}
		}
		
		return merge(splitC);
	}
	
	/**
	 * Adds two matrices with the same dimensions
	 * @param A
	 * @param B
	 * @return
	 */
	private static Matrix add(Matrix A, Matrix B) throws IllegalArgumentException {
		if(!(A.getRows() == B.getRows() && A.getCols() == B.getCols()))
			throw new IllegalArgumentException("Matrizen haben nicht die gleiche Größe!");
		
		Matrix res = new Matrix(A.getRows(), A.getCols());
		
		for(int i = 0; i < A.getCols(); i++) {
			for(int j = 0; j < A.getRows(); j++) {
				res.set(i, j, A.get(i, j) + B.get(i, j));
			}
		}
		
		return res;
	}
	
	/**
	 * Splits the Matrix A into 4 
	 * @param A
	 * @return
	 */
	public static Matrix[][] split(Matrix A) {
		Matrix[][] res = new Matrix[2][2];
		
		double[][] a = A.getM();
		
		int splitLength1 = a.length / 2;
		int splitLength2 = a.length - splitLength1;
		
		double[][] a11 = new double[splitLength1][splitLength1];
		double[][] a12 = new double[splitLength1][splitLength2];
		double[][] a21 = new double[splitLength2][splitLength1];
		double[][] a22 = new double[splitLength2][splitLength2];
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[0].length; i++) {
				if(i < splitLength1) 
					if(j < splitLength1)
						a11[i][j] = a[i][j];
					else
						a12[i][j - splitLength1] = a[i][j];
				else
					if(j < splitLength1)
						a21[i - splitLength2][j] = a[i][j];
					else
						a22[i - splitLength2][j - splitLength1] = a[i][j];
			}
		}
		res[1][1] = new Matrix(a11);
		res[1][2] = new Matrix(a12);
		res[2][1] = new Matrix(a21);
		res[2][2] = new Matrix(a22);
		
		return res;
	}
	
	public static Matrix merge(Matrix[][] mat) {
		int rows = mat[1][1].getRows() + mat[2][1].getRows();
		int cols = mat[1][1].getCols() + mat[1][2].getCols();
		
		int splitLength1 = rows / 2;
		int splitLength2 = rows - splitLength1;
		
		double[][] res = new double[rows][cols];
		
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				if(i < splitLength1) 
					if(j < splitLength1)
						res[i][j] = mat[1][1].getM()[i][j];
					else
						res[i][j] = mat[1][2].getM()[i][j - splitLength1];
				else
					if(j < splitLength1)
						res[i][j] = mat[2][1].getM()[i - splitLength2][j];
					else
						res[i][j] = mat[2][2].getM()[i - splitLength2][j - splitLength1];
			}
		}
		
		return new Matrix(res);
	}
	
	/**
	 * Thread für die 8 Multiplikationen
	 * @author Till Kobbe
	 *
	 */
	private static class MultiplyThread extends Thread {
		private final Matrix A;
		private final Matrix B;
		private Matrix C;
		
		public MultiplyThread(Matrix A, Matrix B, Matrix C) {
			this.A = A;
			this.B = B;
			this.C = C;
		}
		
		@Override
		public void run() {
			C = SerialMultiplier.multiply(A, B);
		}
	}
	
	/**
	 * Thread für das addieren der Matrizen
	 * @author Till Kobbe
	 *
	 */
	private static class AddThread extends Thread {
		private final Matrix A;
		private final Matrix B;
		private Matrix C;
		
		public AddThread(Matrix A, Matrix B, Matrix C) {
			this.A = A;
			this.B = B;
			this.C = C;
		}
		
		@Override
		public void run() {
			C = add(A,B);
		}
	}
}
