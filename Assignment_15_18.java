package my_class_assignment;

public class Assignment_15_18 {
	 static String e;
	 
	 
	 Assignment_15_18()
	{
		
		System.out.println("Hello");
	}

	static void add() {

		System.out.println("static Method 1");
	}

	static void add(int a, int b) {

		System.out.println("static Method 2 ");
	}

	static void add(char a, char b) {

		System.out.println("static Method 3");
	}

	static void add(double a, double b) {

		System.out.println("static Method 4");
	}
	void add(double a, int b) {

		System.out.println("non static Method 1");
	}

	 void add(char a, int b) {
		 
		

		System.out.println("non static Method 2 ");
	}

	 void add(int a, char b) {

		System.out.println("non static Method 3");
	}

	 void add(int a, double b) {
		 
		

		System.out.println("non static Method 4");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		add();
		add(4,5);
		add('A','B');
		add(1.2, 2.1);
		Assignment_15_18 a1= new Assignment_15_18();
		a1.add(1.2, 1);
		a1.add('C',1);
		a1.add(1, 'C');
		a1.add(1, 1.22);
		new Assignment_15_18();
		System.out.println(e);
		

	}

}
