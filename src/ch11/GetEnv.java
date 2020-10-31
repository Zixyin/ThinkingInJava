package ch11;

import java.util.Map;

/**
 * @author YZX
 * @date 2020年5月23日
 * @time 上午9:02:07
 */

public class GetEnv {
	public static void main(String[] args) {
		for(Map.Entry entry:System.getenv().entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}
}
