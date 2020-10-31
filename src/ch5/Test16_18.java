package ch5;

public class Test16_18 {
	public static void main(String[] args) {
		StringArray[] array;
		array = new StringArray[] 
			{
				new StringArray("AAAAA"),
				new StringArray("BBBBB"),
				new StringArray(),
			};
	}
}

class StringArray{
	StringArray(String s){
		System.out.println(s);
	}
	StringArray(){
		System.out.println("Default Construction");
	}
}