package objectarray;

public class UseAc {
public static void main(String[] args) {
	Ac a1=new Ac();
	a1.brand="LG";
	a1.price=20000;
	a1.warrantyyear=6;
	
	Ac a2=new Ac();
	a2.brand="croma";
	a2.price=25000;
	a2.warrantyyear=5;
	
	Ac a3=new Ac();
	a3.brand="tata";
	a3.price=26000;
	a3.warrantyyear=5;
	
	Ac a4=new Ac();
	a4.brand="life";
	a4.price=30000;
	a4.warrantyyear=4;
	
	
	Ac[] acs= {a1,a2,a3,a4};
	int mini=acs[0].price;
	Ac temp =null;
	for(Ac x:acs) {
		if(x.price<=mini) {
	
		temp=x;
		}
		
	}
System.out.println(temp.brand+temp.price);
	
}

	}


