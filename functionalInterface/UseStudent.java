package functionalInterface;

import java.util.ArrayList;

public class UseStudent {
	public static void main(String[] args) {
		Student s1=new Student("prash",23);
		Student s2=new Student("wrf",28);
		Student s3=new Student("w1re",29);
		Student s9=new Student("qwrf",26);
		Student s4=new Student("wf",27);
		Student s5=new Student("prash",26);
		Student s6=new Student("sdv",25);
		Student s7=new Student("5yj",24);
		Student s8=new Student("rgh",23);
		ArrayList<Student>ages=new ArrayList<>();
		ages.add(s1);
		ages.add(s2);
		ages.add(s3);
		ages.add(s4);
		ages.add(s5);
		ages.add(s6);
		ages.add(s7);
		ages.add(s8);
		ages.add(s9);
		
		Stud s=a->{for(Student x:ages) {if(x.getAge()>=22) {System.out.println(x);
				}
			}
		};
		s.findAge(ages);
	}
}
 
	