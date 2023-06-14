package objectarray; 
import java.util.*;

public class Usebike {
	public static void main(String[] args) {
		Bike b1=new Bike();
		b1.name="pulsar";
		b1.price=100000;
		b1.isselfstart=true;
		Bike b2=new Bike();
		b2.name="apache";
		b2.price=110100;
		b2.isselfstart=false;
		Bike b3=new Bike();
		b3.name="honda";
		b3.price=90000;
		b3.isselfstart=true;
		Bike b4=new Bike();
		b4.name="yamaha";
		b4.price=80000;
		b4.isselfstart=false;
		Bike[] bikes= {b1,b2,b3,b4};
		String max="";
		int maxvalue=b2.price;
		for(Bike a:bikes) {
			if(a.price>b2.price) {
				max=a.name;
			}
			System.out.println(max);
		}
		ArrayList<String> s = new ArrayList<String>();  
		List<String> ss = new ArrayList<String>();  
		
	//	Collections r = new ArrayList<String>();
		
		
	}
	

}
