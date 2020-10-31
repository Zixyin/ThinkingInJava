package ch13;

import java.io.BufferedReader;
import java.io.StringReader;
import java.util.Scanner;

/**
 * @author YZX
 * @date 2020年5月26日
 * @time 上午9:29:55
 */

public class Ex20 {
	public static void main(String[] args) {
		String s = "asi dofjaj123q23 jadskf\n100 1000000000 1.12345 123.1234556";
		TestScanner ts = new TestScanner(s);
		System.out.println(ts.toString());
	}
}

class TestScanner{
	private int i;
	private long l;
	private float f;
	private double d;
	private String s;
	public TestScanner(String str) {
		BufferedReader br = new BufferedReader(new StringReader(str));
		Scanner stdin = new Scanner(br);
		s = stdin.nextLine();
		i = stdin.nextInt();
		l = stdin.nextLong();
		f = stdin.nextFloat();
		d = stdin.nextDouble();
	}
	public String toString() {
		String str = "int:" + i +"\nlong:" + l +"\nfloat:" + f + "\ndouble:" + d + "\nString:" + s;
		return str;	
	}
}