package 户籍管理;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class PersonManger {

	public static String preName="d:/persons/";
	public static void insert(Person person) throws Exception {
		int id = person.getID();
		String name = person.getName();
		int age = person.getAge();
		String gender = person.getGender();

		OutputStream os = new FileOutputStream(preName+id+".txt");
		DataOutputStream dos = new DataOutputStream(os);
		dos.writeInt(id);
		dos.writeUTF(name);
		dos.writeInt(age);
		dos.writeUTF(gender);

		dos.close();
		os.close();

		System.out.println("录入成功");
	}

	public static void findAll() throws Exception {
		File file = new File("d:/persons/");
		File[] files = file.listFiles();
		for (File file2 : files) {
			InputStream is = new FileInputStream(file2);
			DataInputStream dis = new DataInputStream(is);
			System.out.println(
					"ID:" + dis.readInt() + "姓名：" + dis.readUTF() + "年龄：" + dis.readInt() + "性别：" + dis.readUTF());
			
			dis.close();
			is.close();
		}

	}

	public static void selectById(int id) throws Exception {

		String number = new Integer(id).toString();
		File file = new File("d:/persons/");
		File[] files = file.listFiles();
		for (int i = 0; i < files.length; i++) {
			if(files[i].getName().contains(number))
			{
				InputStream is = new FileInputStream(files[i]);
				DataInputStream dis = new DataInputStream(is);
				System.out.println(
						"ID:" + dis.readInt() + "姓名：" + dis.readUTF() + "年龄：" + dis.readInt() + "性别：" + dis.readUTF());
				
				dis.close();
				is.close();
			}
		}
	}
}
