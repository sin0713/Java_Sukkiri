package chapter1_3;

public class Chapter1_6 {
	public static void main(String[] args) {
		String name = "NAMENAME";
		System.out.println(isValidPlayerName(name));
		
		String s = "Java";
		
		System.out.println(s.matches("Java")); 
		
		System.out.println(s.matches("J.va"));
		
		System.out.println("Jaaaaaaaaaaava".matches("Ja*va"));
		
		System.out.println("Math".matches("Ma.*"));
		
		System.out.println("URI".matches("UR[LIN]"));
		System.out.println("-----------------------------");
		
		System.out.println("URL".matches("[A-Z]{3}"));
		
	}
	
	static boolean isValidPlayerName(String name) {
		return name.matches("[A-Z][A-Z0-9]{7}");
	}

}
