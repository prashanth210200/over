package superOverridinghomeWork;

public class ItEmployee extends Employee {
	 String ItName;
	 int ITnum;
	public  ItEmployee(String name,int num,String ItName,int ITnum) {
		super(name,num);
		this.ItName=ItName;
		this.ITnum=ITnum;
	}

		public String toString() {
			return super.toString()+ ItName+" "+ITnum;
			
		}
		
	}


