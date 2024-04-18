package my_class_assignment;
class parent_1{
	void mult() {
		System.out.println("Parent_1");
	}
}
class parent extends parent_1{
	
	void add() {
		System.out.println("Parent");
	}
   
}

public class Assignment_31_32 extends parent {
	
	 void sub() {
		System.out.println("child");
	}

	public static void main(String[] args) {
		
		Assignment_31_32 a1= new Assignment_31_32();
		a1.sub();
		a1.add();
		a1.mult();
	}
	
	
}