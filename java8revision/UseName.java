package java8revision;

import java.util.ArrayList;
import java.util.List;

public class UseName {
	public static void main(String[] args) {
		//String[] n= {"raja","kumar","muthu","vinoth","mai","pradeepan"};
	
	
	ArrayList<String> name=new ArrayList();
	 name.add("raja");
	 name.add("mai");
	 name.add("vinoth");
	 name.add("kamal");
	 name.add("pradeepan");
	 name.add("bharani");
	 name.add("murali");
	 
	 Names n=(a)->{
		 for(int i=0;i<a.size();i++) {
			 if(a.get(i).length()>6) {
				 System.out.println(a.get(i));
			 }
		 }
	 };
	 n.findname(name);

	}
}
