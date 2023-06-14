package superOverridinghomeWork;

public class Engineer extends Human {
	String depart;
	int year;
	public Engineer(String name,int num,String depart,int year) {
		super(name,num);
		this.depart=depart;
		this.year=year;
	}
		public String toString() {
			return super .toString()+" "+depart+" "+year;
			
		}
}


