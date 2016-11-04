package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.Multiplication;

public class TestMultiplication {

	@Test
	public void testMultiply2Numbers() {
<<<<<<< HEAD
		assertEquals(6, Multiply(3,2));
=======
		assertEquals(12, Multiply(4,3));
>>>>>>> ramaconflictiva
	}
	
	@Test
	public void testMultiplyWithZero() {
		assertEquals(0, Multiply(0, 4));
		assertEquals(0, Multiply(4, 0));
	}
	
	@Test
	public void testMultiplyWithNegatives() {
		assertEquals(-10, Multiply(5, -2));
	}
	
	int Multiply(int a, int b) {
		return Multiplication.multiply(a,b);
	}
}
