package de.lab4inf.wrb.matrix;

import java.awt.Dimension;

public class SerialMultiplier {

	public static Matrix multiply(Matrix A, Matrix B) throws IllegalArgumentException {
		Dimension dimA = A.getDim();
		Dimension dimB = B.getDim();
		
		if(dimA.width != dimB.height)
			throw new IllegalArgumentException("Matrizen sind nicht kompatibel für Matrix-Multiplication");
		
		double[][] res = new double[dimA.height][dimB.width];
		
		for(int i = 0; i < dimA.width; i++) {
			for(int j = 0; j < dimB.width; j++) {
				res[i][j] = 0;
				for(int k = 0; k < dimA.height; k++) {
					res[i][j] += A.get(i, k) * B.get(k, j);
				}
			}
		}
		
		return new Matrix(res);
	}

}
