
public class Character 
{
	private String name;
	private int age;
	private int health;
	
	public Character(String name, int age)
	{
		this.name = name;
		this.age = age;
		health = 100;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
	public int getHealth()
	{
		return health;
	}
	public void takeDamage(int damage)
	{
		health = health - damage;
	}
	
	public void attack()
	{
		System.out.println(name + " attacks!");
	}

}
