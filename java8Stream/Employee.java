package java8Stream;

public class Employee {
	private String name;
	private int id;
	private String role;
	private int salary;
	private char gender;
	private int accnum;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getAccnum() {
		return accnum;
	}
	public void setAccnum(int accnum) {
		this.accnum = accnum;
	}
	public Employee(String name, int id, String role, int salary, char gender, int accnum) {
		super();
		this.name = name;
		this.id = id;
		this.role = role;
		this.salary = salary;
		this.gender = gender;
		this.accnum = accnum;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", role=" + role + ", salary=" + salary + ", gender=" + gender
				+ ", accnum=" + accnum + "]";
	}
	

}
