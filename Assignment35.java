package newassignment_upload;

class Parent_Overridden
{
	void add()
	{
		System.out.println("method1");
	}
}

public class Assignment35 extends Parent_Overridden
{

	void mtd_add()
	{
		super.add();
		System.out.println("method2");
	}
	public static void main(String[] args) 
	{
		System.out.println("Main method");
		Assignment35 a1=new Assignment35();
		a1.add();
		

	}

}