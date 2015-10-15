package main.java.chapter17;

class Calculator {
	static double PI = 3.14;
	static final double PI2 = 3.33;
	int left, right;
	
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
		System.out.println(this.left + this.right);
	}
	
	public void avg() {
		System.out.println((this.left + this.right) / 2);
	}
}

public class CalculatorDemo1 {
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		System.out.println(c1.PI);
		
		Calculator c2 = new Calculator();
		System.out.println(c2.PI);
		
		System.out.println(Calculator.PI);
		
		Calculator.PI = 3.15;
		
		System.out.println(Calculator.PI);
		System.out.println(c1.PI);
		System.out.println(c2.PI);
		
//		Calculator.PI2 = 3.14;
		
	}
}
