package java8revision;

import java.util.List;

@FunctionalInterface
public interface Names {
	public void findname(List<String> a);
	
	public default String display() {
		return"Class Student name:";
	}
	
	

}
