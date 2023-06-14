package functionalInterface;

public class UseFindNumMax {
public static void main(String[] args) {
	FindNumMax z= Methode::findmax;
	int[] arr= {55,10,23,235,48};
	System.out.println(z.findNum(arr));
}
}
