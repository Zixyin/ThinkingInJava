package ch5;


class Book{
	boolean checkedOut = false;
	void checkIn() {
		checkedOut = false;
	}
	public Book(boolean checkedOut) {
		this.checkedOut = checkedOut;
	}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		if(checkedOut)
			System.out.println("Error!!!");
		super.finalize();
	}
}

public class TerminationCondition {
	public static void main(String[] args) {
		Book b1 = new Book(true);
		b1.checkIn();
		new Book(true);
		System.gc();
	}
}
