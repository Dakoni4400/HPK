package de.lab4inf.wrb.matrix;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SerialMultiplicationTest {
	@Before
	public void setUp() {
		
	}
	
	@After
	public void tearDown() {
		
	}
	
	@Test
	public void testSimpleSerialMultiplication() {
		double[][] a = new double[][] {{1,2,3,4}, {2,3,4,5}, {1,2,3,4}, {2,3,4,5}};
		double[][] b = new double[][] {{1,2,1,2}, {2,3,2,3}, {3,4,3,4}, {4,5,4,5}};
		
		double[][] res1 = new double[][] {{30,40,30,40}, {40,54,40,54}, {30,40,30,40}, {40,54,40,54}};
		
		Matrix A = new Matrix(a);
		Matrix B = new Matrix(b);
		Matrix res = new Matrix(res1);
		
		Matrix test = SerialMultiplier.multiply(A, B);
		
		assertTrue(test.equals(res));
	}
	
	@Test
	public void testIdentitySerialMultiplication() {
		double[][] a = new double[][] {{1,2,3,4}, {2,3,4,5}, {1,2,3,4}, {2,3,4,5}};
		double[][] b = new double[][] {{1,0,0,0}, {0,1,0,0}, {0,0,1,0}, {0,0,0,1}};
		
		double[][] res1 = new double[][] {{1,2,3,4}, {2,3,4,5}, {1,2,3,4}, {2,3,4,5}};
		
		Matrix A = new Matrix(a);
		Matrix B = new Matrix(b);
		Matrix res = new Matrix(res1);
		
		Matrix test = SerialMultiplier.multiply(A, B);
		
		assertTrue(test.equals(res));
	}
	
	@Test
	public void testZeroSpace() {
		double[][] a = new double[][] {{1,2,3,4}, {2,3,4,5}, {1,2,3,4}, {2,3,4,5}};
		double[][] b = new double[][] {{0,0,0,0}, {0,0,0,0}, {0,0,0,0}, {0,0,0,0}};
		
		double[][] res1 = new double[][] {{0,0,0,0}, {0,0,0,0}, {0,0,0,0}, {0,0,0,0}};
		
		Matrix A = new Matrix(a);
		Matrix B = new Matrix(b);
		Matrix res = new Matrix(res1);
		
		Matrix test = SerialMultiplier.multiply(A, B);
		
		assertTrue(test.equals(res));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testIllegalSerialMultiplication() {
		double[][] a = new double[][] {{1,2,3,4}, {2,3,4,5}, {1,2,3,4}, {2,3,4,5}};
		double[][] b = new double[][] {{1}, {2}, {3}, {4}};
		
		Matrix A = new Matrix(a);
		Matrix B = new Matrix(b);
		
		Matrix res = SerialMultiplier.multiply(A, B);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testNullMultiplication() {
		double[][] a = new double[][] {{1},{2}};
		double[][] b = null;
		
		Matrix A = new Matrix(a);
		Matrix B = new Matrix(b);
		
		Matrix res = SerialMultiplier.multiply(A, B);
	}
}
