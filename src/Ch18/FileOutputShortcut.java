package Ch18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;

public class FileOutputShortcut {
	public static void main(String[] args) {
		String file = "D:\\3.txt";
		try {
			BufferedReader in = new BufferedReader(
					new StringReader(
							BufferedInputFile.read("D:\\1.txt")));
			PrintWriter out = new PrintWriter(file);
			String s;
			int lineCount = 1;
			while((s = in.readLine()) != null)
				out.println(lineCount++ + ": " + s);
			out.close();
			System.out.println(BufferedInputFile.read(file));
				
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}