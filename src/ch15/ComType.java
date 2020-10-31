package ch15;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class ComType implements Comparable<ComType>{
	private final int value;
	public ComType(int value) {
		this.value = value;
	}
	@Override
	public int compareTo(ComType o) {
		// TODO Auto-generated method stub
		return this.value < o.value ? -1 :(this.value == o.value ? 0 : 1);
	}
	public String toString() {
		return value + "";
	}
	public static void main(String[] args) {
		Random rand = new Random(47);	
		ComType[] type = {
				new ComType(rand.nextInt(100)),
				new ComType(rand.nextInt(100)),
				new ComType(rand.nextInt(100)),
				new ComType(rand.nextInt(100)),
				new ComType(rand.nextInt(100)),
				new ComType(rand.nextInt(100)),
		};
		System.out.println(Arrays.toString(type));
		Arrays.sort(type);
		System.out.println(Arrays.toString(type));
		System.out.println(Arrays.toString(type));
		Arrays.sort(type, new ComType(1).new MyComparator() );
		System.out.println(Arrays.toString(type));
		
	}
	class MyComparator implements Comparator<ComType>{
		@Override
		public int compare(ComType o1, ComType o2) {
			return o1.value > o2.value ? -1 : (o1.value == o2.value ? 0 : 1);
		}
	}
}