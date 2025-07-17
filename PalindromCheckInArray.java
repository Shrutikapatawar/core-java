package array.sorting;

public class PalindromCheckInArray {
	public static void main(String[] args) {
		int arry[] = { 767, 890, 67576 };
		System.out.println("Palindrom number is..!!");
		for (int i = 0; i < arry.length; i++) {
			int digit = 0;
			int og = arry[i];
			while (arry[i] != 0) {

				int rem = arry[i] % 10;
				digit = digit * 10 + rem;
				arry[i] = arry[i] / 10;
				
			}
			
			if (og == digit) {
				System.out.println(og);
			}
		}
	}
}
