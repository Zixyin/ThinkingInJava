package ch5;

public class Test1_2 {
	private static String s1 = "A", s2;
	public Test1_2(){
		System.out.println("Test2 Constructor:" + s1 + "\t" +s2);
		s2 = "B";
	}
	public static void main(String[] args) {
		//new Test2();
		System.out.println("main s1 & s2:" + s1 + "\t" + s2);
		Test3 t3 = new Test3();
		System.out.println("main s3 & s4:" + t3.gets3() + "\t" + t3.gets4());
	}
}

class Test3{
	private String s3, s4 = "D";
	public Test3() {
		System.out.println("Test3 Constructor:" + s3 + "\t" + s4);
		s3 = "C";
	}
	public String gets3() {
		return s3;
	}
	public String gets4() {
		return s4;
	}
}