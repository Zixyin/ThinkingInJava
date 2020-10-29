package Ch18;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class Test7 {
	public static LinkedList<String> read(String file) throws IOException {
		BufferedReader bf = new BufferedReader(new FileReader(file));
		LinkedList<String> fileList = new LinkedList<String>();
		String s;
		while((s = bf.readLine()) != null) 
			fileList.addFirst(s);
		return fileList;
	}
	public static void main(String[] args) {
		String file = "D:\\1.txt";
		LinkedList<String> list;
		try {
			list = read(file);
			while(!list.isEmpty())
				System.out.println(list.removeFirst());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
