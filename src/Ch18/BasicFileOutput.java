package Ch18;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;

public class BasicFileOutput {
	public static void main(String[] args) {
		String file = "D:\\2.txt";
		try {
			BufferedReader in = new BufferedReader(
					new StringReader(
							BufferedInputFile.read("D:\\1.txt")));
			PrintWriter out = new PrintWriter(
					new BufferedWriter(
							new FileWriter(file)));
			int lineCount = 1;
			String s;
			while((s = in.readLine()) != null){
				out.println(lineCount++ + ":" + s);
			}
			out.close();
			System.out.println(BufferedInputFile.read(file));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
