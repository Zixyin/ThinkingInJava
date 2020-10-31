package ch8;

public class ConstuctionInitialDemo {
	public static void main(String[] args) {
		new Sun();
	}
}
class Father{
	private Hands h;
	{
		h = new Hands("Father's");
	}
	Eyes e = new Eyes("Father's");
	Father(){
		System.out.println("FatherCon");
	}
}
class Eyes{
	public Eyes(String s) {
		System.out.println(s + "Eyes");
	}
}
class Hands{
	Hands(String s){
		System.out.println(s + "Hands");
	}
	
}
class Sun extends Father{	
	private Eyes e = new Eyes("Sun's");
	Hands h ;
	{
		h = new Hands("Sun's");
	}
	Sun(){
		System.out.println("SunCon");
	}
}