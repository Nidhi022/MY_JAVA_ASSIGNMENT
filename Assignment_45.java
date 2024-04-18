package my_class_assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment_45 {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		int size = s1.nextInt();

		int a[] = new int[size];

		for (int i = 0; i <= 4; i++) {
			a[i] = s1.nextInt();
		}

		System.out.println(Arrays.toString(a));

	}
}
