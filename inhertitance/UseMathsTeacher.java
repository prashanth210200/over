package inhertitance;

public class UseMathsTeacher {
	public static void main(String[] args) {
		MathTeacher mt= new MathTeacher();
		mt.name="kavi";
		mt.id=116;
		mt.isFemale=true;
		mt.SalaryPerDay=700;
		mt.qualification="b.sc";
		mt.workinghours=8;
		System.out.println(mt.findMonthlySalary(700)+" "+mt.isFemale+" "+mt.name);
	}

}
