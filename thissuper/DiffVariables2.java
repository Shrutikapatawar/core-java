package thissuper;

public class DiffVariables2 extends DiffVariables {
	int Batchcode = 1043;
	int rollNo = 367;
	String StdName = "ShrutikaPatawar";
	int Marks = 300;

	public void Display() {
		System.out.println("Parent class");
		System.out.println(super.StdName);
		System.out.println(super.Marks);
		System.out.println(super.rollNo);
		System.out.println(super.Batchcode);
		System.out.println();

		System.out.println("child class");
		System.out.println(this.StdName);
		System.out.println(this.Marks);
		System.out.println(this.rollNo);
		System.out.println(this.Batchcode);

	}

	public static void main(String[] args) {
		DiffVariables2 D = new DiffVariables2();
		D.Display();

	}
}
