package ppt_practice;
import java.util.*;

public class type_casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String str;
		System.out.println("Enter Integer");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		char b=(char)a;//Explicit casting
		System.out.println("Character is "+b);
		short c=(short)a;//Explicit 
		System.out.println("Short integer is "+c);
		double d= a; //Implicit casting
		System.out.println("Double is "+d);
		float f=a; //Implicit
		System.out.println("Float is "+f);
		byte e=(byte) a; //Explicit
		System.out.println("Byte is "+e);
	}

}
