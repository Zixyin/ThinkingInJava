package ch10;

public class Test15 {
	public static void main(String[] args) {
		Test15Out2 out = new Test15Out2();
		Test15Out1 out2 = out.getOut(47);
		System.out.println(out2.getValue());
	}
}
class Test15Out1{
	private int value;
	public int getValue() {
		return value;
	}
	public Test15Out1(int value) {
		this.value = value;
	}
}
class Test15Out2{
	public Test15Out1 getOut(final int value1) {
		return new Test15Out1(value1) {
			private int value = value1;
			public int getValue() {
				return value;
			}
		};
	}
}