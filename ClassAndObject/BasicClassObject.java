package ClassAndObject;

class StudentData{
	public String Name = "Tejas";
	public int rollNumber = 16;
	public String City = "Dahanu";
}

public class BasicClassObject {

	public static void main(String[] args) {
		StudentData std = new StudentData();
		System.out.println(std.Name+" "+std.rollNumber+" "+std.City);

	}

}
