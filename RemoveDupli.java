package array.sorting;

import java.util.Arrays;

public class RemoveDupli {
	
	    public static void main(String[] args) {
	        int[] ary = {12, 45, 34, 67, 93, 11, 45, 34};

	        Arrays.sort(ary);

	        System.out.print("Without duplicates: ");
	        System.out.print(ary[0] + " ");

	        for (int i = 1; i < ary.length; i++) {
	            if (ary[i] != ary[i - 1]) {
	                System.out.print(ary[i] + " ");
	            }
	        }
	    }
	}


