package ch9;

public class Test4 {
	static void f(Blank blank) {
		((ExtendsBlank) blank).show();
	}
	static void f2(Blank2 blank2) {
		blank2.show();
	}
	public static void main(String[] args) {
		Blank blank = new ExtendsBlank();
		Blank2 blank2 = new ExtendsBlank2();
		f(blank);
		f2(blank2);
	}
}
abstract class Blank{
	
}
class ExtendsBlank extends Blank{
	void show() {
		System.out.println("EXTENDSBLANK");
	}
}

abstract class Blank2{
	abstract void show();
}
class ExtendsBlank2 extends Blank2{
	@Override
	void show() {
		// TODO Auto-generated method stub
		System.out.println("EXTENDSBLANK2");
	}
}

interface abc{
	
}