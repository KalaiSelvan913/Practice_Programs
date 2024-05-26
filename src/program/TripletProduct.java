package program;

import java.util.Arrays;

public class TripletProduct {

	public static void main(String[] args) {
		
		 int[] array1 = {10, 3, 5, 6, 20};
	        System.out.println("Maximum product of a triplet is " + getMaxProduct(array1));

	        int[] array2 = {-10, -3, -5, -6, -20};
	        System.out.println("Maximum product of a triplet is " + getMaxProduct(array2));

	        int[] array3 = {-10, -3, 5, 6, 20};
	        System.out.println("Maximum product of a triplet is " + getMaxProduct(array3));
	        
 /*         Input: {10, 3, 5, 6, 20}

	        After sorting: {3, 5, 6, 10, 20}
	        max1 = 20 * 10 * 6 = 1200
	        max2 = 3 * 5 * 20 = 300
	        Maximum product is 1200.
	        Input: {-10, -3, -5, -6, -20}

	        After sorting: {-20, -10, -6, -5, -3}
	        max1 = -3 * -5 * -6 = -90
	        max2 = -20 * -10 * -3 = -600
	        Maximum product is -90.
	        Input: {-10, -3, 5, 6, 20}

	        After sorting: {-10, -3, 5, 6, 20}
	        max1 = 20 * 6 * 5 = 600
	        max2 = -10 * -3 * 20 = 600

*/
	}
	
	
	private static int getMaxProduct(int[] arr) {
		int n = arr.length;
		if(n<3) {
			throw new IllegalArgumentException("Array Should Have atleast Three Character");
		}
		Arrays.sort(arr);
		
		int max1 = arr[n-1]*arr[n-2]*arr[n-3];
		int max2 = arr[0]*arr[1]*arr[n-1];
		
		return Math.max(max1, max2);
	}

}
