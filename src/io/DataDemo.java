package io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class DataDemo {

	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("d:/test.txt");
		DataOutputStream dos= new DataOutputStream(os);
		String str = "zhongguo";
		dos.writeInt(3);
		dos.writeBoolean(true);
		dos.writeUTF(str);
		dos.close();
		os.close();
		
		InputStream is = new FileInputStream("d:/test.txt");
		DataInputStream dis = new DataInputStream(is);
		int num = dis.readInt();
		boolean bool = dis.readBoolean();
		String str1 = dis.readUTF();
		System.out.println(num);
		System.out.println(bool);
		System.out.println(str1);
	}
}
