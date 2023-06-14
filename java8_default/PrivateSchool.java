package java8_default;

public class PrivateSchool implements School {
	public String medium(String English) {
		return "english";
	}

	
		public  String noOfclass(int value) {
			if(value!=20) {
				return "more than 20 Class";
				
			}
			else {
				return "is not 20 class";
				
			}
	}

}
