package my_class_assignment;

import java.util.Scanner;

public class Assignment_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int add, sub, mult, div, mod;
		
		Scanner s1 = new Scanner(System.in);
		int a = s1.nextInt();
		int b = s1.nextInt();
		add = a + b;
		System.out.println("add=" + add);

		Scanner s2 = new Scanner(System.in);
		int a1 = s2.nextInt();
		int b1 = s2.nextInt();
		mult = a1 * b1;
		System.out.println("mult=" + mult);

		sub = a - b;
		System.out.println("sub=" + sub);

		div = a / b;
		System.out.println("div=" + div);

		mod = a % b;
		System.out.println("mod=" + mod);

	}

}
