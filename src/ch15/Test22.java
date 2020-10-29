package ch15;

import java.lang.reflect.InvocationTargetException;

public class Test22 {
	public static void main(String[] args) {
		try {
			Tool t = new RefBuildClass<Tool>(Tool.class).getT("ch15.Tool");
			System.out.println(t.getLength());
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
				| NoSuchMethodException | SecurityException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class Tool{
	private int length;
	public Tool(Integer length) {
		this.length = length;
	}
	public int getLength() {
		return length;	
	}
}

class RefBuildClass<T> {
	Class<T> type;
	public RefBuildClass(Class<T> type) {
		this.type = type;
	}
	@SuppressWarnings("unchecked")
	public T getT(String typeName) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException {
		return (T) Class.forName(typeName).getDeclaredConstructor(Integer.class).newInstance(1);
	}
}