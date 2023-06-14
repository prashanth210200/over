package functionalInterface;

import functionalInterface.Calculator;

public class UseCalculator {
	public static void main(String[] args) {
		Calculator add=(num1,num2)-> num1+num2;
		System.out.println(add.math(10,2));
		Calculator sub=(a,b)->a-b;
		System.out.println(sub.math(10, 2));
		
		Calculator div=(a,b)->a/b;
		System.out.println(div.math(10, 2));
		
		Calculator mult=(a,b)->a*b;
		System.out.println(mult.math(10, 2));
	System.out.println(Calculator.total(56));
	}

}
