package oops.polymorphism;

//3.Overload a method named display() to:
//
//Display a string
//
//Display an integer
//
//Display a string and an integer together
public class DisplayDetails {
public void Display(String Name) {
	System.out.println("Name ="+Name);
}

public void Display(int Age) {
	System.out.println("Age = "+Age);
}

public void Display(String Name,int Age) {
	System.out.println("Name = "+Name);
	System.out.println("Age = "+Age);
}
public static void main(String[] args) {
	DisplayDetails D=new DisplayDetails();
	D.Display("Shrutika");
	D.Display(22);
	D.Display("Disha", 40);
	
}
}
