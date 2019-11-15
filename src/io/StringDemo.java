package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class StringDemo {

	public static void main(String[] args) throws Exception {
		
		OutputStream os = new FileOutputStream("d:/test.txt");
		String str = 3+new Boolean(true).toString()+"ÖÐ¹ú";
		OutputStreamWriter osw = new OutputStreamWriter(os);
		osw.write(str);
		osw.close();
		os.close();
		File file = new File("d:/test.txt");
		InputStream is = new FileInputStream(file);
		byte[] buf = new byte[(int) file.length()];
		is.read(buf);
		String str1 = new String(buf);
		String str2 = str1.substring(0, 1);
		String str3 = str1.substring(1, 5);
		String str4 = str1.substring(5, 7);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
	}
}
