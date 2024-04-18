package newassignment_upload;

//write a program to check whether the given string is palindrome or not



public class Assignment41 
{

	public static void main(String[] args) {
		String s1="radar";
		String reverse="";
		
		for(int i=s1.length()-1; i>=0; i--) 
		{
			char c= s1.charAt(i);
			reverse=reverse+c;
			
		}
		System.out.println(reverse);
		
		if(s1.equals(reverse)) {
			System.out.println("yes it is palindrome");
		}
		else {
			System.out.println("it is not palindrome");
		}
	}

}