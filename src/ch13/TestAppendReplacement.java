package ch13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author YZX
 * @date 2020年5月26日
 * @time 上午9:05:49
 */

public class TestAppendReplacement {
	public static void main(String[] args) {
		String s = "hello world!";
		StringBuffer buf = new StringBuffer();
		Pattern p = Pattern.compile("[aeiou]");
		Matcher m = p.matcher(s);
		while(m.find()) {
			m.appendReplacement(buf, m.group().toUpperCase());
			System.out.println(buf);
		}
		System.out.println(buf);
		m.appendTail(buf);
		System.out.println(buf);
	}
}
