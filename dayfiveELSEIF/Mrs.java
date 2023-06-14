package dayfiveELSEIF;

public class Mrs {
	public static void main(String[] args) {
		String a= "miss.nisa";
		if (a.startsWith("mi")) {
			System.out.print("unmarried women");
		}
		else if (a.startsWith("mr")) {
			System.out.println("men");
			
		}
		else if (a.startsWith("mrs")) {
			System.out.println("unmarried men");
		}
		else {
			System.out.println("no");
		}
	}
}
