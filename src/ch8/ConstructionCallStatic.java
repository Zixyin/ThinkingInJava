package ch8;

public class ConstructionCallStatic {
	public static void main(String[] args) {
		A a = new B();
	}
}

class A{
	static void f() {
		System.out.println("Stayic");
	}
	final void f2() {
		System.out.println("A:f2()");
	}
}

class B extends A{
	B(){
		f();
		f2();
	}
//	final void f2() {
//		System.out.println("B:f2()");
//	}
	
}