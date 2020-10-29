package ch15;

public class Erase<T> {
	private final static int SIZE = 100;
	public static void f(Object arg) {
/*Cannot make a static reference to the non-static type T
 * 		if(arg instanceof T) {}
		T var = new T();
		T[] array = new T[SIZE];
		T[] array = (T)new Object[SIZE];*/
	}

}
