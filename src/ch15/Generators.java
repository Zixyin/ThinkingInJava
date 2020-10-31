package ch15;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class Generators {
	public static <T> Collection<T> fill(Collection<T> collection, Generator<T> generator, int size){
		for(int i = 0;i < size;i++) 
			collection.add(generator.next());
		return collection;
	}
	public static <T> List<T> fill(List<T> collection, Generator<T> generator, int size){
		for(int i = 0;i < size;i++) 
			collection.add(generator.next());
		return collection;
	}
	public static <T> ArrayList<T> fill(ArrayList<T> collection, Generator<T> generator, int size){
		for(int i = 0;i < size;i++) 
			collection.add(generator.next());
		return collection;
	}
	public static <T> Queue<T> fill(Queue<T> collection, Generator<T> generator, int size){
		for(int i = 0;i < size;i++) 
			collection.add(generator.next());
		return collection;
	}
	public static <T> Set<T> fill(Set<T> collection, Generator<T> generator, int size){
		for(int i = 0;i < size;i++) 
			collection.add(generator.next());
		return collection;
	}
	public static void main(String[] args) {
		Collection<Coffee> coffees = fill(new ArrayList<Coffee>(), new CoffeeGenerator(), 5);
		for(Coffee coffee : coffees)
			System.out.println(coffee);
		Collection<Integer> fibonacci = fill(new ArrayList<Integer>(), new Fibonacci(), 18);
		for(int i : fibonacci)
			System.out.print(i + " ");
//		List<Coffee> list = fill(new LinkedList<Coffee>(), new CoffeeGenerator(), 5);
//		for(Coffee coffee : list)
//			System.out.println(coffee);
//		ArrayList<Coffee> list2 = fill(new LinkedList<Coffee>(), new CoffeeGenerator(), 5);
//		for(Coffee coffee : list2)
//			System.out.println(coffee);
	}
}
