package main.java.chapter08;

public class EqualStringDemo {
	public static void main(String[] args) {
		String a = "Hello World";
		String b = new String("Hello World");
		
		System.out.println(a == b);
		System.out.println(a.equals(b));
		
		String c = "Hello";
		String d = "Hello";
		
		System.out.println(c == d);
		System.out.println(c.equals(d));
	}
}
