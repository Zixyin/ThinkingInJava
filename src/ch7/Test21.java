package ch7;

public class Test21 extends OverridingFinal{
	final void f(){
		
	}
	public static void main(String[] args) {
		OverridingFinal of = new Test21();
	}
}
class OverridingFinal{
	private final void f() {
		System.out.println("Basic");
	}
}