package my_class_assignment;

public class Assignment_11_16 {

	public static void main(String[] args) {
		// nested if else

		String gender = "Female";
		String gender1 = "male";
		int age = 19;

		if (age > 18) {

			if (gender == "Female" ) {
				System.out.println("Eligible for vote");
			}

			else {
				System.out.println("Not Eligible");
			}
			
			if (gender1 == "male" ) {
				System.out.println("Eligible for vote");
			}

			else {
				System.out.println("Not Eligible");
			}
			
		}

		else {
			System.out.println("Not Eligible");
		}

	}

}
