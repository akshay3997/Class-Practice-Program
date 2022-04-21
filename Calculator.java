package com.simplilearn.sample;
import java.util.Scanner; 
public class Calculator {
public static void main(String args[]) {
	

	Scanner sc=new Scanner(System.in);
float Result;
System.out.println("Enter First Number");
int num1=sc.nextInt();
System.out.println("Enter Second Number");
int num2=sc.nextInt();
System.out.println("Enter Symbol");
String  Symbol=sc.next();
switch (Symbol){
	case  "+" : Result=num1 +num2;
	System.out.println("Addition is"+ Result);
	break;
	case "-" : Result=num1-num2;
	System.out.println("Subtraction is "+Result);
	break;
	case "*" : Result=num1*num2;
	System.out.println("Multiplication is"+Result);
	break;
	case "/" : Result=num1/num2;
	System.out.println("Division is"+Result);
	break;
	default :System.out.println("Symbol Not Found");
}
	
}


}
 
