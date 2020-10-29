package ch5;

public class Test3_7 {
	public static void main(String[] args) {
		char c = 0;
		Byte B = 0;
		new Dog().bark(B, c);
		new Dog("ininin").bark(c, B);
	}
}
class Dog{
	public Dog() {
		System.out.println("Call No Parameter~~~");
	}
	public Dog(String s) {
		System.out.println("Call String Parameter~~~\t" + s);
	}
	public void bark(short a, int b) {
		System.out.println("short\tint");
	}
	public void bark(int a, short b) {
		System.out.println("int\tshort");
	}
}