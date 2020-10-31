package ch15;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayMaker<T> {
	private Class<T> type;
	public ArrayMaker(Class<T> t) {
		type = t;
	}
	@SuppressWarnings("unchecked")
	public T[] maker(int size){
		return (T[]) Array.newInstance(type, size);
	}
	public List<T> listMaker(int size, T t){
		List<T> list = new ArrayList<T>();
		for(int i = 0;i < size;i ++) {
			list.add(t);
		}
		return list;
	}
	public static void main(String[] args) {
		ArrayMaker<String> arrayMaker = new ArrayMaker<>(String.class);
		String[] array = arrayMaker.maker(5);
		System.out.println(Arrays.toString(array));
		List<String> list = arrayMaker.listMaker(5, "Generic");
		System.out.println(list);
	}
}
