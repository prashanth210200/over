package inhertitance;

public class Teacher extends Employee {
	Boolean isprivateTeacher;
	int SalaryPerDay;
	public int findMonthlySalary(int SalaryPerDay) {
		return SalaryPerDay*30;
		
	}

}
