package ch15;

public class MyStack<T> {
	Node<T> top = new Node<T>();
	int size = 0;
	public void push(T item) {
		++ size;
		top = new Node<T>(item, top);
	}
	public T pop() {
		T result = top.item;
		if(!top.end()) {
			-- size;
			top = top.next;
		}
		return result;
	}
	public T top() {
		return top.item;
	}
	public int size() {
		return size;
	}
	public boolean isEmpty() {
		return size == 0;
	}
	public static void main(String[] args) {
		MyStack<String> stringStack = new MyStack<String>();
		for(String s : "I LOVE PROGRAM !!!".split(" "))
			stringStack.push(s);
		while(!stringStack.isEmpty())
			System.out.println(stringStack.size + "\t" + stringStack.pop());
	}
}

class Node<U>{
	U item;
	Node<U> next;
	public Node() {
		item = null;
		next = null;
	}
	public Node(U item, Node<U> next) {
		this.item = item;
		this.next = next;
	}
	public boolean end() {
		return item == null && next == null;
	}

}