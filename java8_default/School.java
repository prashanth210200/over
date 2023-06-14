package java8_default;

public interface School {
	public String medium(String English);
	public static int noOfschool(int num) {
		return num;
	}
	
		public default String noOfclass(int value) {
			if(value==20) {
				return "total 20 Class";
				
			}
			else {
				return "is not 20 class";
				
			}
	}

}
