package ch10;

public class Test12 {
	private int i;
	private void setI(int i) {
		this.i = i;
	}
	private int getI() {
		return i;
	}
	public Test12OutClass getTest12Inner() {
		return new Test12OutClass() {
			public void setValue(int i) {
				System.out.println("Before Set:\t" + Test12.this.i);
				setI(i);
				System.out.println("After Set:\t" + Test12.this.i);
			}
			public int getValue() {
				return getI();
			}
		};
	}
	public static void main(String[] args) {
		Test12 test = new Test12();
		Test12OutClass out = test.getTest12Inner();
		System.out.println(out.getValue());
		out.setValue(47);
	}
}
class Test12OutClass{
	private int value;
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
}