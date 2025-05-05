package login;

import java.util.Scanner;

public class Page {
	int temp;

	public void Log(String UserName, String Pass) {
		if (UserName.equals("Shrutika") && Pass.equals("Shru12")) {
			System.out.println("welldone..!!");
		} else if (UserName.equals("Shrutika")) {
			while (!Pass.equals("Shru12")) {
				temp = temp + 1;
				Scanner s = new Scanner(System.in);
				System.out.println("Enter Pass Again");
				Pass = s.nextLine();
			}
			System.out.println("Welldone...!!");
			System.out.println("wrong attempt =" + temp);
		}

	}

	public static void main(String[] args) {
		Page P = new Page();
		Scanner S = new Scanner(System.in);
		System.out.println("Enter UserName");
		String UserName = S.nextLine();
		System.out.println("Enter Password");
		String Pass = S.nextLine();
		P.Log(UserName, Pass);
	}
}
