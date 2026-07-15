
public class Player {

	private String name;
	private int age;
	private String weapon;
	private double health;
	private double energy;
	
	public Player(String name, int age, String weapon, double health, double energy)
	{
		this.name = name;
		this.age = age;
		this.weapon = weapon;
		this.health = health;
		this.energy = energy;
	}
	
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	public String getWeapon()
	{
		return weapon;
	}
	public double getHealth()
	{
		return health;
	}
	public double getEnergy()
	{
		return energy;
	}
	
	public void setHealth(double health)
	{
		this.health = health;
	}
	
	public void setEnergy(double energy)
	{
		this.energy = energy;
	}
}
