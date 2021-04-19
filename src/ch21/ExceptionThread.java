package ch21;

import java.lang.Thread.UncaughtExceptionHandler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class ExceptionThread {

	public static void main(String[] args) {
		Thread.setDefaultUncaughtExceptionHandler(new DefaultExceptionHandler());
		ExecutorService service = Executors.newCachedThreadPool(new MyThreadFactory());
		service.execute(() -> {
			System.out.println(Thread.currentThread().getName());
			throw new RuntimeException("RuntimeException");
			});
		ExecutorService service2 = Executors.newCachedThreadPool();
		service2.execute(() -> {
			System.out.println(Thread.currentThread().getName());
			throw new RuntimeException("RuntimeException");
		});
	}

}

class DefaultExceptionHandler implements UncaughtExceptionHandler {
	@Override
	public void uncaughtException(Thread t, Throwable e) {
		System.out.println("caught by DefaultExceptionHandler" + t.getName() + " throw Exception: " + e.getMessage());
	}
}

class MyThreadExceptionHandler implements UncaughtExceptionHandler {
	
	@Override
	public void uncaughtException(Thread t, Throwable e) {
		System.out.println("caught by MyThreadExceptionHandler" + t.getName() + " throw Exception: " + e.getMessage());
	}
	
}
class MyThreadFactory implements ThreadFactory {
	
	private static final MyThreadExceptionHandler HANDLER = new MyThreadExceptionHandler();
	
	@Override
	public Thread newThread(Runnable r) {
		Thread t = new Thread(r);
		t.setUncaughtExceptionHandler(HANDLER);
		return t;
	}
	
}