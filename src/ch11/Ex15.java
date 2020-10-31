package ch11;

import java.util.Stack;

/**
 * @author YZX
 * @date 2020年5月23日
 * @time 上午6:45:54
 */

public class Ex15 {
	public static void main(String[] args) {
		Stack<Character> stack = new Stack<Character>();
		String s = "+U+n+c---+e+r+t---+a-+i-+n+t+y---+-+r+u--+l+e+s---";
		for(int i = 0;i < s.length();++ i) {
			switch(s.charAt(i)) {
			case '+':stack.push(s.charAt(++ i));break;
			case '-':System.out.print(stack.pop());break;
			}
		}
		System.out.println();
		System.out.println(stack);
	}
}
