package javaOOP;

public class Topic_04_Overloading {

	public static int plusMethod(int x, int y) {
		return x + y;
	}

	public static double plusMethod(double x, double y) {
		return x + y;
	}

	public static void main(String[] args) {
		System.out.println(plusMethod(4, 5));
		System.out.println(plusMethod(4.5, 5.2));

	}
}
