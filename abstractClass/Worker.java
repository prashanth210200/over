package abstractClass;

public abstract class Worker {
	public String name(String name) {
		return name;
	}
	public int id(int id) {
		return id;
	}
	public int salaryperHour(int salaryperHour) {
		return salaryperHour;
	}
	public int monthlySalary(int salaryperHour,int workingHour) {
		return salaryperHour*workingHour*30;
	}
	public abstract  String jobName(String name);

}
