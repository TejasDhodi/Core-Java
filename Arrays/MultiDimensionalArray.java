package Arrays;

import java.util.*;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		////////////////////Method-1 //////////////////
		int arr[][] = new int[2][3];
		arr[0][1] = 1;
		arr[0][2] = 2;
		arr[1][0] = 3;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				System.out.println(arr[i][j]);
			}
		}
		
		System.out.println(Arrays.toString(arr));
		
		////////////////////Method-2 //////////////////
		
		int arr1[][] = {{1,2,3,4},{5,6,7,8}};
		
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1[0].length; j++) {
				System.out.println(arr1[i][j]);
			}
		}
		
		
		////////////////////Method-3 with Inputs //////////////////
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter the size of row: ");
		int row = scn.nextInt();
		
		System.out.print("Enter the size of column: ");
		int col = scn.nextInt();
		
		int arr2[][] = new int[row][col];
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				System.out.println("Enter the values of rows and column");
				arr[i][j] = scn.nextInt();
			}
		}
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				System.out.println(arr[i][j]);
			}
		}
	}

}
