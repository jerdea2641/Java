
public class Warrior extends Character 
{
	public Warrior(String name, int age)
	{
		super(name, age);
	}
	
	@Override
	public void attack()
	{
		takeDamage(10);
		System.out.println(getName() + " attacks with a sword!");
		System.out.println("Health: " + getHealth());
	}

}
