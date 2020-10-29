package ch15;

public class GenericFunctionTuple {
	public static <A, B> TwoTuple<A, B> tuple(A a, B b) {	
		return new TwoTuple<A, B>(a, b);
	}
	public static <A, B, C> TripleTuple<A, B, C> triple(A a, B b, C c){
		return new TripleTuple<A, B, C>(a, b, c);
	}
	public static void main(String[] args) {
		TwoTuple<String, Integer> tuple = tuple("ABC",123);
		System.out.println(tuple.getClass().getCanonicalName());
		TwoTuple tuple2 = tuple("DEF", 456);
		TwoTuple<String, Integer> tuple3 = (TwoTuple<String, Integer>)tuple2;
		System.out.println(tuple2.getClass().getCanonicalName());
		TripleTuple<String, Integer, Integer> triple = triple("OJK", 123, 123);
		System.out.println(tuple3);
	}
}
