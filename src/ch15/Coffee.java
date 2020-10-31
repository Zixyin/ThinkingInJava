package ch15;

public class Coffee {
	private static long counter = 0;
	private final long id = counter ++;
	public String toString() {
		return getClass().getSimpleName()+ " " + id;
	}
	public static void main(String[] args) {
		System.out.println(new Coffee().toString());
		System.out.println(new Coffee().getClass().getCanonicalName());
		System.out.println(new Coffee().getClass().getTypeName());
		System.out.println(new Coffee().getClass().getName());
		System.out.println(new Coffee().getClass().getSimpleName());
	}
}
class Latte extends Coffee{
	
}
class Mocha extends Coffee{
	
}
class Cappuccino extends Coffee{
	
}
class Americano extends Coffee{
	
}
class Breve extends Coffee{
	
}