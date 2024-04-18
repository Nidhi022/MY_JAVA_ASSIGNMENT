package newassignment_upload;

//Write a program to call the parent class constructor using super calling statement

class ParentConstructor
{
	 ParentConstructor()
	 {
		System.out.println("Calling parent class constructor"); 
	 }
}

public class Assignment34 extends ParentConstructor
{
	Assignment34()
	{
		super();
		System.out.println("Child class constructor");
	}
	
	public static void main(String[] args) 
	{
		System.out.println("This is main method");
		Assignment34 a1=new Assignment34();
		
	}

}