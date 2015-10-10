package main.java.chapter06;

public class ImplicitConversionDemo {
	public static void main(String[] args) {
		double a = 3.0f;

		//float b = 3.0;
		// byte < short, char < int < long < float < double
		
		int b = 3;
		float c = 1.0f;
		double d = b + c;
		System.out.println(d);
	}
}
