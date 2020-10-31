package ch15;

public class Test20 {
	public static <T extends Test20Face> void func(T t) {
		t.f();
		t.g();
	}
	public static void main(String[] args) {
		func(new Test20Class());
	}
}

interface Test20Face{
	void f();
	void g();
}

class Test20Class implements Test20Face{
	@Override
	public void f() {
		// TODO Auto-generated method stub
		System.out.println("FFFFF");
	}
	@Override
	public void g() {
		// TODO Auto-generated method stub
		System.out.println("GGGGG");
	}
	public <T> void h() {
		
	}
}