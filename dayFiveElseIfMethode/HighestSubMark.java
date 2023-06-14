package dayFiveElseIfMethode;

public class HighestSubMark {
	public static void main(String[] args) {
		int tam=77;
		int eng=85;
		int mat=90;
		int sci=96;
		int soc=97;
		
		if (tam>eng&&tam>mat&&tam>sci&&tam>soc) {
			System.out.println("higer");
		}
		else if (eng>tam&&eng>mat&&eng>sci&&eng>soc) {
			System.out.println("higer");
		}
		else if (mat>tam&&mat>eng&&mat>sci&&mat>soc) {
			System.out.println("higer");
		}
		else if (sci>tam&&sci>eng&&sci>mat&&sci>soc) {
			
			System.out.println("higer");
		}
		else if (soc>tam&&soc>eng&&soc>mat&&soc>sci) {
			System.out.println("social mark was high");
		}
			else {
				System.out.println("is high mark");
			}
		}
	}
	


