package strtasks;

//2) WAP to accept password of the user and count the number of digits in it. 
import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		System.out.println("Enter the UserName");
		Scanner S = new Scanner(System.in);
		String UserName = S.nextLine();
		System.out.println("Enter the Password");
		String PassWord = S.nextLine();
		int digits = PassWord.replaceAll("[^0-9]", "").length();
//	here we used the two methods of the string 
//	1st one is replaceAll("[^0-9]", "") 
//	in this method the non^ digit 0-9 will get replace by the blank
//	tehn remaining digit will be ount with the help of the method .length
		System.out.println("The digit used in this password is : " + digits);
	}
}
