package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;


public class FileDemo {
	
	public static void main(String[] args) throws Exception {
		File file = new File("d:/1.txt");
		System.out.println(file.exists());
		OutputStream os = new FileOutputStream("d:/1.txt");
		String s = "hello wold this is changhui is a good boy";
		os.write(s.getBytes());
		InputStream is = new FileInputStream(file);
		int len=-1;
		StringBuffer sb = new StringBuffer();
		while((len=is.read())!=-1)
		{
			sb.append((char)len);
		}
		System.out.println(new String(sb));
	}
}
