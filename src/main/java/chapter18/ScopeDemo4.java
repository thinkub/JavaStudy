package main.java.chapter18;

public class ScopeDemo4 {

	static void a() {
		String title = "coding everybody";
	}
	
	public void main (String[] args) {
		a();
//		System.out.println(title);
	}
}
