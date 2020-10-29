package ch10;

public class Test2 {
	public static void main(String[] args) {
		Sequence sequence = new Sequence(5);
		for(int i = 0;i < 5;i++) 
			sequence.add(new HasString(Integer.toString(i)));
		Selector selector = sequence.getSelector();
		while(!selector.end()) {
			System.out.println(selector.current().toString());
			selector.next();
		}
	}
}
class HasString{
	private String s;
	public HasString(String s) {
		this.s = s;
	}
	public String toString() {
		System.out.println(s);
		return s;
	}
}