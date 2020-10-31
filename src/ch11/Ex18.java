package ch11;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author YZX
 * @date 2020年5月23日
 * @time 上午7:41:00
 */

public class Ex18 {
	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String,String>();
		//Set<String> set = new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
		map.put("yzxgsaa", "aaa");
		map.put("zsdgas", "aaa");
		map.put("abcas", "bbb");
		map.put("gada", "ccc");
		System.out.println("map:" + map);
		System.out.println(map.keySet());
//		System.out.println(map.values());
		String[] key = map.keySet().toArray(new String[0]);
		System.out.println(Arrays.toString(key));
		Arrays.sort(key);
		System.out.println(Arrays.toString(key));
		Map<String,String> omap = new LinkedHashMap<String,String>();
		for(String s : key)
			omap.put(s, map.get(s));
		System.out.println(omap);
	}
}
