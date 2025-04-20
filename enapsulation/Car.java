package oops.enapsulation;

public class Car {
	private int year;
	private String model;
	private double price;

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getPrice() {
		if (price == 0) {
			System.out.println("Not found");
			this.price = 0;
		} else {
			this.price = price;
		}
		return price;
	}

	public void setPrice(double price) {

		this.price = price;
	}

}
