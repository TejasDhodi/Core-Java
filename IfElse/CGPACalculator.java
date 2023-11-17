package IfElse;
import java.util.*;
public class CGPACalculator {

	public static void main(String[] args) {
		 Scanner scn = new Scanner(System.in);
	        System.out.print("Enter the Marks of Sem1: ");
	        double Sem1 = scn.nextDouble();
	       
	        System.out.print("Enter the Marks of Sem2: ");
	        double Sem2 = scn.nextDouble();
	       
	        System.out.print("Enter the Marks of Sem3: ");
	        double Sem3 = scn.nextDouble();
	       
	        System.out.print("Enter the Marks of Sem4: ");
	        double Sem4 = scn.nextDouble();
	       
	        System.out.print("Enter the Marks of Sem5: ");
	        double Sem5 = scn.nextDouble();
	       
	        System.out.print("Enter the Marks of Sem6: ");
	        double Sem6 = scn.nextDouble();
	       
	        double Total = Sem1 + Sem2 + Sem3 + Sem4 + Sem5 + Sem6 ;
	        double CGPA = Total / 60 * 10 ;
	       
	        System.out.println("Your CGPA is: " + (CGPA));
	       
	        if(CGPA < 3.0) {
	            System.out.println("Fail");
	        } else if (CGPA > 3.0 && CGPA <= 6.3 ) {
	            System.out.println("Pass With Second Class");
	        } else if (CGPA > 6.3 && CGPA <= 7.8) {
	            System.out.println("Pass With First Class");
	        } else {
	            System.out.println("Pass With Distingtion");
	        }

	}

}
