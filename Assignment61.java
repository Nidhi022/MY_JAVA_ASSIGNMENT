package nidhi_assignment;

/*WAP by upcasting from Experience Student class to Mentor Class and downcasting from Experience Student Class
to Student Class with four classes of Student, Experience Student,Mentor and Teacher*/


class Teacher
{
void teachermtd()
{
	System.out.println("teacher class");
}
}
class Mentor extends Teacher
{
	void mentormtd()
	{
		System.out.println("mentor class");
	}
}
class expStudent extends Mentor
{
	void add()
	{
     System.out.println("experience student class");
	}

}

public class Assignment61 extends expStudent
{
 void studentmtd()
 {
	 System.out.println("student method ");
 }
	public static void main(String[] args) 
	{
		Mentor m1=new expStudent();
		m1.teachermtd();
		m1.mentormtd();
		expStudent ex_stud1=new Assignment61();//upcating 
		
		Assignment61 a1=(Assignment61) ex_stud1;
		a1.studentmtd();
		a1.teachermtd();
		a1.mentormtd();
	    a1.add();
		

	}
	
	}