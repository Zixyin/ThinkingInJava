package ch9;

public class Test3 {
	public static void main(String[] args) {
		ExtendsAbstract ea = new ExtendsAbstract();
		ea.print();
		BasicAbstract ba = new ExtendsAbstract();
		ba.print();
	}
}

abstract class BasicAbstract{
	abstract void print();
	public BasicAbstract() {
		print();
	}
}
class ExtendsAbstract extends BasicAbstract{
	private int n = 10;
	@Override
	void print() {
		// TODO Auto-generated method stub
		System.out.println("Extends:" + n);
	}
}