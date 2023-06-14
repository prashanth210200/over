package abstractClass;

public class Software extends Engineer {
public  int  walk(int walk) {
	return walk;
}
public  String workForLiving(String job) {
	return job;
	
}
public  String showSalary(int experience) {
	if(experience>=0&&experience<=2) {
	return "3,20,0000 per annum";
}
	else if(experience==3) {
	return "4,20,0000 per annum";
}
	else if(experience==4) {
	return "5,20,0000 per annum";
}
	else {
		return "Invalid";
	}
}
@Override
public String showsalary(int experience) {
	// TODO Auto-generated method stub
	return null;
}
}
