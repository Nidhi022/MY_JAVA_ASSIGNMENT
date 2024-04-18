package newassignment_upload;

/*In a string "sky is 441 !@#" find out the number of special character,
alphabet,numeric,spaces we have*/



public class Assignment49
{

	public static void main(String[] args) 
	{
		String sentence="sky is 441 !@#";
		char s1[]= sentence.toCharArray();
		
		 int count_of_alpha=0;
		int count_of_numeric=0;
		int count_of_space=0;
		int count_of_specialChar=0;
		for(int i=0;i<=sentence.length()-1;i++)
		{
			boolean alphabet=Character.isAlphabetic(s1[i]);
			boolean numeric =Character.isDigit(s1[i]);
			boolean space=Character.isSpaceChar(s1[i]);
			if(alphabet==true)
			{
				count_of_alpha++;
			}
			else if (numeric==true) 
			{
				count_of_numeric++;
			}
			else if (space==true)
			{
				count_of_space++;
			}
			else
			{
				count_of_specialChar++;
			}
			
		}
		System.out.println("Count of alpha are: "+count_of_alpha);
		System.out.println("Count of numeric are: "+count_of_numeric);
		System.out.println("Count of space are: "+count_of_space);
		System.out.println("Count of count_of_specialChar are: "+count_of_specialChar);

	}

}