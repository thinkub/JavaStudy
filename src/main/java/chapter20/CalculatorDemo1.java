package main.java.chapter20;

class Calculator {
	int left, right;
	
	public void setOperands(int left, int right) {
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

class SubstractionableCalculator extends Calculator {
	
	public void substract() {
		System.out.println(this.left - this.right);
	}
}

public class CalculatorDemo1 {

	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.setOperands(10, 20);
		c1.sum();
		c1.avg();
		
		SubstractionableCalculator c2 = new SubstractionableCalculator();
		c2.setOperands(30, 10);
		c2.sum();
		c2.avg();
		c2.substract();
		
	}
}
