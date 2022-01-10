package chapter1_3;

public class Chapter1_4 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i< 100; i++) {
			sb.append("Java");
		}
		
		String s = sb.toString();
		System.out.println(s);
		
		
		StringBuilder sb2 = new StringBuilder();
		sb2.append("hello").append("java").append("world");
		System.out.println(sb2);
		
		String str = "こんにちはJava";
		char[] data1 = str.toCharArray();
		System.out.println(data1);
	}

}
