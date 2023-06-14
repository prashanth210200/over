package collection_three;

public class Employee {
	private String name;
	private int salary;
	private boolean isMale;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public boolean isMale() {
		return isMale;
	}
	public void setMale(boolean isMale) {
		this.isMale = isMale;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Employee(String name, int salary, boolean isMale, int age) {
		super();
		this.name = name;
		this.salary = salary;
		this.isMale = isMale;
		this.age = age;
	}
	@Override
	public String toString() {
		return "name=" + name + ", salary=" + salary + ", isMale=" + isMale + ", age=" + age + "";
	}
	
	

}
