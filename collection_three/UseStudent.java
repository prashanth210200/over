package collection_three;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.Comparator;


public class UseStudent {

	public static void main(String[] args) {
		Student s1=new Student(101,"ragul","male",12,'A',"8th");
		Student s2=new Student(102,"kumar","male",13,'B',"8th");
		Student s3=new Student(103,"roshni","female",14,'C',"7th");
		Student s4=new Student(104,"vimal","male",12,'A',"8th");
		Student s5=new Student(105,"mithra","female",14,'B',"7th");
		Student s6=new Student(106,"priya","female",15,'C',"6th");
		Student s7=new Student(107,"murali","male",16,'A',"9th");
		Student s8=new Student(108,"kishore","male",15,'B',"7th");
		Student s9=new Student(109,"venkat","female",12,'C',"6th");
		Student s10=new Student(110,"madhu","female",16,'A',"8th");
		Student s11=new Student(111,"deva","male",12,'A',"8th");
		Student s12=new Student(112,"kiruba","male",12,'B',"8th");
		Student s13=new Student(113,"ragul","male",12,'A',"9th");
		Student s14=new Student(114,"kandhan","male",12,'C',"9th");
		Student s15=new Student(115,"vel","male",12,'A',"8th");
		ArrayList<Student>Students=new ArrayList<>();
		Students.add(s1);
		Students.add(s2);
		Students.add(s3);
		Students.add(s4);
		Students.add(s5);
		Students.add(s6);
		Students.add(s7);
		Students.add(s8);
		Students.add(s9);
		Students.add(s10);
		Students.add(s11);
		Students.add(s12);
		Students.add(s13);
		Students.add(s14);
		Students.add(s15);
		List<Student>stdsecA=Students.stream().filter(x->x.getSection()=='A').collect(Collectors.toList());
        long secAcount=stdsecA.stream().count();
        for(Student l:stdsecA) {
        	System.out.println(l);
        }
        	
        	System.out.println(secAcount);
        
        	List<Student>stdssecB=Students.stream().filter(x->x.getSection()=='A').collect(Collectors.toList());
            long secBcount=stdssecB.stream().count();
            for(Student m:stdssecB) {
            	System.out.println(m.getName());
            }
            	
            	System.out.println(secBcount);
          //.out.println()
            	
            //	List<student>studentage=Students.Stream().sorted()
            			//List<Student>sortname=Students.stream().sorted().collect(Collectors.toList());
              //  long secBcount=stdssecB.stream().sorted().collectors.toList();
List<String>sort=Students.stream().map(x->x.getName()).collect(Collectors.toList());
List<String> n1=sort.stream().sorted().collect(Collectors.toList());
 n1.forEach(x->System.out.println(x));
 
 //List<Integer>mini=Students.stream().map(y->y.getAge()).collect(Collectors.toList());
 //int miniage=mini.stream().min(Integer::compare).get();
 //System.out.println(miniage);
 
// int maxage=mini.stream().max(Integer::compare).get();
// System.out.println(maxage);
 
// Student max=Students.stream().max(Comparator.comparing(Student::getAge)).get();
// System.out.println(max);
// 
// Student min=Students.stream().min(Comparator.comparing(Student::getAge)).get();
 //System.out.println(mini);
 
// List<Student>agelimit=Students.stream().limit(8).collect(Collectors.toList());
// //System.out.println(agelimit.);
// for(Student x:agelimit) {
//	 System.out.println(x.getAge());
//	 List<Integer>mini=Students.stream().map(y->y.getAge()).collect(Collectors.toList());
// 
//	 Integer sum=mini.stream().mapToInt(Integer::intValue).sum();
//	 System.out.println(sum);
 }
}

