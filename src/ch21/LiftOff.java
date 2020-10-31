package ch21;

/**
 * @author YZX
 * @date 2020年8月16日
 * @time 上午8:27:37
 */

public class LiftOff implements Runnable{
	protected int countDown = 10;
	private static int takcCount = 0;
	private final int id = takcCount++;
	public LiftOff() {}
	public LiftOff(int countDown) {
		this.countDown = countDown;
	}
	public String staff() {
		return "#" + id + "(" + (countDown > 0 ? countDown : "LiftOff!") + ")";
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(countDown-- > 0) {
			System.out.println(staff());
			Thread.yield();
		}
	}
}
