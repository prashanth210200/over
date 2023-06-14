package typeOfFunctionInterface;


	import java.util.function.Consumer;
	import java.util.function.Function;
	import java.util.function.Predicate;
	import java.util.function.Supplier;
	public class ConsumerType {
	public static void main(String[] args) {
	        
	        // Predicate functional interface
	        Predicate<String> isTrueFalse = s -> s.isEmpty();
	        System.out.println(isTrueFalse.test("")); 
	        System.out.println(isTrueFalse.test("gokul"));
	        
	        // Consumer functional interface
	        Consumer<String> name = s -> System.out.println(s.toUpperCase());
	        name.accept("thiyagarajan");
	        
	        // Supplier functional interface
	        Supplier<Integer> num = () -> (int) (Math.random() * 100);
	        System.out.println(num.get());
	        
	        // Function functional interface
	        Function<String, Integer> length = s -> s.length();
	        System.out.println(length.apply("OneSoft technolgy")); 
	}
	}

