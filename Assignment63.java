package nidhi_assignment;

//WAP for Assert key word



import java.util.Scanner;

public class Assignment63 
{

	public static void main(String[] args) 
	{ 
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter value of a");
		int age=sc.nextInt();
		assert age>18:"Assertion failure: Person is unable to vote as age is less than 18";
		System.out.println("Person is able to vote");
		

	}

}