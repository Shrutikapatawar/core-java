package thissuper;

public class Manager extends Employee {
	@Override
	public void Show(String Name, double Sal,String Role) {
		super.Show("Shrutika", 40.5, "Manager");
		System.out.println("Name of the manager "+Name);
	}
	
	public static void main(String[] args) {
		Manager M=new Manager();
		M.Show("Shrutika", 40.5, "Manager");
	}
}
