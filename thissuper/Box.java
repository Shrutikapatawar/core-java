package thissuper;
//Create a class Box with length, width, and height. 
//Create a method to calculate volume. 
//Use this to refer to the current object while setting values.

public class Box {
	int length;
	int width;
	int height;
	public void calculate_volume(int length,int width,int height) {
		this.height=height;
		this.length=length;
		this.width=width;
		
		int volume=length*width*height;
		System.out.println("volume "+volume);
	}
	
	public static void main(String[] args) {
		Box B= new Box();
		B.calculate_volume(6, 7, 2);
	}
}
