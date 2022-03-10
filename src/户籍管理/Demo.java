package »§¼®¹ÜÀí;

public class Demo {
public static void main(String[] args) throws Exception {
	Person person1 = new Person(1110,"zhangsan1",20,"nan");
	Person person2 = new Person(1111,"zhangsan2",20,"nan");
	Person person3 = new Person(1112,"zhangsan3",20,"nan");
	Person person4 = new Person(1113,"zhangsan4",20,"nan");
	Person person5 = new Person(1114,"zhangsan5",20,"nan");
	Person person6 = new Person(1115,"zhangsan6",20,"nan");
	Person person7 = new Person(1116,"zhangsan7",20,"nan");
	Person person8 = new Person(1117,"zhangsan8",20,"nan");
	Person person9 = new Person(1118,"zhangsan9",20,"nan");
	Person person10 = new Person(1119,"zhangsan10",20,"nan");
	
	PersonManger.insert(person1);
	PersonManger.insert(person2);
	PersonManger.insert(person3);
	PersonManger.insert(person4);
	PersonManger.insert(person5);
	PersonManger.insert(person6);
	PersonManger.insert(person7);
	PersonManger.insert(person8);
	PersonManger.insert(person9);
	PersonManger.insert(person10);
	
	PersonManger.findAll();
	PersonManger.selectById(1118);
	
	int testGitee;
}
}
