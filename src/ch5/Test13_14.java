package ch5;

class Cup{
	public Cup(int n){
		System.out.println("Cup Construction\t" + n);
	}
	void f(int n) {
		System.out.println("Cup.f\t" + n);
	}
}

class Cups{
	static Cup cup1 = new Cup(1);
	static Cup cup2;
	static {
		cup2 = new Cup(2);
	}
	Cups(int n){
		System.out.println("Cups Construction" + n);
	}
}

public class Test13_14 {
	public static void main(String[] args) {
		System.out.println("main()");
		Cups.cup1.f(0);
	}
}
