package chapter1_3;

public class Main {
	public static void main(String[] args) {
		String s1 = "Java programming";
		System.out.println("文字列s1の4文字目以降は" + s1.substring(3));
		System.out.println("文字列s1の4-8文字目は" + s1.substring(3, 8));
		System.out.println("---------------------");
		
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
	}

}
