package ch15;

public class BasicGenerator<T> implements Generator<T>{
	private Class<T> type;
	public BasicGenerator(Class<T> type) {
		this.type = type;
	}

	@Override
	public T next() {
		try {
			return type.newInstance();
		} catch (InstantiationException e) {
			throw new RuntimeException(e);
		} catch (IllegalAccessException e) {
			throw new RuntimeException(e);
		}
	}
	public static <T> Generator<T> create(Class<T> type){
		return new BasicGenerator<T>(type);
	}
	public static void main(String[] args) {
		Generator<CountedObject> generator = BasicGenerator.create(CountedObject.class);
		for(int i = 0;i < 5;i ++) 
			System.out.println(generator.next());
		Generator<CountedObject> generator2 = new BasicGenerator<CountedObject>(CountedObject.class);
		for(int i = 0;i < 5;i ++)
			System.out.println(generator2.next());
	}
}

class CountedObject{
	private static int count = 0;
	private final int id = count ++;
	CountedObject(){
		
	}
	public int getId() {
		return id;
	}
	public String toString() {
		return this.getClass().getName() + " " + id;
	}
}
