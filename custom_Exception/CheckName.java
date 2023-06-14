package custom_Exception;

import custom_Exception_threeExample.PasswordException;

public class CheckName {
public static void main(String[] args) {
	
}		
	
	public void NameException(String password) throws PasswordException {
			
			if(password.length() < 8) {
				throw new PasswordException("password musr contain 8 characters only");
			}else {
				System.out.println("login successfuly");
			}
	}
	}


