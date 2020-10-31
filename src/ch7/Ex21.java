package ch7;

/**
 * @author YZX
 * @date 2020年5月20日
 * @time 上午9:30:35
 */

public class Ex21 {

}
class WithFinals {
	public final void f() {
		System.out.println("super:f");
	}
}
class OverrideFinal extends WithFinals {
//	@Override
//	public final void f() {
//		System.out.println("override:f");
//	}
}