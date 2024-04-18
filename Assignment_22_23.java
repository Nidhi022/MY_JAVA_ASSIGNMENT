package my_class_assignment;

import java.util.Scanner;

public class Assignment_22_23{

	static double Pi = 3.14;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Write a program to find Area of
		// Circle(a=pi*r^2),,Rectangle(a=l*w),Square,Trapezium
        Scanner s1= new Scanner(System.in);
        System.out.println("enter the value of r ");
		int r = s1.nextInt();
		double area_c = Pi * r * r;
		System.out.println(area_c);

		// Triangle(A = ½ (b × h))
		System.out.println("enter the value of b");
		int b = s1.nextInt();
		System.out.println("enter the value of h");
		int h = s1.nextInt();
		double area_t = (b * h) / 2;
		System.out.println(area_t);

		// Rectangle
		System.out.println("enter the value of l ");
		int l = s1.nextInt();
		System.out.println("enter the value of w ");
		int w = s1.nextInt();
		double area_r = l * w;
		System.out.println(area_r);

		// Square
		System.out.println("enter the value of a");
		int a =s1.nextInt();
		int area_s = a * a;
		System.out.println(area_s);

		// Trapezium

		double area_trapezium = ((a + b) / 2) * h;
		System.out.println(area_trapezium);

	}

}
