package objectarray;

public class UseSaree {
	public static void main(String[] args) {
		Saree s1=new Saree();
		s1.price=5500;
		s1.material="niylon";
		s1.isheavey=true;
		s1.colour="black";
        s1.discount=20;
		Saree s2=new Saree();
		s2.price=4500;
		s2.material="normal";
		s2.isheavey=false;
		s2.colour="white";
		s2.discount=15;
		Saree s3=new Saree();
		s3.price=6000;
		s3.material="good";
		s3.isheavey=true;
		s3.colour="yellow";
		s3.discount=11;
		Saree s4=new Saree();
		s4.price=1236;
		s4.material="bad";
		s4.isheavey=false;
		s4.colour="green";
		s4.discount=12;
		Saree s5=new Saree();
		s5.price=4561;
		s5.material="verygood";
		s5.isheavey=true;
		s5.colour="blue";
		s5.discount=10;
		Saree[]Sarees= {s1,s2,s3,s4,s5};
		int netprice=0;
		for(int i=0;i<Sarees.length;i++) {
			if(Sarees[i].price<5000) {
			netprice=Sarees[i].price-Sarees[i].discount;
			System.out.println(Sarees[i].colour+netprice);
			}
		}

	}

}
