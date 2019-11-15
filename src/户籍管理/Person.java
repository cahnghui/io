package »§¼®¹ÜÀí;

public class Person {

	private int ID;
	private String name;
	private int age;
	private String gender;
	public void setID(int iD) {
		ID = iD;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getID() {
		return ID;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getGender() {
		return gender;
	}
	@Override
	public String toString() {
		return "Person [ID=" + ID + ", name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	public Person(int iD, String name, int age, String gender) {
		super();
		ID = iD;
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	public Person()
	{
		
	}
	
}
