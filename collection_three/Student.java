package collection_three;

public class Student {
	private int id;
	private String name;
	private String gender;
	private int age;
	private char section;
	private String std;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getSection() {
		return section;
	}
	public void setSection(char section) {
		this.section = section;
	}
	public String getStd() {
		return std;
	}
	public void setStd(String std) {
		this.std = std;
	}
	public Student(int id, String name, String gender, int age, char section, String std) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.section = section;
		this.std = std;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age + ", section=" + section
				+ ", std=" + std + "]";
	}
	
	

}
