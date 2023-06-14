package dayfiveELSEIF;

public class PostmanSwitchCase {
	public static void main(String[] args) {
		String post = "manager";
		switch (post) {
		case "manager":
			System.out.println("locker room");
			break;
			
		case "pune":
			System.out.println("manager room allowed");
			
		case "cashier":
			System.out.println("cashier table");
			
		case "staff":
			System.out.println("desk");
		
		case "citizen":
			System.out.println("cabin");
			default:
				System.out.println("not allowed");
		}
		
	}

}
