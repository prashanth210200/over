package custom_Exception_threeExample;

public class PasswordException extends Exception {
	// String password="prasha4789";
	
public  PasswordException(String password) {
		super(password);
		
	}


      public void printStackTrace() {
    	  System.out.println("invalid");
      }
    
}
