package main.java.chapter13;

public class ReturnDemo4 {

	public static String[] getMembers(String[] members1) {
//        String[] members = { "최진혁", "최유빈", "한이람" };
        return members1;
    }
 
    public static void main(String[] args) {
//    	String[] members1 = { "최진혁", "최유빈", "한이람" };
        String[] members = getMembers(new String[]{ "최진혁", "최유빈", "한이람" });
        
        for (int i = 0; i < members.length; i++) {
        	members[i].toString();
        	System.out.println(members[i]);
        }
        
        for(String s : members) {
        	System.out.println(s);
        }
    }
}
