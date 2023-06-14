package inhertitanceMethodeOverloading;

public class LoanEligible {
	public int findEligible() {
		return 30000;
	}
	public int findEligible(int salary) {
		return salary*5+(30000);
			
		}
	public int findEligible(int salary,int property) {
		return 30000+(salary*5)+(property*10);
		
	}

}
