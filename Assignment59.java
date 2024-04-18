package nidhi_assignment;

//Write s program  for an exception with 5 catches and 1 finally block



public class Assignment59 
{

	public static void main(String[] args) 
	{
		int a=9;
		try
		{
			double div=a/0;
			System.out.println(div);
		}
		catch( NullPointerException exc1)
		{
			System.out.println("NullPointerException");
		}
		
		catch(ArrayIndexOutOfBoundsException exc2)
		{
			System.out.println("ArrayIndexOutOfBoundsException");
		}
		
		catch(ArithmeticException exc3)
		{
			System.out.println("ArithmeticException");
		}
		catch(StringIndexOutOfBoundsException exc4)
		{
			System.out.println("StringIndexOutOfBoundsException");
		}
		catch(NumberFormatException exc5)
		{
			System.out.println("NumberFormatException");
		}
		finally
		{
			System.out.println("irrespective of any try-catch block, finally block will always execute");
		}

	}

}