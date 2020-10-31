package ch5;

public class VariableParamList {
	public static void main(String[] args) {
		print("A", "B", "C");
		print();
		System.out.println(new int[0].getClass());
		System.out.println(new Integer[0].getClass());
		f(1, 'a');
		//f('a', 'b');//The method f(float, Character[])
						//is ambiguous for the type VariableParamList
	}
	static void print(String...strings ) {
		for(String s:strings) {
			System.out.println(s);
		}
		if(strings.length == 0)
			System.out.println("EMPTY");
	}
	static void f(float f, Character...is) {
		System.out.println("first");
	}
	static void f(Character...is) {
		System.out.println("second");
	}
//将上面的方法替换如下即可
//	static void f(char c, Character...is) {
//		System.out.println("second");
//	}
}
