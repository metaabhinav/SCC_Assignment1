package hexaoperation;

import java.util.Scanner;

public class Drivercode {
	public static void main(String args[]) {
	Scanner sd=new Scanner(System.in);
	System.out.print("Enter the first Hexadecimal number::");//1st number
	String hexstr=sd.nextLine();
	System.out.print("Enter the second Hexadecimal number::");//2nd number
	String hexstr2=sd.nextLine();
	Hexcalc oper=new Hexcalc();
	String summ=oper.summ(hexstr,hexstr2);
	System.out.println("Sum of the two hexadecimal numbers are: "+summ);
	String subtractt=oper.subtractt(hexstr,hexstr2);
	System.out.println("Subtraction of 2nd number from 1st number is: "+subtractt);
	String multiplyy=oper.multiplyy(hexstr,hexstr2);
	System.out.println("Multiplication of 2 hex numbers are: "+multiplyy);
	String divisionn=oper.divisionn(hexstr,hexstr2);
	System.out.println("Division of 2 hex numbers are: "+divisionn);
	System.out.println("Comparing both hexadecimal integer");
	oper.compare(hexstr,hexstr2);
	oper.decimalchange(hexstr, hexstr2);
	System.out.println("Enter two numbers that you want to change to hexdecimal");
	int num1=sd.nextInt();
	int num2=sd.nextInt();
	oper.hexadecimalchange(num1,num2);
	sd.close();
	}
}
