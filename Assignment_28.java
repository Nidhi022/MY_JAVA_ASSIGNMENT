package my_class_assignment;

public class Assignment_28 {

	public static void main(String[] args) {
		// Write a program using for loop that starts from 1 to 10 and find out its
		// average?
		double sum = 0;
		for (int i = 0; i <= 10; i++) {

			sum = sum + i;
		}
		System.out.println(sum);
		double avg = sum / 10;
		System.out.println(avg);

	}

}
