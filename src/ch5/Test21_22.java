package ch5;

public class Test21_22 {
	enum RMB{
		ONE, FIVE, TEN, TWENTY, FIFTY, HUNDRED 
	}
	public static void main(String[] args) {
		for(RMB rmb:RMB.values()) {
			System.out.println(rmb.ordinal() + ":" + rmb.name());
			enumSwitch(rmb);
		}
	}
	public static void enumSwitch(RMB rmb) {
		switch(rmb) {
		case ONE:System.out.println(rmb.name() + ":TOO LITTLE");break;
		case FIVE:System.out.println(rmb.name() + ":DO YOU MEAN I AM FIVE?");break;
		case TEN:System.out.println(rmb.name() + ":JUST SOSO");break;
		case TWENTY:System.out.println(rmb.name() + ":ITS ENOUGH TO BUY SOMETHING");break;
		case FIFTY:System.out.println(rmb.name() + ":GOODGOOD");break;
		case HUNDRED:System.out.println(rmb.name() + ":OH YES I LIKE IT");
		}
	}
}
