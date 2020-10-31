package ch17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class StringAddress {
	public static void main(String[] args) {
		Collection col;
		Map map;
		List<String> list = new ArrayList<>();
		Set<String> hashSet = new HashSet<String>();
		Set<Character> treeSet = new TreeSet<Character>();
		MyCollection[] arr1 = {
				new MyCollection(1),
					new MyCollection(2),
						new MyCollection(3),
							new MyCollection(4),
								new MyCollection(5)
		};
		System.out.println(Arrays.toString(arr1));
		
		Arrays.sort(arr1, new Comparator<MyCollection>() {
			@Override
			public int compare(MyCollection o1, MyCollection o2) {
				// TODO Auto-generated method stub
				return o1.value > o2.value ? -1 : o1.value == o2.value ? 0 : 1;
			}
	});
		System.out.println(Arrays.toString(arr1));
		
	}
}
class MyCollection implements Comparable<MyCollection>{
	int value;
	public MyCollection(int value) {
		this.value = value;
	}
	@Override
	public int compareTo(MyCollection o) {
		// TODO Auto-generated method stub
			return value < o.value ? -1 : value == o.value ? 0 : 1;
	}
	public String toString() {
		return value + "";
	}
}
