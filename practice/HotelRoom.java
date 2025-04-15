package oops.practice;

public class HotelRoom {
	private int RoomNumber;
	private String RoomType;
	private boolean IsAcAvailable;
	private float RentPerNight;
	private char RoomGrade;
	private double Discount;

	public HotelRoom(int RoomNumber, String RoomType, boolean IsAcAvailable, float RentPerNight, char RoomGrade,
			double Discount) {
		this.RoomNumber = RoomNumber;
		this.RoomType = RoomType;
		this.IsAcAvailable = IsAcAvailable;
		this.RentPerNight = RentPerNight;
		this.RoomGrade = RoomGrade;
		this.Discount = Discount;
	}
	public void dis(double dis) {
		double FinalRent=RentPerNight*(1-(dis/100));
		System.out.println("total Rent you hae to pay is "+FinalRent);
	}

	public int getRoomNumber() {
		return RoomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		RoomNumber = roomNumber;
	}

	public String getRoomType() {
		return RoomType;
	}

	public void setRoomType(String roomType) {
		RoomType = roomType;
	}

	public boolean isIsAcAvailable() {
		return IsAcAvailable;
	}

	public void setIsAcAvailable(boolean isAcAvailable) {
		IsAcAvailable = isAcAvailable;
	}

	public float getRentPerNight() {
		return RentPerNight;
	}

	public void setRentPerNight(float rentPerNight) {
		RentPerNight = rentPerNight;
	}

	public char getRoomGrade() {
		return RoomGrade;
	}

	public void setRoomGrade(char roomGrade) {
		RoomGrade = roomGrade;
	}

	public double getDiscount() {
		return Discount;
	}

	public void setDiscount(double discount) {
		Discount = discount;
	}
	
	

}
