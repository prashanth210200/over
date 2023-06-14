package superOverridinghomeWork;

public class Software extends Engineer {
	  String  subject;
	 int noOfSubject;
	 public Software(String name,int num,String depart,int year,String subject,int noOfSubject) {
	 super(name,num,depart,year);
	 this.subject=subject;
	 this.noOfSubject=noOfSubject;
	 }
	 
	 public String toString() {
		 return super.toString()+" "+depart+" "+year+" "+subject+" "+noOfSubject;
	 
	 }
	 
	 

}
