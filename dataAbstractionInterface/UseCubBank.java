package dataAbstractionInterface;

public class UseCubBank {
	public static void main(String[] args) {
		CubBank c=new CubBank();
		System.out.println(c.accNum(9876554321234l));
		System.out.println(c.pinnum(9786));
		System.out.println(c.rateOfInterest(10000));
	}

}
