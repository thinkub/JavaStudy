package main.java.chapter06;

public class ExplicitConversionDemo {
	public static void main(String[] args) {
//		float a = 100.0;
//		int b = 100.0f;
		
		float a = (float)100.0;
		int b = (int)100.0f;
		byte c = (byte)128;
		
		System.out.println(c);
	}
}
