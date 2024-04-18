package newassignment_upload;

//In a string "mango" calculate how many are alpha and how many are numeric


import java.util.Arrays;

public class Assignment48 
{

	public static void main(String[] args) 
	{
		String word="mango";
		char a[]=word.toCharArray();
		int count_of_alpha=0;
		int count_of_numeric=0;
		for(int i=0;i<=word.length()-1;i++)
		{
			boolean alphabet=Character.isAlphabetic(a[i]);
		
			if (alphabet==true)
			{
				count_of_alpha++; 
			}
			
			else 
			{
				count_of_numeric++;
				
			}
			
		}
		System.out.println("Count of alpha are: "+count_of_alpha);
		System.out.println("Count of numeric are: "+count_of_numeric);
		
	}

}