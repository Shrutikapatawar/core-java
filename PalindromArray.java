package array.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class PalindromArray {
	
	public static void main(String[] args) {
		int temp = 0 ;
		int arry[] = new int[5];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arry.length; i++) {
			arry[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(arry));
		for(int i=0;i<arry.length/2;i++) {
			if(arry[i]!=arry[arry.length-1-i]) {
				temp=temp+1;
				break;
			}
		}
		if(temp==0) {
			System.out.println("Array elements are palindrome");
		}else {
			System.out.println("array is not palindrom");
		}
	}
}
