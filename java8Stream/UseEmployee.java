package java8Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class UseEmployee {
	public static void main(String[] args) {

		Employee e1 = new Employee("Prashanth",100, "Electrical Engineer", 59000, 'M', 789456123);
		Employee e2 = new Employee("sinthuja",101,"Software Engineer", 45000, 'F', 789456132);
		Employee e3 = new Employee("Roshni",102,"mechanical Engineer", 10000, 'F', 789456156);
		Employee e4 = new Employee("prema",103,"civil Engineer", 35000, 'F', 789456189);
		Employee e5 = new Employee("jayaSri",104,"ComputerScience Engineer", 36000, 'F', 789456187);
		Employee e6 = new Employee("Avanthika", 105,"Infomation Engineer", 37000, 'F', 789456174);

		/// map to Filter-----> is used to map the particular while Streaming
		List<Employee> emp = Arrays.asList(e1, e2, e3, e4, e5, e6);

		List<Integer> a = emp.stream().map(x -> x.getSalary()).filter(y -> (y > 30000)).collect(Collectors.toList());
		System.out.println(a);

		long number = a.stream().count();
		System.out.println(number);
		/// map to distinct -----> Its is used to remove the duplicate Element
		List<String> b = emp.stream().map(z -> z.getRole()).distinct().collect(Collectors.toList());
		System.out.println(b);
		// map to limit---------------->>it used to limit the size of a Stream as per
		// the argument
		List<Employee> c = emp.stream().limit(2).collect(Collectors.toList());
		c.forEach(x -> System.out.println(x));
		// AnyMatch---------true/false
		boolean d = emp.stream().anyMatch(x -> x.getRole().equals("Software Engineer"));
		System.out.println(d);

		// sorted
		List<String> e = emp.stream().map(z -> z.getName()).sorted().collect(Collectors.toList());
		System.out.println(e);
		// reverse(sort)
		List<String> f = emp.stream().map(z -> z.getName()).sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());
		System.out.println(f);
		// SummingInt
		int g = emp.stream().map(z -> z.getSalary()).collect(Collectors.summingInt(Integer::intValue));
		System.out.println(g);
		// maximum id
		int h = emp.stream().map(z -> z.getId()).max(Integer::compare).get();
		System.out.println(h);

		// findAny--->>>>
		int X = emp.stream().map(z -> z.getId()).findAny().get();
		System.out.println(X);

		// minimum id--->>>>
		int i = emp.stream().map(z -> z.getId()).min(Integer::compare).get();
		System.out.println(i);
		// findAny------>>>>
		int j = emp.stream().map(z -> z.getId()).findAny().get();
		System.out.println(j);
		// findSecond---->>>>
		int k = emp.stream().map(x -> x.getSalary()).sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println(k);
		// findFirst----
		int m = emp.stream().map(x -> x.getSalary()).sorted(Comparator.reverseOrder()).findFirst().get();
		System.out.println(m);
		// second highest salary get by
		Employee n = emp.stream().sorted(Comparator.comparing(Employee::getSalary)).skip(1).findFirst().get();
		System.out.println(n);

		//// flatMAp
		List<List<String>> o = Arrays.asList(b, e);
		List<String> result = o.stream().flatMap(x -> x.stream()).collect(Collectors.toList());
		System.out.println(result);
		result.forEach(x -> System.out.println(x));

		Map<Integer, Employee> list = emp.stream().collect(Collectors.toMap(x -> x.getId(), y -> y));
		list.forEach((x, y) -> System.out.println(x + " " + y));

		list.keySet().forEach((y) -> System.out.println(y));

		list.values().forEach((y) -> System.out.println(y));
		for (Integer x : list.keySet()) {
			System.out.println(list.get(x));
			System.out.println(x);

			for (Employee y : list.values()) {
				System.out.println(y);
			}

			Set<Employee> list1 = emp.stream().collect(Collectors.toSet());

			System.out.println(list1);

		}

	}

}
