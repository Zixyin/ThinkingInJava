package ch16;

import java.util.Arrays;
import java.util.List;

public class ArrayOptions {
	public static void main(String[] args) {
		BeryliumSphere[] arr1 = new BeryliumSphere[5];
		System.out.println(arr1);
		System.out.println(arr1.toString());
		System.out.println(Arrays.toString(arr1));
		for(int i = 0;i < 5;i ++)
			arr1[i] = new BeryliumSphere();
		System.out.println(arr1);
		System.out.println(arr1.toString());
		System.out.println(Arrays.toString(arr1));
		
		System.out.println("****************************");
		int[] arr2 = new int[5];
		System.out.println(arr2);
		System.out.println(arr2.toString());
		System.out.println(Arrays.toString(arr2));
		for(int i = 0;i < 5;i ++)
			arr2[i] = i;
		System.out.println(arr2);
		System.out.println(arr2.toString());
		System.out.println(Arrays.toString(arr2));

		System.out.println("****************************");
		int [][] tupleArr = new int [5][5];
		System.out.println(tupleArr);
		System.out.println(tupleArr.toString());
		System.out.println(Arrays.toString(tupleArr));
		System.out.println(Arrays.deepToString(tupleArr));
		
		System.out.println("****************************");
		int [][][] tripleArr = new int [5][5][5];
		System.out.println(Arrays.deepToString(tripleArr));
		
		List<BeryliumSphere> list;
		
	}
}

class BeryliumSphere{
	private static int count = 0;
	private final int id = count++;
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "BeryliumSphere----" + id;
	}
}