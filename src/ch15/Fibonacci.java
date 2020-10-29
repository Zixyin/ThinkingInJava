package ch15;

public class Fibonacci implements Generator<Integer>{
	private static int count = 0;
	public int fbn(int n) {
		if(n == 1 || n == 2)
			return 1;
		else return fbn(n - 1) + fbn(n - 2);
	}
	@Override
	public Integer next() {
		// TODO Auto-generated method stub
		return fbn(++count);
	}
	public static void main(String[] args) {
		Fibonacci fb = new Fibonacci();
		for(int i = 0;i < 10;++i) {
			System.out.println(fb.next());
		}
	}
}
