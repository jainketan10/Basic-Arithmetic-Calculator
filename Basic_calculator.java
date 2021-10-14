package ppt_practice;
import java.util.*;
public class Basic_calculator {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float d=0;
		System.out.println("Enter 2 numbers");
		Scanner input=new Scanner(System.in);
		float a=input.nextFloat();
		float b=input.nextFloat();
		System.out.println("Enter Basic Arithmetic operation to be performed");
		String c=input.next();
		switch (c) {
		case "+":
			d=a+b;
			System.out.println("Value is "+d);	
			break;
		case "-":
			d=a-b;
			System.out.println("Value is "+d);	
			break;
		case "*":
			d=a*b;
			System.out.println("Value is "+d);	
			break;
		case "/":
			d=a/b;
			System.out.println("Value is "+d);	
			break;
		default: 
			System.out.println("Enter correct arithmetic operation");
			break;	
		}		
	}
}
