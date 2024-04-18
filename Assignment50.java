
package newassignment_upload;

//Copy the value of 1 array into another array using iteration



import java.util.Arrays;

public class Assignment50 
{

	public static void main(String[] args) 
	{
		int array1[]= new int[5];
		array1[0]=11;
		array1[1]=12;
		array1[2]=13;
		array1[3]=14;
		array1[4]=15;
		int array2[]= new int[array1.length];
		for(int i=0;i<=array1.length-1;i++)
		{
			array2[i]= array1[i];	
		}
		
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
		

	}

}
//