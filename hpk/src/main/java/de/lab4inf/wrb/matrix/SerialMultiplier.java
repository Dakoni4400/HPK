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
		
		for(int rowA = 0; rowA < a.length; rowA++) {
			for(int colB = 0; colB < b[0].length; colB++) {
				res[rowA][colB] = 0;
				for(int colA = 0; colA < a[0].length; colA++) {
					res[rowA][colB] += a[rowA][colA] * b[colA][colB];
				}
			}
		}
		
		return new Matrix(res);
	}

}
