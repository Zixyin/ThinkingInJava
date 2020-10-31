package ch13;

import java.util.Formatter;

/**
 * @author YZX
 * @date 2020年5月24日
 * @time 上午8:34:09
 */

public class Ex5 {
	public static void main(String[] args) {
		Formatter f = new Formatter(System.out);
		f.format("b:%b\ts:%s\td:%d\n", null, null, null);
		f.format("b:%b\ts:%s\td:%d\n", 0, 0, 0);
		f.format("b:%b\ts:%s\n", '0', '0');
	}
}
