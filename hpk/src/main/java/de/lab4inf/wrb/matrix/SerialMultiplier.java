package de.lab4inf.wrb.matrix;

public class SerialMultiplier {

	public static Matrix multiply(Matrix A, Matrix B) throws IllegalArgumentException {
		return multiply(A.getM(), B.getM());
	}
	
	public static Matrix multiply(double[][] a, double[][] b) throws IllegalArgumentException {
		if(a == null || b == null)
			throw new IllegalArgumentException("Matrizen können nicht null sein");
		
		if(a[0].length != b.length)
			throw new IllegalArgumentException("Matrizen sind nicht kompatibel für Matrix-Multiplication");
		
		double[][] res = new double[a.length][b[0].length];
		
		for(int i = 0; i < a[0].length; i++) {
			for(int j = 0; j < b[0].length; j++) {
				res[i][j] = 0;
				for(int k = 0; k < a.length; k++) {
					res[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		
		return new Matrix(res);
	}

}
