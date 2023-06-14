package collection_three;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UseEmployee {
	public static void main(String[] args) {
		Employee e1 = new Employee("kumar", 100000, true, 25);
		Employee e2 = new Employee("gokul", 250000, true, 29);
		Employee e3 = new Employee("vimal", 200000, false, 26);
		Employee e4 = new Employee("Arthi", 300000, false, 65);
		Employee e5 = new Employee("priya", 400000, false, 58);
		Employee e6 = new Employee("kamali", 500000, false, 23);
		Employee e7 = new Employee("logesh", 4500000, true, 26);
		Employee e8 = new Employee("vangi", 145000, true, 29);
		Employee e9 = new Employee("ramesh", 450000, true, 27);
		Employee e10 = new Employee("rahul", 250000, true, 29);
		ArrayList<Employee> emps = new ArrayList<>();
		emps.add(e1);
		emps.add(e2);
		emps.add(e3);
		emps.add(e4);
		emps.add(e5);
		emps.add(e6);
		emps.add(e7);
		emps.add(e8);
		emps.add(e9);
		emps.add(e10);
		List<Employee> femaleEmp = emps.stream().filter(x -> x.isMale() == (false)).collect(Collectors.toList());
		long femalecount = femaleEmp.stream().count();
		System.out.println(femalecount);
		List<Integer>Empv=emps.stream().filter(z->z.getName().startsWith("r")).map(z->z.getAge()).collect(Collectors.toList());
	   int EmpAge=(int) Empv.stream().count();
	   System.out.println(EmpAge);
	   
	
		
		
		
	}

}
