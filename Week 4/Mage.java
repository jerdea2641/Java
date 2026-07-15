
public class Mage extends Character 
{
	public Mage(String name, int age)
	{
		super(name, age);
	}
	
	@Override
	public void attack()
	{
		takeDamage(5);
		System.out.println(getName() + " casts a spell.");
		System.out.println("Health: " + getHealth());
	}

}
