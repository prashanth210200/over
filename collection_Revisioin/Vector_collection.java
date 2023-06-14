package collection_Revisioin;

import java.util.Vector;

public class Vector_collection {
public static void main(String[] args) {
	Vector<String> v=new Vector();
	//Vector v=new Vector();
	v.add("yamaha");
	v.add("bajai");
	v.add("jawa");
	v.add(1,"Mahandera");
	v.add("raja");
	v.add("chozan");
	v.addElement("methode");
//	v.add(4,"raja");
//	v.add(2);
//	v.add(5);
//	v.set(7, 6);
	//v.set(3,9);	
	for(int i=0;i<v.size();i++) {
	
	System.out.print(v.get(i)+" ");
	}	
}
}


