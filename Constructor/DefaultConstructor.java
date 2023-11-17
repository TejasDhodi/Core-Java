package Constructor;

class StudData {
	private String Name;
	private int rollNumber;
	private int grNumber;
	
	public StudData() {
		Name = "Tejas";
		rollNumber = 16;
		grNumber = 219135;
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

public class DefaultConstructor {

	public static void main(String[] args) {
		StudData std = new StudData();

		System.out.println(std.getName()+" "+std.getRollNumber()+" "+std.getGrNumber());
	}

}
