package my_class_assignment;

/*Create a class and write 5 static methods each for addition, 
subtraction, multiplication, devision and modules, call it in the main method*/

public class Assignment_7 {

	static void add() {
		int a = 100;
		int b = 200;
		int sum = a + b;
		System.out.println(sum);
	}

	static void sub() {
		int c = 333;
		int d = 33;
		int sub = c - d;
		System.out.println(sub);
	}

	static void multiply() {
		int e = 8;
		int f = 8;
		int mult = e * f;
		System.out.println(mult);
	}

	static void divide() {
		int g = 81;
		int h = 9;
		int div = g + h;
		System.out.println(div);
	}

	static void mod() {
		int i = 999;
		int j = 8;
		int mod = i % j;
		System.out.println(mod);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Output:");
		add();
		sub();
		multiply();
		divide();
		mod();

	}

}
