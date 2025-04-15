package oops.practice;

public class SmartPhone extends Mobile{
public void BrowseInternet() {
	System.out.println("here you go with goood speed...hureeeyyy...!!");
}
public static void main(String[] args) {
	SmartPhone s=new SmartPhone();
	s.call();
	s.BrowseInternet();
}
}
