package Ch18;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestEOF {
	public static void main(String[] args) {
		try {
			DataInputStream in = new DataInputStream(
					new BufferedInputStream(
							new FileInputStream("D:\\1.txt")));
				while(in.available() != 0)
					System.out.print((char)in.readByte());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}
}
}