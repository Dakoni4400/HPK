package de.lab4inf.wrb.matrix;

import java.awt.Dimension;
import java.util.Random;

/**
 * This class represents a matrix via a 2-dimensional array
 * 
 * @author Till Kobbe
 *
 */
public class Matrix {
	/**
	 * The array with the matrix-values
	 */
	private double[][] m;
	
	/**
	 * Takes an array and creates a matrix with it
	 * 
	 * @param m Array of the matrix
	 * @throws IllegalArgumentException
	 */
	public Matrix(double[][] m) throws IllegalArgumentException{
		if(m == null)
			throw new IllegalArgumentException("Matrix kann nicht null sein");
		this.m = m;
	}
	
	/**
	 * Takes a Dimension and creates a matrix with it
	 * 
	 * @param dim Dimension of the matrix
	 * @throws IllegalArgumentException
	 */
	public Matrix(Dimension dim) throws IllegalArgumentException{
		if(m == null)
			throw new IllegalArgumentException("Matrix kann nicht null sein");
		this.m = new double[dim.width][dim.height];
	}
	
	/**
	 * Takes values for the dimension of matrix and creates a matrix with them
	 * 
	 * @param x 
	 * @param y
	 * @throws IllegalArgumentException
	 */
	public Matrix(int x, int y) throws IllegalArgumentException{
		if(m == null)
			throw new IllegalArgumentException("Matrix kann nicht null sein");
		this.m = new double[x][y];
	}
	
	/**
	 * Returns the array of the matrix
	 * @return
	 */
	public double[][] getM() {
		return m;
	}
	
	/**
	 * Sets the array of the matrix
	 * @param m
	 */
	public void setM(double[][] m) {
		this.m = m;
	}
	
	/**
	 * Returns the Dimension of the matrix
	 * @return
	 */
	public Dimension getDim() {
		return new Dimension(m.length, m[0].length);
	}
	
	/**
	 * Returns the value M(x,y)
	 * 
	 * @param x
	 * @param y
	 * @return
	 */
	public double get(int x, int y) {
		return this.m[x][y];
	}
	
	/**
	 * Sets the value M(x,y) = v
	 * 
	 * @param x
	 * @param y
	 * @param v
	 */
	public void set(int x, int y, double v) {
		this.m[x][y] = v;
	}
	
	/**
	 * Transposes the matrix
	 */
	public void transpose() {
        double[][] temp = new double[this.m[0].length][this.m.length];
        for (int i = 0; i < this.m.length; i++)
            for (int j = 0; j < this.m[0].length; j++)
                temp[j][i] = this.m[i][j];
        setM(temp);
    }
	
	/**
	 * Checks if this matrix is equal to another matrix
	 * @param B
	 * @return
	 */
	public boolean equals(Matrix B) {
		for(int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[0].length; j++) {
				if(m[i][j] != B.get(i, j))
					return false;
			}
		}
		return true;
	}
	
	/**
	 * Returns a matrix with random values in the given size
	 * 
	 * @param rows
	 * @param cols
	 * @param random
	 * @return
	 */
	public Matrix getRandomMatrix(int rows, int cols, Random random) {
		Matrix m = new Matrix(rows, cols);
		
		for (int x = 0; x < cols; ++x) {
			for(int y = 0; y < rows; ++y) {
				m.set(x, y, random.nextDouble());
			}
		}
		
		return m;
	}
	
	/**
	 * Converts the matrix to a String
	 */
	@Override
	public String toString() {
		String ret = "";
		for(int i = 0; i < m.length; i++) {
			ret += "| ";
			for(int j = 0; j < m[0].length; j++) {
				ret += m[i][j] + " ";
			}
			ret += " |\n";
		}
		return ret;
	}
}
