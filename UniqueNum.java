package array.sorting;

public class UniqueNum {
	public static void main(String[] args) {
		int arry[] = { 23, 6, 23, 7, 6 };
		System.out.println(arry);
		int temp = 0;
		for (int i = 0; i < arry.length; i++) {

			for (int j = 1; j < arry.length; j++) {
				if (arry[i] == arry[j]) {
					temp = temp + 1;
					break;
				}
			}
			if (temp == 0) {
				System.out.println(arry[i]);
			}
		}
	}
}
