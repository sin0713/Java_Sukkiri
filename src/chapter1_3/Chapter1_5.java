package chapter1_3;

public class Chapter1_5 {
	public static void main(String[] args) {
		String name = "NAMENAME";

		System.out.println(isValidPlayerName(name));

	}

	static boolean isValidPlayerName(String name) {
		if (name.length() != 8) {
			return false;
		}

		char first = name.charAt(0);
		if(!(first >= 'A' && first <= 'Z')) {
			return false;
		}

		for(int i = 1; i < 8; i++) {
			char c = name.charAt(i);
			if(!((c >= 'A' && c <= 'z') || (c >= '0' && c <= '9'))) {
				return false;
			}
		}

		return true;
	}

}
