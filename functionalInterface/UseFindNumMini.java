package functionalInterface;

public class UseFindNumMini {
	public static void main(String[] args) {
		FindNumMini z=Methode::findmini;
		int[]tt= {128,345,876,98};
		System.out.println(z.findNum(tt));
	}

}
