package superOverridinghomeWork;

public class BankEmployee extends Employee {
	private String BankName;
	private int Ifscnum;
	public  BankEmployee(String name,int num,String BankName,int Ifscnum) {
		super(name,num);
		this.BankName=BankName;
		this.Ifscnum=Ifscnum;
	}
		public String toString() {
			return super.toString();
			
		}
		
}