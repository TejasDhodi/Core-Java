package Arrays;

public class JackedArray {

	public static void main(String[] args) {
		String arr[][] = new String[3][];
		arr[0] = new String[1];
		arr[1] = new String[2];
		arr[2] = new String[3];
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = "*";
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
	}

}
