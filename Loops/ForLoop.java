package Loops;
import java.util.*;
public class ForLoop {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
	       
        double totalMarks = 0.0;
        int Sem;
        for(Sem = 1; Sem <= 6; Sem++) {
            System.out.print("Enter the marks of Sem" + Sem + ": ");
            double marks = scn.nextDouble();
            totalMarks += marks;        
           
        }
        System.out.println("Sum Of All Semisters: " + totalMarks);
       
        double CGPA = totalMarks / 6;
        System.out.println("You Got " + CGPA + " CGPA");
       
        if (CGPA < 3.0) {
            System.out.println("Fail");
        } else if (CGPA <= 6.3) {
            System.out.println("Pass With Second Class");
        } else if (CGPA <= 7.8) {
            System.out.println("Pass With First Class");
        } else {
            System.out.println("Pass With Distinction");
        }

	}

}
