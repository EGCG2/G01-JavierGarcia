package main;

public class Sum {

	public static int sum(int a, int b) {
		return a+b;
	}
	
	public static int sum(int a, int b, int c) {
		return sum(sum(a,b), c);
	}
}
