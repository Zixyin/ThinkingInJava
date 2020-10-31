package ch10;

/**
 * @author YZX
 * @date 2020年8月23日
 * @time 上午7:48:13
 */

public class Test11 {
	public static void main(String[] args) {
		Test11Interface inter = new Test11ClassA().rf();
		inter.f();
		System.out.println(inter.i);
//		Test11ClassA.Test11InnerB innerB = (Test11ClassA.Test11InnerB)inter;
//		System.out.println(innerB.i);
	}
}
interface Test11Interface {
	int i = 1;
	void f();
}
class Test11ClassA{
	private class Test11InnerB implements Test11Interface{
		int i = 2;
		public void f() {
			System.out.println(this);
		}
	}
	public Test11Interface rf() {
		return new Test11InnerB();
	}
}