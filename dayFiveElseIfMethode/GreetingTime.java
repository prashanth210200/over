package dayFiveElseIfMethode;

public class GreetingTime {
	public static void main(String[] args) {
		int time=10;
	   if (time>=6&&time<=11) {
		   System.out.println("good moring");
	   }
	   else if(time>=12&&time<=15) {
		   System.out.println("Good noon");
	   }
	   else if (time>=16&&time<=20) {
		   System.out.println("good evening");
	   }
		   else if (time>=21&&time>=24) {
			   System.out.println("Good Night");
		   
	   }
		   else {
			 System.out.println("Invalidator");
		   }
	}

}
