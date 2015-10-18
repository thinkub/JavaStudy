package main.java.chapter20;

class DivisonableCalculator extends SubstractionableCalculator {
	
	public void divisoin() {
		System.out.println(this.left / this.right);
	}
}

public class CalculatorDemo2  {
	public static void main(String[] args) {
		DivisonableCalculator c1 = new DivisonableCalculator();
		
		c1.setOperands(100, 10);
		c1.sum();
		c1.avg();
		c1.substract();
		c1.divisoin();
	}
}
