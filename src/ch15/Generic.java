package ch15;

public class Generic {
	public static void main(String[] args) {
		MyGeneric myGeneric = new MyGeneric("123");
		System.err.println(myGeneric.getT());
		MyGeneric<String> my2 = new MyGeneric<String>("1234");
		System.err.println(my2.getT());
		MyGeneric<Integer> my3 = new MyGeneric<Integer>(12345);
		System.err.println(my3.getT());
	}
}
class MyGeneric<T>{
	private T t;
	private T t2;
	public MyGeneric(T t) {
		this.t = t;
	}
	public void setT(T t) {
		this.t = t;
	}
	public T getT() {
		return t;
	}
	public MyGeneric getMyGeneric(T t) {
		return new MyGeneric<T>(t);
	}
}