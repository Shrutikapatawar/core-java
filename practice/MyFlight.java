package oops.practice;

public class MyFlight {
	private int FlightNumber;
	private String Airline;
	private int capacity;
	private float TicketRate;
	private boolean IsDomastic;
	private char Flightclass;

	public MyFlight(int FlightNumber, String Airline, int capacity, float TicketRate, boolean IsDomastic,
			char Flightclass) {

		this.FlightNumber = FlightNumber;
		this.Airline = Airline;
		this.capacity = capacity;
		this.TicketRate = TicketRate;
		this.IsDomastic = IsDomastic;
		this.Flightclass = Flightclass;

	}

	public void UpdateTicket(char Flightclass) {
		if (Flightclass == 'E') {
			System.out.println("Updated TicketRate = 8500");
			System.out.println("your booking is updated to economic class");
		} else if (Flightclass == 'B') {
			System.out.println("Updated TicketRate = 15000");

			System.out.println("your booking is updated to business class");
		}
	}
	
	public void checkType(String type) {
		switch(type) {
		  case "GoodsAndPackages":
			  System.out.println("Cargo Flights");
		    break;
		  case "Passengers ":
		    System.out.println("Commercial Flights");
		    break;
		  
		}
	}

	public int getFlightNumber() {
		return FlightNumber;
	}

	public String getAirline() {
		return Airline;
	}

	public int getCapacity() {
		return capacity;
	}

	public float getTicketRate() {
		return TicketRate;
	}

	public boolean isIsDomastic() {
		return IsDomastic;
	}

	public char getFlightclass() {
		return Flightclass;
	}

}
