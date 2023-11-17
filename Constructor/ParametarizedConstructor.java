package Constructor;

class StudData2 {
	private String Name;
	private int rollNumber;
	private int grNumber;
	
	public StudData2(String Name, int rollNumber, int grNumber) {
		this.Name = Name;
		this.rollNumber = rollNumber;
		this.grNumber = grNumber;
	}

	public String getName() {
		return Name;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public int getGrNumber() {
		return grNumber;
	}
	
}

public class ParametarizedConstructor {

	public static void main(String[] args) {
		StudData2 std  = new StudData2("Tejas Dhodi", 16, 219135);
		
		System.out.println("Name: "+std.getName());
		System.out.println("Roll Number: "+std.getRollNumber());
		System.out.println("GR Number: "+std.getGrNumber());
	}

}
