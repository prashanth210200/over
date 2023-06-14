package functionalInterface;

public class UseFindLongName {
	public static void main(String[] args) {
		FindLongName z=Name::findNameMax;
		String[] a= {"prashanth","raja","rani"};
		System.out.println(z.FindName(a));
	}

}
