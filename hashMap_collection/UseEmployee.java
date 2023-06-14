package hashMap_collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.stream.Collectors;

public class UseEmployee {
	public static void main(String[] args) {
		Employee a = new Employee("pradeepan", 520, 23, 10000,"male");
		Employee b = new Employee("Kishore", 789, 23, 10000,"female");
		Employee c = new Employee("praveen", 456, 23, 10000,"male");
		Employee d = new Employee("kumar", 213, 23, 10000,"female");
		Employee e = new Employee("kumar", 654, 23, 10000,"male");
		Employee f = new Employee("mano", 987, 23, 45000,"male");
		Employee g = new Employee("kumar", 741, 29, 50000,"female");
		Employee h = new Employee("ragual", 258, 28, 40000,"male");
		Employee i = new Employee("vishnu", 369, 21, 30000,"female");
		Employee j = new Employee("vimal", 966, 24, 20000,"male");

		HashMap<Integer, Employee> employees = new HashMap<>();
		employees.put(a.getId(), a);
		employees.put(b.getId(), b);
		employees.put(c.getId(), c);
		employees.put(d.getId(), d);
		employees.put(e.getId(), e);
		employees.put(f.getId(), f);
		employees.put(g.getId(), g);
		employees.put(h.getId(), h);
		employees.put(i.getId(), i);
		employees.put(j.getId(), j);
		
		//typeCasting
	
		
		
		
		
		
		
		int  min= employees.get(1).getSalary();
		for (int k : employees.keySet()) {
			if(employees.get(k).getSalary()>min) {
			}
				System.out.println(employees.get(k).getName());
			}
	}
}
//			
//			if(employees.get(k).getAge()>25) {
//				System.out.println(employees.get(k).getSalary());
//			}
//			if(employees.get(k).getId()>112){
//				System.out.println(employees.get(k).getName());
//				
//			}
//			if(employees.get(k).getGender().equalsIgnoreCase("female")) {
//				System.out.println(employees.get(k).getName());
//			}
//			
//			
//			
//			
//		}
//			System.out.println(k);
//			System.out.println(employees.get(k));
//			
//
//		}
//		for (Employee v : employees.values()) {
//			System.out.println(v);
//		}
//		employees.forEach((k, v) -> System.out.println(k + "ln" + v));
//
//		employees.keySet().forEach(x -> System.out.println(x));
//
//		Iterator itr = employees.values().iterator();
//		while (itr.hasNext()) {
//			System.out.println(itr.next());
//			
//			
//			Iterator it = employees.keySet().iterator();
//			while (itr.hasNext()) {
//				System.out.println(itr.next());
//
//
//	}
//	}
//	
//
//	}
//}
