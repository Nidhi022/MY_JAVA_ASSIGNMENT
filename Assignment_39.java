package my_class_assignment;

interface parent1 {
	void add();
}

interface parent2 {
	void add();
	void sub();
}

interface parent3 {
	void div();
}

interface parent4 {
	void mult();
}

//multiple level inheritance
public class Assignment_39 implements parent1, parent2, parent3,parent4{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Assignment_39 a1 = new Assignment_39();
		a1.add();
		a1.sub();
		a1.div();
		a1.mult();
	}

	@Override
	public void add() {
		System.out.println("method of parent1");

	}

	@Override
	public void sub() {
		System.out.println("method of parent2");

	}

	@Override
	public void mult() {
		System.out.println("method of parent4");

	}

	@Override
	public void div() {
		System.out.println("method of parent3");

	}

}

