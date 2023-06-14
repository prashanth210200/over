package superOverridinghomeWork;

public class CoreEmployee extends Employee {
	 String coreName;
	 int corenum;
	public  CoreEmployee(String name,int num,String coreName,int corenum) {
		super(name,num);
		this.coreName=coreName;
		this.corenum=corenum;
	}

		public String toString() {
			return super.toString()+""+ coreName+" "+corenum;
			
		}
		
}
