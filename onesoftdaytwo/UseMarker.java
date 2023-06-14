package onesoftdaytwo;

public class UseMarker {
	 public static void main(String[]args) {
		 Marker marker1=new Marker();
		 marker1.brand ="camlin";
		 marker1.price=50;
		 marker1.color="blue";
		 
		 Marker marker2=new Marker();
		 marker2.brand="tom";
		 marker2.price=10;
		 marker2.color="red";
		 
		 Marker marker3=new Marker();
		 marker3.brand="jerry";
		 marker3.price=120;
		 marker3.color="black";
		 System.out.println("Brand="+marker1.brand+" price="+ marker1.price+" color="+ marker1.color);
	 }

}
