package MethodOverloading;

class MethodOverloadings {
	public void printStatement() {
		System.out.println("Nothing to be printed");
	}
	
	public void printStatement(String msg) {
		System.out.println("The Message is: "+ msg);
	}
	
	public void printStatement(String msg, int repetition) {
		for(int i=0; i<repetition; i++) {
			System.out.println(msg + " "+ (i+1));
		}
	}
}

public class Overloading {

	public static void main(String[] args) {
		MethodOverloadings obj = new MethodOverloadings();
		
		obj.printStatement();
		obj.printStatement("TJ5 Here");
		obj.printStatement("I liked It ", 5);

	}

}
