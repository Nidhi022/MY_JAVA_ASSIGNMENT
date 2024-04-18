package my_class_assignment;

import java.util.Scanner;

public class Assignment_27 {
	static int a;
	static int b;
	
	void add() {
		int sum= a+b;
		System.out.println(sum);
	}
	void sub() {
		int sub= a-b;
		System.out.println(sub);
	}
	void mul() {
		int mult= a*b;
		System.out.println(mult);
	}
	void div() {
		double div= a/b;
		System.out.println(div);
	}
	void mod() {
		int mod= a%b;
		System.out.println(mod);
	}
	public static void main(String[] args) {
		Scanner s1= new Scanner(System.in);
		a=s1.nextInt();
		b=s1.nextInt();
		Assignment_27 a1= new Assignment_27();
		a1.add();
		a1.sub();
		a1.mul();
		a1.div();
		a1.mod();
		
		
		
		

	}

}
