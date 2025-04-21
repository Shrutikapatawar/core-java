package oops.abstraction;

public class Dog implements Animal {
	
@Override
public void Sound() {
	System.out.println("Bark");
}

@Override
public void Color() {
	System.out.println("White & Brown");
}

public static void main(String[] args) {
	Dog D=new Dog();
	D.Sound();
	D.Color();
	
}
}
