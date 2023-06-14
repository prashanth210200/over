package custom_Exception;

public class CheckAge {
	public static void main(String[] args)throws AgeException {
		System.out.println("Start");
		int age=10;
		try {
		if(age>18) {
			throw new AgeException("notEligble");
		}
		else {
			System.out.println("eligible");
		}
		}
		catch(AgeException e) {
			e.printStackTrace();
			System.out.println(e);
			
			
		}
		System.out.println("end");
		}
		
	}


