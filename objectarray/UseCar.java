package objectarray;

public class UseCar {
	public static void main(String[]args) {
		
		Carr c1=new Carr();
		c1.brand="polo";
		c1.price=45;
		c1.colour="white";
		Carr c2=new Carr();
		c2.brand="alex";
		c2.price=55;
		c2.colour="black";
		Carr c3=new Carr();
		c3.brand="otto";
		c3.price=65;
		c3.colour="yellow";
		
		Carr c4=new Carr();
		c4.brand="jean";
		c4.price=75;
		c4.colour="green";
		Carr c5=new Carr();
		c5.brand="normal";
		c5.price=85;
		c5.colour="red";
	
		
	Carr[] Carrs= {c1,c2,c3,c4,c5};
	for(int i=0;i<Carrs.length;i++) {
		System.out.println(Carrs[i].brand+" "+Carrs[i].price+" "+Carrs[i].colour);
		
	}
	 
	}

}
