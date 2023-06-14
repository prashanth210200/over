package oopsConstructor;

public class UseBag {
public static void main(String[] args) {
	Bag b1=new Bag("twits",1236,4);
	Bag b2=new Bag("american",123655,2);
	Bag b3=new Bag("truth",45698,2);
	Bag b4=new Bag("best",4569,3);
	Bag[] bags= {b1,b2,b3,b4};
	int max=b1.price;
	Bag temp=null;
	for(Bag x:bags) {
		if(x.price>=max) {
			max=x.price;
			temp=x;
		}
	}
	System.out.println(temp.brand);
}
}
