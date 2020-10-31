package ch10;

/**
 * @author YZX
 * @date 2020年8月23日
 * @time 上午7:27:14
 */

public class Test7 {
	public static void main(String[] args) {
		Test7ClassA a = new Test7ClassA();
		Test7ClassA.InnerB inner1 = new Test7ClassA().new InnerB();
		Test7ClassA.InnerB inner2 = new Test7ClassA().getInnerB();
		Test7ClassA.InnerB inner3 = a.new InnerB();
		Test7ClassA.InnerB inner4 = a.getInnerB();
		inner1.changeId(2);
		inner2.changeId(3);
		inner3.changeId(4);
		inner4.changeId(5);
	}
}

class Test7ClassA{
	private int id = 1;
	private int f() {
		return this.id;
	}
	class InnerB{
		void changeId(int id) {
			System.out.println("Before:" + f());
			Test7ClassA.this.id = id;
			System.out.println("After:" + f());
		}
	}
	InnerB getInnerB() {
		return new InnerB();
	}
}