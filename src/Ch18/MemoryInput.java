package Ch18;

import java.io.IOException;
import java.io.StringReader;

public class MemoryInput {
	public static void main(String[] args) throws IOException {
		StringReader sr = new StringReader(
				new BufferedInputFile().read("D://1.txt"));
		int c;
		while((c = sr.read()) != -1)
			System.out.print((char)c);
	}
}
