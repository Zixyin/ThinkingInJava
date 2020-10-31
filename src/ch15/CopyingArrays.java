package ch15;

import java.util.Arrays;

public class CopyingArrays {
	public static void main(String[] args) {
		int[] arr1 = new int[7];
		int[] arr2 = new int[10];
		Arrays.fill(arr1, 7);
		System.out.println(Arrays.toString(arr1));
		Arrays.fill(arr2, 10);
		System.out.println(Arrays.toString(arr2));
		Util[] myUtil = new Util[5];
		Util util = new Util(47);
		Arrays.fill(myUtil, util);
		System.out.println(Arrays.toString(myUtil));
		util.setId(91);
		System.out.println(Arrays.toString(myUtil));
		System.arraycopy(arr1, 0, arr2, 3, arr1.length);
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println("Hi".intern() == (new String("Hi").intern()));
		System.out.println("Hi".intern().equals(new String("Hi").intern()));
	}
}
class Util{
	private int id;
	public Util(int id) {
		this.id = id;
	}
	public int setId(int id) {
		int temp = this.id;
		this.id = id;
		return temp;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "id" + id;
	}
}