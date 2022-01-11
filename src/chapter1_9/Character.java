package chapter1_9;

public class Character {
	private String name;
	private String job;
	private int gold;
	
	public Character(String name, String job, int gold) {
		this.name = name;
		this.job = job;
		this.gold = gold;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getJob() {
		return this.job;
	}
	
	public int getGold() {
		return this.gold;
	}


}
