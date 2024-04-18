package newassignment_upload;

/*write a program using this keyword to assign the value of a LV(local variable) 
to GV(global variable)*/


public class Assignment36 
{
 int salary;
 void add()
 {
	 int salary=100000;
	 this.salary=salary;
	 
 }
	public static void main(String[] args) 
	{
		Assignment36 a1=new Assignment36();
		a1.add();
		System.out.println(a1.salary);

	}

}