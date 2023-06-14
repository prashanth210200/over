package hashMap_collection;

import java.util.HashMap;
import java.util.Iterator;



public class Book {

public static void main(String[] args) {
	HashMap<String,Integer>phoneBook=new HashMap<>();
	phoneBook.put("dany", 123654);
	phoneBook.put("tony", 123654);
	phoneBook.put("tomy", 12365);
	phoneBook.put("jerrry", 123654);
//System.out.println(phoneBook.get("jerrry"));
//System.out.println(phoneBook.keySet());
//System.out.println(phoneBook.values());


//enhanced for loop;
//for(String k:phoneBook.keySet()) {
//	//System.out.println(k);
//	System.out.println(phoneBook.get(k));
//	
//}
//for(Integer x:phoneBook.values()) {
	//System.out.println(x);
//}
//for(long v:phoneBook.values()) {
//	System.out.println(v);
//}
phoneBook.forEach((k,v)->System.out.println(k+"\n"+v));

phoneBook.keySet().forEach(x->System.out.println(x));



//Iterator itr=phoneBook.keySet().iterator();
//while(itr.hasNext()) {
//	System.out.println(itr.next());
//}
}
}


