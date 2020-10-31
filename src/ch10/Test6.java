package ch10;

/**
 * @author YZX
 * @date 2020年8月23日
 * @time 上午7:21:41
 */

public class Test6 {
	public static void main(String[] args) {
		new Test6ClassB().returnInterface().f();
	}
}
interface Test6Interface{
	void f();
}
class Test6ClassA{
	protected class InnerB implements Test6Interface{
		@Override
		public void f() {
			// TODO Auto-generated method stub
			System.out.println("B:f(); ");
		}
	}
}
class Test6ClassB extends Test6ClassA{
	Test6Interface returnInterface() {
		return new InnerB();
	}
}