package my_class_assignment;

public class Assignment_17 {
	
	
	static void add()
	{
		
		int a= 3;
		int b= 5;
		int c = a+b;
		System.out.println("Static method----"+ c);
	}
	
	void sub()
	{
		int a= 3;
		int b= 5;
		int c = a-b;
		System.out.println("non-static method----"+ c);
	}
	
	Assignment_17()
	{
		int a= 3;
		int b= 5;
		int c = a*b;
		System.out.println("Constructor-----"+ c);
	}
	
	

	public static void main(String[] args) {
		// Write a program with 2 Static method,2 Non-Static method,and one Constructor
		add();
		Assignment_17 a1= new Assignment_17();
		a1.sub();
		
	}

}
