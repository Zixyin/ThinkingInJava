package ch8;

public class CovariantReturn {
	public static void main(String[] args) {
		
	}
}
class Grain{
	int f() {
		System.out.println("Grainf()");
		return 0;
	}
}
class Wheat extends Grain{
	//The return type is incompatible with Grain.f()
	//float f() {	}
}
