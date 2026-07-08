
public class Mage extends Character 
{
	public Mage(String name, int age)
	{
		super(name, age);
	}
	
	@Override
	public void attack()
	{
		System.out.println(getName() + " casts a spell.");
	}

}
