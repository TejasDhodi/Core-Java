package Encapsulation;

class StudData1 {
	private String Name = "Tejas";
	private int rollNumber = 16;
	
	public String getName() {
		return Name;
	}
	
	public int getRollNumber() {
		return rollNumber;
	}
}

public class Read {

	public static void main(String[] args) {
		StudData1 std = new StudData1();
		System.out.println(std.getName()+" "+std.getRollNumber());
	}

}
