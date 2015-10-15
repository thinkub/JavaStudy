package main.java.chapter12;

public class LengthDemo {
	
	static int a;
	static char b;
	
	public static void main(String[] args) {
		
		
		System.out.println("[" + b + "]");
		System.out.println((int)b);
		System.out.println(a);
		
		String[] classGroup = new String[6];
		System.out.println(classGroup[0]);
		classGroup[0] = "Ming";
		System.out.println(classGroup.length);
		classGroup[1] = "Carrot";
		System.out.println(classGroup.length);
		classGroup[2] = "Jade";
		System.out.println(classGroup.length);
		classGroup[3] = "Dustin";
		System.out.println(classGroup.length);
		classGroup[4] = "Saera";
		System.out.println(classGroup.length);
		classGroup[5] = "MJ";
		System.out.println(classGroup.length);
		
	}
}
