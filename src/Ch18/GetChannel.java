package Ch18;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class GetChannel {
	private static final int BSIZE = 1024;
	public static void main(String[] args) throws IOException {
		
		String file = "D:\\4.txt";
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		FileChannel channel = fileOutputStream.getChannel();
		ByteBuffer wrap = ByteBuffer.wrap("some text".getBytes());
		channel.write(wrap);
		channel.close();
		RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
		FileChannel channel2 = randomAccessFile.getChannel();
		channel2.position(channel2.size());
		channel2.write(ByteBuffer.wrap("some more".getBytes()));
		channel2.close();
		FileChannel channel3 = new FileInputStream(file).getChannel();
		ByteBuffer allocate = ByteBuffer.allocate(BSIZE);
		channel3.read(allocate);
		allocate.flip();
		while(allocate.hasRemaining())
			System.out.print((char)allocate.get());
	}
}
