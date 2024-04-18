package my_class_assignment;

public class Assignment_19 {

	Assignment_19() {

		System.out.println("Constructor 1");

	}

	Assignment_19(int a, int b) {

		System.out.println("Constructor 2");

	}

	Assignment_19(char a, char b) {

		System.out.println("Constructor 3");

	}

	Assignment_19(double a, double b) {

		System.out.println("Constructor 4");

	}

	Assignment_19(String a, String b) {

		System.out.println("Constructor 5");

	}

	Assignment_19(int a) {

		System.out.println("Constructor 6");

	}

	Assignment_19(char b) {

		System.out.println("Constructor 7");

	}

	Assignment_19(double b, int a) {

		System.out.println("Constructor 8");

	}

	Assignment_19(double c) {

		System.out.println("Constructor 9");

	}

	Assignment_19(String a, int b) {

		System.out.println("Constructor 10");

	}

	public static void main(String[] args) {
		// write a program for constructor overloading using 10 constructors

		new Assignment_19();
		new Assignment_19(5, 6);
		new Assignment_19('a', 'b');
		new Assignment_19(3.2, 2.3);
		new Assignment_19("nidhi", "jaiswal");
		new Assignment_19(5);
		new Assignment_19('A');
		new Assignment_19(2.3, 4);
		new Assignment_19(2.1);
		new Assignment_19("nidhi", 5);

	}

}
