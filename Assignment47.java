package newassignment_upload;

//In  a string "mango123" check which character is numeric and which is alpha



import java.util.Arrays;
import java.util.Iterator;

public class Assignment47 
{

	public static void main(String[] args) 
	{
		String name="mango123";
		char n1[]=name.toCharArray();
		System.out.println(Arrays.toString(n1));
		for(int i=0;i<=name.length()-1;i++)
		{
	boolean answer=	Character.isAlphabetic(n1[i]);
	//System.out.println(answer);
	if (answer==true)
	{
	System.out.println("index position "+i+" is alpha");	
	}
	else 
	{
		System.out.println("index position " +i+" is numeric");	
	}
		}
		

	}

}