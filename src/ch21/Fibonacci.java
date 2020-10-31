package ch21;

/**
 * @author YZX
 * @date 2020年8月16日
 * @time 上午9:28:49
 */

public class Fibonacci implements Runnable{
	private int n = 0;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(n < 100) {
			n ++;
			System.out.println(Thread.currentThread().getName() + ":"+ n);
		}
	}
}
