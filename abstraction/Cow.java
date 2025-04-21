package oops.abstraction;

public class Cow implements Animal{

	@Override
	public void Sound() {
		System.out.println("Haambhyyaaaa");
		
	}

	@Override
	public void Color() {
		System.out.println("White");
		
	}
	public static void main(String[] args) {
		Cow W=new Cow();
		 W.Sound();
		 W.Color();
	}
	
	 

}
