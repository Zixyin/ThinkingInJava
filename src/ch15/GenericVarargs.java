package ch15;

import java.util.ArrayList;
import java.util.List;

public class GenericVarargs {
	@SafeVarargs
	public static <T> List<T> makeList(T...args){
		ArrayList<T> list = new ArrayList<T>();
		for(T t : args)
			list.add(t);
		return list;
	}
	public static void main(String[] args) {
		System.out.println(makeList("A", "B"));
		System.out.println(makeList("AJDIOSFKOSAJFLA".split("")));
	}
}
