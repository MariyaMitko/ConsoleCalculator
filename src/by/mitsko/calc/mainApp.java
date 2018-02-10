package by.mitsko.calc;

import java.util.Scanner;
public class mainApp {
	public static void main(String[] args) {
		int x;
		int y; 
		char z;
		int result;
			Calculator calc = new Calculator();
	       
		
			calc.greetUser();
		    x = calc.newValues();
		    y = calc.newValues();
		    z = calc.newOpwerator();
		    result = calc.result(x, y, z);
		    System.out.println(result);
}
}
