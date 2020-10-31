package ch13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author YZX
 * @date 2020年5月25日
 * @time 上午9:29:23
 */

public class Ex10 {
	public static void main(String[] args) {
		if(args.length < 2) {
			System.out.println("Usage:\njava TestRegularExpression" 
					+ "characterSequence regularExpression+");
			System.exit(0);
		}
		String test = "Java now has regular expressions";
		System.out.println("Input: \"" + test + "\"");
		for(String arg: args) {
			System.out.println("Regular expression:\"" + arg +"\"");
			Pattern.matches(arg, test);		//匹配整个字符串
			Pattern p = Pattern.compile(arg);
//			for(String s:p.split(test))
//			System.out.println(s);
			Matcher m = p.matcher(test);
			while(m.find()) {
//				System.out.println("Match \"" + m.group() + "\" at positions " 
//					+ m.start() + "-" + (m.end() - 1));
				for(int i = 0;i <= m.groupCount();++ i) 
					System.out.print("[" + m.group(i) + "] ");
				System.out.println();
			}
		}
	}
}
