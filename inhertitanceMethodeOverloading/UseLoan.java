package inhertitanceMethodeOverloading;

public class UseLoan {
	public static void main(String[] args) {
		LoanEligible l=new LoanEligible();
		System.out.println(l.findEligible());
		System.out.println(l.findEligible(200));
	System.out.println(l.findEligible(200,50000));
	}
}
