package ch10;

public class Test13 {
	public Test13Interface getInterface() {
		return new Test13Interface() {
			public void f() {
				System.out.println("My Interface Instantiate");
			}
		};
	}
	public static void main(String[] args) {
		new Test13().getInterface().f();
	}
}

interface Test13Interface {
	void f() ;
}