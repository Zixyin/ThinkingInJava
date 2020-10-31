package ch21;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author YZX
 * @date 2020年8月16日
 * @time 上午10:23:30
 */

class TaskWithResult implements Callable<String>{
	private int id;
	public TaskWithResult(int id) {
		// TODO Auto-generated constructor stub
		this.id = id;
	}
	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		return "result of TakeWithResult: " + id;
	}
}
public class CallableDemo {
	public static void main(String[] args) {
		ExecutorService exec = Executors.newCachedThreadPool();
		ArrayList<Future<String>> results = new ArrayList<Future<String>>();
		for(int i = 0;i < 10;i++) 
			results.add(exec.submit(new TaskWithResult(i)));
		for(Future<String> future:results)
			try {
				System.out.println(future.get());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				exec.shutdown();
			}
	}
}