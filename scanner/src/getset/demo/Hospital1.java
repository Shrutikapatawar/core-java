package getset.demo;

public class Hospital1 {
public static void main(String[] args) {
	Hospital H=new Hospital();
	H.setPatientId(901);
	H.setPatientName("Saket");
	H.setDiseases("Viral Infections");
	System.out.println("PatientId = "+H.getPatientId());
	System.out.println("PatientName = "+H.getPatientName());
	System.out.println("Disease = "+H.getDiseases());
}
}
