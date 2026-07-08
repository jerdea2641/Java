
public class Warrior extends Character 
{
	public Warrior(String name, int age)
	{
		super(name, age);
	}
	
	@Override
	public void attack()
	{
		System.out.println(getName() + "attacks with a sword!");
	}

}
