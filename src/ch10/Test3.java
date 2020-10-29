package ch10;

public class Test3 {
	private String s;
	public Test3(String s) {
		this.s = s;
	}
	class Inner{
		public String toString() {
			System.out.println(s);
			return s;
		}
	}
	public Inner getInner() {
		return new Inner();
	}
	public static void main(String[] args) {
		Test3.Inner inner = new Test3("ABC").getInner();
		inner.toString();
		
	}
}
