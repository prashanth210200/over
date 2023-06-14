package optionalClass_Java8;

import java.util.Optional;

public class OptionalProgram {
	public static void main(String[] args) {
		String name="null";
	//	System.out.println(name.length());
 // Optional<String>z=Optional.ofNullable(name);
		Optional<String>z=Optional.of(name);
	  if(z.isPresent()) {
		  System.out.println(name.toUpperCase());
	  }
	  else {
		  System.out.println("this value not present");
	  }
	  System.out.println(z.orElse("value not present"));	  
	  System.out.println(z.isPresent());
	  System.out.println(z.isEmpty());
	 
	}
	

}
