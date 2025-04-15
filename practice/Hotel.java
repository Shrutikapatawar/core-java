package oops.practice;

public class Hotel {
public static void main(String[] args) {
	HotelRoom H=new HotelRoom(201, "Single bed", false, 500, 'A', 50);
	System.out.println("RoomNumber "+H.getRoomNumber());
	System.out.println("RoomType "+H.getRoomType());
	System.out.println("Is Ac Available "+H.isIsAcAvailable());
	System.out.println("Room Grade "+H.getRoomGrade());
	System.out.println("RentPerNight");
	System.out.println("Discount "+H.getDiscount());
	double dis=H.getDiscount();
	H.dis(dis);
	System.out.println();
	
	HotelRoom H1=new HotelRoom(301, "Double bed", true, 1000, 'A', 30);
	System.out.println("RoomNumber "+H1.getRoomNumber());
	System.out.println("RoomType "+H1.getRoomType());
	System.out.println("Is Ac Available "+H1.isIsAcAvailable());
	System.out.println("Room Grade "+H1.getRoomGrade());
	System.out.println("RentPerNight");
	System.out.println("Discount "+H1.getDiscount());
	double dis1=H1.getDiscount();
	H.dis(dis1);
}

}
