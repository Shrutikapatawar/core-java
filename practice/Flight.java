package oops.practice;
import java.util.Scanner; 
public class Flight {
public static void main(String[] args) {
	MyFlight M=new MyFlight(801200, "Indigo", 180, 15000, true, 'B');
	System.out.println("Airline = "+M.getAirline());
	System.out.println("FLight Number = "+M.getFlightNumber());
	System.out.println("Capacity = "+M.getCapacity());
	System.out.println("TicketRate = "+M.getTicketRate());
	System.out.println("Is Domastic = "+M.isIsDomastic());
	System.out.println("Flightclass = "+M.getFlightclass());
	System.out.println("Do you want to change the class");
	Scanner S  = new Scanner(System.in);
	boolean choice=S.nextBoolean();
	if(choice==true) {
	M.UpdateTicket('E');
	
	}M.checkType("GoodsAndPackages");
}
}

