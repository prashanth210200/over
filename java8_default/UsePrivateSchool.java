package java8_default;

public class UsePrivateSchool {
	public static void main(String[] args) {
		PrivateSchool s=new PrivateSchool();
		System.out.println(s.medium(null));
		System.out.println(School.noOfschool(19));
		System.out.println(s.noOfclass(20));
	}

}