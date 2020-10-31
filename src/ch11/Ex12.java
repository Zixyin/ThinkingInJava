package ch11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/**
 * @author YZX
 * @date 2020年5月22日
 * @time 上午10:04:39
 */

public class Ex12 {
	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
		System.out.println(l1);
		l1.add(6);
		System.out.println(l1);
		l1.addAll(Arrays.asList(7,8,9));
		System.out.println(l1);
		Collections.addAll(l1, 10,11,12);
		System.out.println(l1);
		List<Integer> l2 = new ArrayList<Integer>(l1.size());
		ListIterator<Integer> it = l1.listIterator(l1.size());
		while(it.hasPrevious())
			l2.add(it.previous());
		System.out.println(l2);
		it = l1.listIterator(11);
		System.out.println(it);
		System.out.println(it.previous());
		it = l1.listIterator(0);
		System.out.println(it.next());
	}
}
