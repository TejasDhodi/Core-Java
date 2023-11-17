package Arrays;
import java.util.*;
public class Array {

	public static void main(String[] args) {
			////////////////////Method-1 //////////////////
			String arr[] = new String[3];
			arr[0] = "Tejas";
			arr[1] = "Rina";
			arr[2] = "Dhodi";
			
			for(int i=0;i<3;i++) {
				System.out.println(arr[i]);
			}
			
			
			//////////////////// Method-2 //////////////////
			String arr1[] = {
			"Tejas",
			"Rina",
			"Dhodi"
			};
			
			for(int i=0; i<3; i++) {
				System.out.println(arr1[i]);
			}
			
			
			//////////////////// Method-3 with Inputs //////////////////
			Scanner scn = new Scanner(System.in);
			
			System.out.print("Enter the size of Array: ");
			int size = scn.nextInt();
			int arr2[] = new int[size];
			
			for(int j=0; j<arr2.length; j++) {
				System.out.print("Enter the value of Array of " + j + ": " );
				arr2[j] = scn.nextInt();
			}
			
			System.out.println(Arrays.toString(arr2));
			
			for(int i=0; i<arr2.length; i++) {
				System.out.println(arr2[i]);
			}

	}

}
