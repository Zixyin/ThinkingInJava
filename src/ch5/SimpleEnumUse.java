package ch5;

public class SimpleEnumUse {
	enum Spiciness{
		NOT, MILD, MIDIUM, HOT, FLAMING
	}
	public static void main(String[] args) {
		Spiciness howHot = Spiciness.MIDIUM;
		System.out.println(howHot);
		System.out.println("howHot.getClass()" + howHot.getClass());
		System.out.println("howHot.name():" + howHot.name());
		System.out.println("howHot.ordinal()" + howHot.ordinal());
		for(Spiciness s:Spiciness.values()) {
			System.out.println(s.ordinal() + "-" + s.name());
		}
		//The static method values() from the type SimpleEnumUse.Spiciness
			//should be accessed in a static way
		//howHot.values();
	}
}
