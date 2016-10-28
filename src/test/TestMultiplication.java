package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestMultiplication {

	@Test
	public void testMultiplyTwoNumbers() {
		assertEquals(6, multiply(2,3));
	}
	
	int multiply(int a, int b) {
		return a*b;
	}
}
