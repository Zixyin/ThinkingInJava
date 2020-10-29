package Ch18;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

public class Test8 {
	public static LinkedList<String> read(String file) throws IOException {
		BufferedReader bf = new BufferedReader(new FileReader(file));
		LinkedList<String> fileList = new LinkedList<String>();
		String s;
		while((s = bf.readLine()) != null) 
			fileList.addFirst(s);
		return fileList;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String file = sc.next();
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
