package hashMap_collection;
import java.util.HashMap;

public class Onesoft_lms {
	public static void main(String[] args) {
		HashMap<String,Integer>roll=new HashMap<>();
		roll.put("kishore", 1112);
		roll.put("kiruba", 1113);
		roll.put("vinoth", 1114);
		roll.put("Pradeepan", 1115);
		for(String x:roll.keySet()){
			System.out.println(x);
		}
		for(Integer v:roll.values()) {
		System.out.println(v);
	
		}
		System.out.println();
		roll.forEach((x,v)->System.out.println(x+"\n"+v));
		roll.keySet().forEach(x->System.out.println((x)));
		roll.values().forEach(v->System.out.println(v));
	}

}
