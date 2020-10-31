package Ch18;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;

public class FormateMemoryInput {
	public static void main(String[] args) {
		try {
			DataInputStream in = new DataInputStream(
					new ByteArrayInputStream(
							BufferedInputFile.read("D://1.txt").getBytes()));
			while(true)
				System.out.print((char)in.readByte());
		} catch (IOException e) {
			System.out.println("end");
		}
		
	}
}
