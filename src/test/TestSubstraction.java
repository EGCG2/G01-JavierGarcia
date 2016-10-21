package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.Substraction;

public class TestSubstraction {

	@Test
	public void testSubstract2Number() {
		assertEquals(6, substract(10,4));
	}
	
	@Test
	public void testSubstractWithZero() {
		assertEquals(4, substract(8, 4));
		assertEquals(4, substract(4, 0));
	}
	
	@Test
	public void testSubstractWithNegatives() {
		assertEquals(10, substract(8, -2));
		assertEquals(-7, substract(-10, -3));
	}
	
	@Test
	public void testCommutativeProperty() {
		assert(substract(5,3) != substract(3,5));
	}
	
	int substract(int a, int b) {
		return Substraction.substract(a,b);
	}
}
