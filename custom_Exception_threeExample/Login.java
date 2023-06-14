package custom_Exception_threeExample;

public class Login {
	
	
   public  void checkpassword(String password) throws PasswordException  {
	   System.out.println("Start");
	   try {
		
		if(password.length()< 8) {
			throw new PasswordException("password must contain above 8charater");
		}
		else {
			System.out.println("login successfull");
		}
	   }
		catch(PasswordException a) {
			a.printStackTrace();
			System.out.println(a);
		}
		
	System.out.println("end");
	}

}
