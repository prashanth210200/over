package java8revision;

import java.util.Optional;

public class Sample {
	public static void main(String[] args) {
		//change the in put to check the output
	String word=null;
//	Optional<String>result=Optional.of(word);
//	System.out.println(result);
	Optional<String> check=Optional.ofNullable(word);
	if(check.isPresent()) {
		System.out.println(word.toUpperCase());
	}
	else {
		System.out.println("onnum ela next output check pannu");
	}
	System.out.println(check.orElse("nothing"));
}}
