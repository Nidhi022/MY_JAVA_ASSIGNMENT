package my_class_assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment_44 {

	public static void main(String[] args) {
		int age[] = new int[3];
		
		
		Scanner s1= new Scanner(System.in);
		
		for(int i=0;i<=2;i++) {
			 age[i]= s1.nextInt();
		}
		 
		 Arrays.sort(age);
		 System.out.println(Arrays.toString(age));
		
		
		
	
		
		
		
		
	

	}

}
