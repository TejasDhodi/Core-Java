package Encapsulation;

class StudData2 {
	private String Name;
	private int rollNumber;
	
	public void setName(String Name) {
		this.Name = Name;
	}
	
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
}
public class Write {

	public static void main(String[] args) {
		StudData2 std = new StudData2();
		
		std.setName("Tejas");
		std.setRollNumber(16);
	}

}
