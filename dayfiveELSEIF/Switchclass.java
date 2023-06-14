package dayfiveELSEIF;

public class Switchclass {
	public static void main(String[] args) {
		String day="wednesday";
		switch(day) {
		    case "monday":
			System.out.println("1st day of the weak");
			break;
		    case "tuesday":
				System.out.println("2nd day of the weak");
				break;
		    case "wednesday":
				System.out.println("3rd day of the weak");
				break;
		    
		    case "thusday":
				System.out.println("4th day of the weak");
				break;
		    case "friday":
				System.out.println("5th day of the weak");
				break;
		    case "saturday":
				System.out.println("6th day of the weak");
				break;
		    case "sunday":
				System.out.println("7th day of the weak");
				break;
			default:
				System.out.println("no day in this weak");
	}

}
}