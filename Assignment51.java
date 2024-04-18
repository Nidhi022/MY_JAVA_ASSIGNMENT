package newassignment_upload;

//check if the given string contains space



public class Assignment51 
{

	public static void main(String[] args) 
	{
		String name="abhishek dubey";
		char n1[]=name.toCharArray();
     for(int i=0;i<=name.length()-1;i++)
     {
  	   boolean answer=Character.isSpaceChar(n1[i]);
   // System.out.println(answer);
    if (answer==true)
    {
		System.out.println("At index "+ i + " Given String contains space.");
	}
    
     }
		
		}

}