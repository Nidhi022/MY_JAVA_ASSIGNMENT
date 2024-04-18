package nidhi_assignment;

//Write a program to demonstrate this calling statement



public class Assignment65
{
	Assignment65()
	{
		System.out.println("Constructor1");
	}
	
	Assignment65 (int a)
	{
		this();
		System.out.println("Constructor2");
	}
	
	Assignment65 (int a, double d)
	{
		this(7);
		System.out.println("Constructor3");
	}
	
	public static void main(String[] args) 
	{
		new Assignment65(5,2.2);

	}

}