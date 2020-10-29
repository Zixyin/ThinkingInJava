package Ch18;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedInputFile {
	public static void main(String[] args) {
		try {
			System.out.println(read("D:\\eclipse\\workplace\\ThinkingInJava\\bin\\Ch18\\1.txt"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static String read(String filename) throws IOException {
		BufferedReader bf = new BufferedReader(
				new FileReader(filename));
		String s; 
		StringBuilder sb = new StringBuilder();
		while((s = bf.readLine()) != null) {
			sb.append(s + "\n");
		}
		bf.close();
		return sb.toString();
	}
}
