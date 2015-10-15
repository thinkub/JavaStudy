package main.java.chapter07;

public class ConcatDemo {
	public static void main(String[] args) {
		String firstString = "This is";
		String secondString = " a concatenated string.";
		String thirdString = firstString + secondString;
		System.out.println(thirdString);
		
		String a = "This is ";
		int b = 11;
		String c = a + b;
		
		System.out.println(c);
		
		System.out.println(String.valueOf('A') + 24);
				
	}
}
