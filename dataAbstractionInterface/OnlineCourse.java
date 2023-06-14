package dataAbstractionInterface;

public class OnlineCourse implements Course  {
	public int courseId(int id) {
		return id;
	}
	public String courseURL(String urlLink) {
	return urlLink;
	}
public boolean courseIs30days(boolean is30days) {
	return is30days;
	
}
public String courseTrainerName(String name) {
	return name;
}
public String courseNamewithFees(String courseName) {
	if(courseName.equals("java")) {
		return "course name is java, fees is 200000";
	}
	else if(courseName.equals("Python")) {
		return "courseName ispythin, fees iis 13000";
		
	}
	else if(courseName.equals("sql")) {
		return "CourseName is sql, fees is 12344";
		
	}
	else {
		return"no cours is available";
	
	}
}
}
