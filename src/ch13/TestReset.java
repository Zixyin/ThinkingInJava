package ch13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author YZX
 * @date 2020年5月26日
 * @time 上午9:13:55
 */

public class TestReset {
	public static void main(String[] args) {
		String regex = "[frb][aiu][gx]";
		Matcher m = Pattern.compile(regex).matcher("fix the rug");
		while(m.find())
			System.out.print(m.group() + " ");
		System.out.println();
		m.reset("rug with bag bag");
		while(m.find())
			System.out.print(m.group() + " ");
	}
}
