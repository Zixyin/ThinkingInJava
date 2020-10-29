package ch7;

public class Test16_17 {
	public static void main(String[] args) {
		Car car = new Benz();
		car.run();
		car.fly();
	}
}

class Car {
	void run() {
		System.out.println("~~~~~~~~~~");
	}
	void fly() {
		System.out.println("ITS IMPOSSIBLE");
	}
}
class Benz extends Car{
	@Override
	void run() {
		// TODO Auto-generated method stub
		System.out.println("------------------");
	}
}