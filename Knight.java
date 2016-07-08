
public class Knight 
{
	private String kName;
	private String kAge;
	private String kHealth;
	private String kBattle;
	private String kGold;
	
	public Knight(String name, String age, String health, String numOfBatt, String gold)
	{
		kName = name;
		kAge = age;
		kHealth = health;
		kBattle = numOfBatt;
		kGold = gold;
	}
	
	public void setKnight(String name, String age, String health, String numOfBatt, String gold)
	{
		kName = name;
		kAge = age;
		kHealth = health;
		kBattle = numOfBatt;
		kGold = gold;
	}
	
	public String getKnightName()
	{
		return kName;
	}
	
	public String getKnightAge()
	{
		return kAge;
	}
	
	public String getKnightHealth()
	{
		return kHealth;
	}
	
	public String getKnightBattle()
	{
		return kBattle;
	}
	
	public String getKnightGold()
	{
		return kGold;
	}
	
	public void displayKnight()
	{
		System.out.printf("Knight Name: %s\nKnight Health: %s\nKnight Battles: %s\nKnight Age: %s\nKnight Gold: $%s\n", kName, kHealth, kBattle, kAge, kGold);	
	}
}
