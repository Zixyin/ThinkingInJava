package ch15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RandomList<T> {
	private List<T> randomList = new ArrayList<T>();
	private Random rand = new Random(47);
	public void add(T t) {
		randomList.add(t);
	}
	public T remove(int index) {
		return randomList.remove(index);
	}
	public T select() {
		return randomList.get(rand.nextInt(randomList.size()));
	}
	
	public static void main(String[] args) {
		RandomList<Character> list = new RandomList<Character>();
		for (Character c :  "I L O V E Y O U".toCharArray())
			list.add(c);
		for(int i = 0;i < new Random(47).nextInt(20);i ++) {
			System.out.print(list.select());
		}
	}
}
