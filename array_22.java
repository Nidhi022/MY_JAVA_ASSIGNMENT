package my_class_assignment;

import java.util.Arrays;
import java.util.Scanner;

public class array_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s1 = new Scanner(System.in);

		int a = s1.nextInt();

		int age[] = new int[a];

		for (int i = 0; i < a; i++) {

			System.out.println("enter the value of an array");
			age[i] = s1.nextInt();

		}

		System.out.println(Arrays.toString(age));

	}
}
