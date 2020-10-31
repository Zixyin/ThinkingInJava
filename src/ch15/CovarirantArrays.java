package ch15;

import java.util.ArrayList;
import java.util.List;

public class CovarirantArrays {
	public static void main(String[] args) {
		Fruit[] fruits = new Apple[10];
		fruits[0] = new Apple();
		fruits[2] = new Hfs();
		try {
			fruits[1] = new Orange();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			fruits[3] = new Fruit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//List<Fruit> list = new ArrayList<Orange>();
		List<? extends Fruit> list = new ArrayList<Apple>();
//		list.add(new Apple());
//		list.add(new Orange());
//		list.add(new Fruit());
//		list.add(new Object());
		List<? super Apple>	list2 = new ArrayList<Fruit>();

		list2.add(new Apple());
		list2.add(new Hfs());
		list.add(null);
		Fruit fruit = list.get(0);
	}
}

class Fruit{
	
}
class Apple extends Fruit{
	
}
class Hfs extends Apple{
	
}
class Orange extends Fruit{
	
}