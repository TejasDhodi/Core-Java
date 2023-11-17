package Encapsulation;


class StudData {
	private String Name;
	private int Roll;
	
	public String getName() {
		return Name;
	}
	
	public void setName(String Name) {
		this.Name = Name;
	}
	
	public int getRollNumber() {
		return Roll;
	}
	
	public void setRollNumber(int Roll) {
		this.Roll = Roll;
	}
}

public class ReadAndWrite {

	public static void main(String[] args) {
		StudData std = new StudData();
		std.setName("Tejas");
		std.setRollNumber(16);
		
		System.out.println(std.getName()+" "+std.getRollNumber());
	}

}
