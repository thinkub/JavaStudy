package main.java.chapter13;

public class MethodDemo3 {
	public static void numbering() {
		int i = 0;
		while (i < 10) {
			System.out.println(i);
			i++;
		}
	}
	
	public static void main(String[] args) {
		numbering();
		numbering();
		numbering();
		numbering();
		numbering();
	}
}
