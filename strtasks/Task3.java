package strtasks;

// WAP to accept email id of the user and 
//check if it has "gmail" or "yahoo" in it. 
import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		String Sub = "gmail";
		String Sub1 = "yahoo";
		Scanner S = new Scanner(System.in);
		System.out.println("nter the Email_Id");
		String Email_Id = S.nextLine();
		if (Email_Id.contains(Sub)) {
			System.out.println(Sub);
		}else if(Email_Id.contains(Sub1)) {
			System.out.println(Sub1);
		}
	}
}
