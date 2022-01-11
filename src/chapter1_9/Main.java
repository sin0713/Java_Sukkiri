package chapter1_9;

public class Main {
	public static void main(String[] args) {
		Character hero = new Character("shin", "戦士", 1000);
		
		final String FORMAT = "%-9s %-13s 所持金%,6d";
		String s = String.format
				(FORMAT, hero.getName(), hero.getJob(), hero.getGold());
		System.out.println(s);
		
		System.out.printf("製品番号 %s-%02d", "SJV", 3);
	}

}
