package objectarray;

public class UseFruits {
	public static void main(String[] args) {
		Fruits f1=new Fruits();
		f1.name="apple";
		f1.colour="red";
		f1.ishybrid=false;
		Fruits f2=new Fruits();
		f2.name="banana";
		f2.colour="yellow";
		f2.ishybrid=true;	
		Fruits f3=new Fruits();
		f3.name="orange";
		f3.colour="orange";
		f3.ishybrid=true;	
		Fruits f4=new Fruits();
		f4.name="berry";
		f4.colour="red";
		f4.ishybrid=false;
		Fruits[] fruits= {f1,f2,f3,f4};
//		for(int i=0;i<fruits.length;i++) {
//			if(fruits[i].ishybrid==true) {
//				System.out.println(fruits[i].name);
//			}
		for(Fruits x:fruits) {
			if(x.ishybrid==true) {
				System.out.println(x.name);
				
			}
			
		}
	}

}
