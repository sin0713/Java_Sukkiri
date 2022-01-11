package chapter1_3;

public class Chapter1_7 {
	public static void main(String[] args) {
		String s = "abc,def:ghi";
		String[] words = s.split("[,:]");
		for(String w : words) {
			System.out.println(w + "->");
		}
	}

}
