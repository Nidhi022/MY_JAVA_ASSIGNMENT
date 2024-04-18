package newassignment_upload;

//write a program in Array by getting the size of an array using Scanner class?



import java.util.Scanner;

public class Assignment45 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array"); 
		
		int size=sc.nextInt();
		int array1[]=new int[size];
	for(int i=0;i<array1.length;i++)
	{
		System.out.println("Enter value");
		array1[i]=sc.nextInt();
	}
		System.out.println("Size of an array is:" +size);

	}

}