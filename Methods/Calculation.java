package Methods;

class AddSub {
	public int addNumber(int n1, int n2) {
		return n1 + n2;
	}
	
	public int subNumber(int n1, int n2) {
		return n1 - n2;
	}
}

public class Calculation {

	public static void main(String[] args) {
		AddSub calc = new AddSub();
		
		System.out.println(calc.addNumber(10, 20));
		System.out.println(calc.subNumber(20, 10));

	}

}
