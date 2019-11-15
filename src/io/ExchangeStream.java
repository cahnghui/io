package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;


public class ExchangeStream {

	public static void main(String[] args) throws IOException {
		
		InputStream is = new FileInputStream("d:/许嵩-如果当时(超清).mp4");
		InputStreamReader isr = new InputStreamReader(is,"UTF-8");
		BufferedReader br = new BufferedReader(isr);
		OutputStream os = new FileOutputStream("E:/许嵩-如果当时(超清).mp4");
		OutputStreamWriter osw = new OutputStreamWriter(os,"UTF-8");
		BufferedWriter bw = new BufferedWriter(osw);
		int len = -1;
		char[] buf = new char[8];
		while((len=br.read(buf))!=-1)
		{
			bw.write(new String(buf.toString()));
		}
		br.close();
		isr.close();
		is.close();
		bw.close();
		osw.close();
		os.close();
	}
}
