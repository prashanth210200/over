package inhertitanceMethodeOverriding;

public class UseAxisBank {
public static void main(String[] args) {
	AxisBank a=new AxisBank();
     a.noOfEmp=124;
     a.branch="IGP";
     
	System.out.println(a.findInterest(10000));
	
}
}
