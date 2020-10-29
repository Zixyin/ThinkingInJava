package ch10;

public class AnonymousWithArg {
	public Anonymous1 geta1(final int j) {
		return new Anonymous1() {
			private int i = j;
			//The value of the field new Anonymous1(){}.j is not used
			//private int j = 1;
			public int geti() {
				return ++i;
			}
		};
	}
	public Anonymous1 geta2(final int j) {
		return new Anonymous1(j) {
			public  int geti() {
				int i = j;
				//The final local variable i cannot be assigned, 
				//since it is defined in an enclosing type
				//return ++i;
				return j;
			}
		};
	}
	public static void main(String[] args) {
		Anonymous1 a1 = new AnonymousWithArg().geta1(2);
		System.out.println(a1.geti());
		Anonymous1 a2 = new AnonymousWithArg().geta2(2); 
		System.out.println(a2.geti());
	}
}
class Anonymous1{
	private int i;
	public int geti() {
		return i;
	}
	public Anonymous1() {
		
	}
	public Anonymous1(int i) {
		this.i = i;
	}
}