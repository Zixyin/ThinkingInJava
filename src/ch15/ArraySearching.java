package ch15;

import java.util.Arrays;

public class ArraySearching {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,6,7,8,9};
		int index =  Arrays.binarySearch(arr, 5);
		System.out.println(index);
		if(index < 0 ) 
			arr[(-index - 1)] = 5;
		System.out.println(Arrays.toString(arr));
	}
}
