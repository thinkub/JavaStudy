package main.java.chapter21;

class Calculator1 {
    int left, right;
     
//    public Calculator1(){}
     
    public Calculator1(int left, int right){
        this.left = left;
        this.right = right;
    }
     
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
class SubstractionableCalculator1 extends Calculator1 {
    public SubstractionableCalculator1(int left, int right) {
        super(left, right);
    }
 
    public void substract() {
        System.out.println(this.left - this.right);
    }
}
 
public class CalculatorConstructorDemo5 {
    public static void main(String[] args) {
        SubstractionableCalculator1 c1 = new SubstractionableCalculator1(10, 20);
        c1.sum();
        c1.avg();
        c1.substract();
    }
}
