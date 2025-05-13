package strtasks;
//WAP to accept name of the user and count the number of characters in it. 
import java.util.Scanner;

public class Tasks1 {
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		System.out.println("Enter the name");
		String Name = S.nextLine();
		System.out.println("Number of characters in it : " + Name.length());

	}
}
