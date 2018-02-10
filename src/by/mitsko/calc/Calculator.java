package by.mitsko.calc;

import java.util.Scanner;

public class Calculator {
  public void greetUser(){
		System.out.println("Hello, User");
	}
  public int newValues(){
	Scanner sc = new Scanner(System.in);
	System.out.println("Add value");
	int a = sc.nextInt();
	return a;
  }
  public char newOpwerator(){
	Scanner sc = new Scanner(System.in);
	System.out.println("Add operator");
	char z = sc.next().charAt(0);
	return z;
  }
  public  int  multiply (int x,int y){
		int result = x*y;
		return result;
	}
	public int sum(int x, int y){
		int result = x+y;
		return result;
	}
	public int differ (int x, int y){
		int result = x-y;
		return result;
	}
  public int div (int x, int y){
  	int result = x/y;
  	return result;
  }

  public  int result(int x, int y, char z){
   int result = 0;
   switch (z){
   case '+':
	result = sum(x,y);
	break;
   case '-':
	result = differ(x,y);
	break;
   case '*':
	result = multiply(x,y);
	break;
   case '/':
	result = div(x,y);
	break;
}
     return result;
  }
}

  



  