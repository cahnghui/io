package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class Demo {
	public static void main(String[] args) throws Exception {
		File file = new File("E:\\Hbuilder\\��Ŀ\\��ý��\\����-�����ʱ(����).mp4");
		InputStream is = new FileInputStream(file);
		OutputStream os = new FileOutputStream("D:\\����-�����ʱ(����).mp4");
		StringBuffer buf = new StringBuffer();
		int len = -1,count=0;
		byte[] b = new byte[512];
		while((len=is.read(b))!=-1)
		{
			os.write(b);
			System.out.println(count);
			count++;
		}
		is.close();
		os.close();
		System.out.println("wancehgn");
	}
}
