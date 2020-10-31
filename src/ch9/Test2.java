package ch9;

public class Test2 {
	public static void main(String[] args) {
		NotHaveAbstractFunction no = new NotHaveAbstractFunction() {};
		//HaveAbstractFunction has = new HaveAbstractFunction();
		System.out.println(no);
		no.f();
	}
}

abstract class NotHaveAbstractFunction {
	void f() {
		System.out.println("FFFFFF");
	}
}
abstract class HaveAbstractFunction{
	abstract void g();
}