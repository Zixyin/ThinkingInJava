package ch10;

/**
 * @author YZX
 * @date 2020年8月23日
 * @time 上午7:42:23
 */

public class Test9 {
	public static void main(String[] args) {
		new Test9ClassA().rf().f();;
	}
}
interface Test9Interface{
	void f();
}
class Test9ClassA{
	Test9Interface rf() {
		class RfInner implements Test9Interface{
			public void f(){
				System.out.println(System.nanoTime());
				System.out.println(System.currentTimeMillis());
			}
		}
		return new RfInner();
	}
}