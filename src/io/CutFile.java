package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;


public class CutFile {

	public static void cut(String src,int cutCount) throws Exception
	{
		File file = new File(src);
		byte[] buf = new byte[(int) file.length()/cutCount+1];
		InputStream is = new FileInputStream(file);
		BufferedInputStream bis = new BufferedInputStream(is);
		int len = -1,number=0;
		while((len=bis.read(buf))!=-1)
		{
			OutputStream os = new FileOutputStream("d:/"+file.getName().substring(0, file.getName().indexOf('.'))+number+".bak");
			BufferedOutputStream bos = new BufferedOutputStream(os);
			bos.write(buf, 0, len);;
			bos.close();
			number++;
		}
		bis.close();
		is.close();
		System.out.println("cutfinish....");
	}
	public static void merge(String[] src,String newfile) throws Exception
	{
		OutputStream os = new FileOutputStream(newfile);
		BufferedOutputStream bos = new BufferedOutputStream(os);
		for(int i=0;i<src.length;i++)
		{
			File file = new File(src[i]);
			InputStream is = new FileInputStream(file);
			BufferedInputStream bis = new BufferedInputStream(is);
			byte[] buf = new byte[(int) file.length()];
			bis.read(buf);
			bos.write(buf);
			bis.close();
			is.close();
		}
		bos.close();
		os.close();
		System.out.println("merge.....");
	}
	public static void main(String[] args) throws Exception {
//		cut("d:/许嵩-如果当时(超清).mp4",3);
		String[] str = {"d:/许嵩-如果当时(超清)0.bak","d:/许嵩-如果当时(超清)1.bak","d:/许嵩-如果当时(超清)2.bak"};
		merge(str,"d:/许嵩-如果当时.mp4");
	}
}
