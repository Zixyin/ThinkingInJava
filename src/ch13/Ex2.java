package ch13;

/**
 * @author YZX
 * @date 2020年5月24日
 * @time 上午7:20:37
 */

public class Ex2 {
	public static void main(String[] args) {
		System.out.println(new InfiniteRecusion());
		String s = "hello world!";
		System.out.println(s);
		System.out.println(s.contains("hello wa"));
		System.out.println(s.indexOf(101));
		System.out.println(s.indexOf("e"));
		System.out.println(s.lastIndexOf("ell"));
		String begin = s.substring(0,6);
		System.out.println(begin);
		String end = s.substring(6);
		System.out.println(end);
		System.out.println(begin.concat(end));
		System.out.println(s.replace('o', 'a'));
		System.out.println(s.replace("hello", "nihao"));
	//首先检查字符串池中是否有”ab”这个字符串，如果存在则返回这个字符串的引用，
	//否则就将这个字符串添加到字符串池中，然会返回这个字符串的引用。
	//err与 out的区别，err在eclipse输出是红色，out会有缓冲，err没有（可以设置）
		System.err.println(s.intern());	
		
	}
}

class InfiniteRecusion{
	@Override
	public String toString() {
		return "InfiniteRecusion address:" + super.toString()+ "\n";
	}
}