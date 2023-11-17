package Loops;
import java.util.*;
public class WhileLoop {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
	       
        double totalMarks = 0.0;
        int Sem = 1;
        while(Sem <= 6) {
            System.out.print("Enter the marks of Sem" + Sem + ": ");
            double Marks = scn.nextDouble();
            totalMarks += Marks;
            Sem++;
        }
        System.out.println("Total Marks: " + totalMarks);
        double CGPA = totalMarks / 6;
       
        System.out.println("Your CGPA is: " + CGPA);
       
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
