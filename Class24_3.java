package my_class_assignment;

public class Class24_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "sky is 441 $#@$##@#%";
		char a[] = name.toCharArray();
		int count_alpha = 0;
		int count_numeric = 0;
		int count_space = 0;
         int lenght =name.length();
		for (int i = 0; i <= name.length() - 1; i++) {
			boolean b = Character.isAlphabetic(a[i]);
			boolean b1 = Character.isDigit(a[i]);
			boolean b2 = Character.isSpaceChar(a[i]);
			if (b == true) {
				count_alpha++;

			}
			if (b1 == true) {
				count_numeric++;

			}
			if (b2 == true) {
				count_space++;

			}

		}
		
		System.out.println(count_alpha);
		System.out.println(count_numeric);
		System.out.println(count_space);
		
		int total = count_alpha+count_numeric+count_space;
		int S_Character= lenght-total;
		System.out.println(S_Character);
		

	}
}
