package strtasks;

//WAP to accept String from the user and count the number vowels and consonants in it. 
import java.util.Scanner;

public class Task5 {
	static int vowels;
	static int consonants;
public static void main(String[] args) {
	System.out.println("Enter the String");
	Scanner S=new Scanner(System.in);
	String Word=S.nextLine();
	int len=Word.length();
	for (int i=1;i<len;i++) {
		if(Word.charAt(i)=='a'|| Word.charAt(i)=='e'||Word.charAt(i)=='i'||Word.charAt(i)=='o'||Word.charAt(i)=='u') {
			vowels++;
		}else if(Word.charAt(i)=='a'|| Word.charAt(i)=='e'||Word.charAt(i)=='i'||Word.charAt(i)=='o'||Word.charAt(i)=='u') {
			vowels++;
		}else {
			consonants++;
		}
	}
	System.out.println("the number of the vowels : "+vowels);
	System.out.println("the number of the consonants : "+consonants);
}
}
