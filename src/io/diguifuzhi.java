package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;



public class diguifuzhi {
	public static void function(File file) throws Exception
	{
		if(file.isDirectory())
		{
			File newfile = new File("e"+file.getPath().substring(1));
			newfile.mkdirs();
			File[] files = file.listFiles();
			for(File file2: files) 
			{
				function(file2);
			}
		}
		if(file.isFile())
		{
			InputStream is = new FileInputStream(file);
			OutputStream os = new FileOutputStream("e"+file.getPath().substring(1));
			byte[] buf = new byte[(int) file.length()];
			is.read(buf);
			os.write(buf);
			is.close();
			os.close();
		}
	}
	public static void main(String[] args) throws Exception 
	{
		File file = new File("d:/Ó¢ÐÛÊ±¿Ì");
		function(file);
	}
}
