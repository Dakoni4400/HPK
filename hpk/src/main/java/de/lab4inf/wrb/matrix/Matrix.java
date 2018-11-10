package de.lab4inf.wrb.matrix;

import java.awt.Dimension;

public class Matrix {
	private double[][] m;
	
	public Matrix(double[][] m) throws IllegalArgumentException{
		if(m == null)
			throw new IllegalArgumentException("Matrix kann nicht null sein");
		this.m = m;
	}
	
	public Matrix(Dimension dim) throws IllegalArgumentException{
		if(m == null)
			throw new IllegalArgumentException("Matrix kann nicht null sein");
		this.m = new double[dim.height][dim.width];
	}
	
	public Matrix(int x, int y) throws IllegalArgumentException{
		if(m == null)
			throw new IllegalArgumentException("Matrix kann nicht null sein");
		this.m = new double[x][y];
	}
	
	public Dimension getDim() {
		return new Dimension(m.length, m[0].length);
	}
	
	public double get(int x, int y) {
		return this.m[x][y];
	}
	
	public void set(int x, int y, double v) {
		this.m[x][y] = v;
	}
	
	public double[][] transpose() {
        double[][] temp = new double[this.m[0].length][this.m.length];
        for (int i = 0; i < this.m.length; i++)
            for (int j = 0; j < this.m[0].length; j++)
                temp[j][i] = this.m[i][j];
        return temp;
    }
	
	public boolean equals(Matrix B) {
		for(int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[0].length; j++) {
				if(m[i][j] != B.get(i, j))
					return false;
			}
		}
		return true;
	}
	
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
