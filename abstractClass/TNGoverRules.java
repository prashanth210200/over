package abstractClass;

public class TNGoverRules extends CentalGRules {
public String fontcolor(String color) {
 return color;
}
public String vehicleType(String type) {
	if(type.equals("private")) {
		return"BlackandWhite";
		
	}
	else if(type.equals("public")) {
		return"yellowandWhite";
		
	}
	else if(type.equals("e-vehical")) {
		return"greenandWhite";
		
	}
	else {
		return "null";
	}
}
}
