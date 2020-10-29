package ch5;

public class StaticInitializetion {
	public static void main(String[] args) {
		System.out.println(StaticDemo.a);
	}
}
class StaticDemo{
	public static int a;
	Bowl b1 = new Bowl(1);
	public StaticDemo() {
		a = 1; 
		System.out.println("DO STATIC CONSTRUCTION");
	}
	static Bowl b2 = new Bowl(2);
}
class Bowl{
	public Bowl(int n) {
		System.out.println("DO BOWL CONSTRUCTION" + n);
	}
}