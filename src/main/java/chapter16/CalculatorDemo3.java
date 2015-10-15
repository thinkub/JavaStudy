package main.java.chapter16;

public class CalculatorDemo3 {
	public static void avg(int left, int right) {
		System.out.println((right + left) / 2);
	}
	
	public static void sum(int left, int right) {
		System.out.println(left + right);
	}
	
	public static void main(String[] args) {
		int left, right;
		
		left = 10;
		right = 20;
		
		sum(left, right);
		avg(left, right);
		
		left = 20; 
		left = 40;
		
		sum(left, right);
		avg(left, right);
	}
}
