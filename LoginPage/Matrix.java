package array.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix {
	public static void main(String[] args) {
		int arry[][] = new int[3][3];
		System.out.println("enter the elements.");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {

				Scanner sc = new Scanner(System.in);
				arry[i][j] = sc.nextInt();

			}
		}
		System.out.println(Arrays.deepToString(arry));
	}
}
