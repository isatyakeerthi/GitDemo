package test;

public abstract class MaheshPhone {
	
	public void call()
	{
		System.out.println("Calling...");
	}
	
	  public abstract void dance();
	  public abstract void move(); 
	  public abstract void cook();
}

abstract class RameshPhone extends MaheshPhone
{
	public void move()
	{
		System.out.println("moving...");
	}
}

class SureshPhone extends RameshPhone
{

	public void dance() 
	{
		System.out.println("Dancing...");
		
	}

	
	public void cook()
	{
		System.out.println("Cooking...");
		
	}
	
}
