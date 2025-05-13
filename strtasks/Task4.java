package strtasks;

// WAP to accept full name of the user and print name with initials.

import java.util.Scanner;

public class Task4 {
public static void main(String[] args) {
	System.out.println("Enter the Full Name");
	Scanner S=new Scanner(System.in);
	String Full_Name=S.nextLine();
	int firstSpace=Full_Name.indexOf(" ");
	int secondSpace = Full_Name.indexOf(" ", firstSpace + 1);
	System.out.println(Full_Name.charAt(0)+" "+Full_Name.charAt(firstSpace+1)+" "+Full_Name.charAt(secondSpace+1));
}
}
