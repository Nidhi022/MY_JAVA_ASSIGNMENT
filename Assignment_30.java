package my_class_assignment;

public class Assignment_30 {
	
	static double Pi = 3.14;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Write a program to find Area of
		// Circle(a=pi*r^2),,Rectangle(a=l*w),Square,Trapezium

		int r = 4;
		double area_c = Pi * r * r;
		System.out.println(area_c);

		// Triangle(A = ½ (b × h))
		int b = 3;
		int h = 4;
		double area_t = (b * h) / 2;
		System.out.println(area_t);

		// Rectangle
		int l = 3;
		int w = 4;
		double area_r = l * w;
		System.out.println(area_r);

		// Square
		int a = 10;
		int area_s = a * a;
		System.out.println(area_s);

		// Trapezium

		double area_trapezium = ((a + b) / 2) * h;
		System.out.println(area_trapezium);

	}

}
