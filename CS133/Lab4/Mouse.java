package cs.lab4;

public class Mouse 
{
	private int weight;
	private int age;
	private String color;
	private int lifeEx;
	
	public Mouse()
	{
		System.out.println("A new mouse!");
		System.out.println("A new mouse!");
		System.out.println("Cloning a mouse!");
	}
	
	public Mouse(int weight, String color, int age)
	{
		this.weight = weight;
		this.color = color;
		this.age = age;
		this.lifeEx = 28;
		
		toString();
	}
	
	public Mouse(int weight, String color)
	{
		this.weight = weight;
		this.color = color;
		
		toString();
	}
	
	public Mouse(Mouse m)
	{
		this.weight = m.weight;
		this.color = m.color;
		this.age = m.age;
		
		toString();
	}
	
	private  boolean isCloned()
	{
		if(this.age > this.lifeEx)
			return true;
		else
			return false;
	}
	
	public void evolution()
	{	
		for(int i = this.age; i < this.lifeEx; i++)
		{
			if(i >= this.lifeEx/2 && this.isCloned())
			{
				this.color = "verte";
			}
		}
	}
	
	public String toString()
	{
		
		if(this.isCloned())
		{
			return ("A " + this.color + " mouse, cloned, of " + this.age + " months and of weight " + this.weight + " grammes");
		}else
			return ("A " + this.color + " mouse of " + this.age + " months and of weight " + this.weight + " grammes");
	}
}
