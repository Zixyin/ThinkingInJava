package ch15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericMethods {
	public <A, B, C> void f(A a, B b, C c) {
		System.out.println(a.getClass().getName());
		System.out.println(b.getClass().getTypeName());
		System.out.println(c.getClass().getCanonicalName());
	}
	public static void main(String[] args) {
		GenericMethods methods = new GenericMethods();
		methods.f(1.1d, 1.1, 1.1f);
		List<GenericMethods> list = new ArrayList<>();
		list.add(new GenericMethods());
		list.add(new GenericMethods());
		System.out.println(list.get(0).getClass().getName());
	}
}
