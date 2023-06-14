package inhertitance;

public class UseStationaryProduct {
	public static void main(String[] args) {
		Pencil sp=new Pencil();
		sp.brand="Rolex";
		sp.price=25;
		sp.ledSize="small";
		sp.isWood=true;
		sp.color="yellow";
		sp.isExtraDark=false;
		
		System.out.println(sp.findNetprice(10)+" "+sp.color+" "+sp.brand);
	}

}
