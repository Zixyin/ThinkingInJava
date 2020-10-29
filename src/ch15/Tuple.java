package ch15;

public class Tuple {
	public static void main(String[] args) {
		System.err.println(new TwoTuple<String, Integer>("A", 1));
		System.out.println(new TripleTuple<>(1, "A", 3));
	}
}
class TwoTuple<A, B>{
	public final A first;
	public final B second;
	public TwoTuple(A a,B b) {
		first = a;
		second= b;
	}
	public String toString() {
		return "(" + first + "----" + second + ")";
	}
}
class TripleTuple<A, B, C> extends TwoTuple<A, B>{
	public final C third;
	public TripleTuple(A a, B b, C c) {
		super(a, b);
		third = c;
	}
	public String toString() {
		return super.toString() + third;
	}
}