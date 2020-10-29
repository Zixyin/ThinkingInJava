package ch5;

public class ByteIncreament {
	void f(char c) {
		System.out.println("char\t" + c);
	}
	void f(short c) {
		System.out.println("short\t" + c);
	}
	public static void main(String[] args) {
		Byte X = 0;
		new ByteIncreament().f(X);
	}
}
