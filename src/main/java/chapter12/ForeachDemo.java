package main.java.chapter12;

public class ForeachDemo {
	public static void main(String[] args) {
		
		String[] members = {"Ming", "Carrot", "Jade", "Dustin", "Saera", "MJ"};
		for (String e : members) {
			System.out.println(e + "이 상담을 받았습니다.");
		}
	}
}
