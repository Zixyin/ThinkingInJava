package ch5;

public class TestMultiThread {
	public static void main(String[] args) {
        Thread thread01 = new Thread(() -> {
            for (int i = 0; i < 10; ++i) {
                System.out.println(Thread.currentThread().getName() + ".........i=" + i);
            }
        }, "thread01");
        thread01.start();

        for (int i = 0; i <10 ; ++i) {
            System.out.println(Thread.currentThread().getName() + "....j=" + i);
        }
}
}