package hexaoperation;
//import java.util.*;

public class Hexcalc {
	String h1;
	String h2;
	//sum of 2 hexadecimal number
	String summ(String hexstr,String hexstr2) {
		int one=Integer.parseInt(hexstr,16);
		int two=Integer.parseInt(hexstr2,16);
		int sum=one+two;
		return(Integer.toHexString(sum));
	}
	//subtraction of 2 hexadecimal
	String subtractt(String hexstr,String hexstr2) {
		int one=Integer.parseInt(hexstr,16);
		int two=Integer.parseInt(hexstr2,16);
		int sub=one-two;
		
		return(Integer.toHexString(sub));
	}
	//multiplication of 2 hexadecimal number
	String multiplyy(String hexstr,String hexstr2) {
		int one=Integer.parseInt(hexstr,16);
		int two=Integer.parseInt(hexstr2,16);
		int mul=one*two;
		return(Integer.toHexString(mul));
	}
	//division of 2 hexadecimal number
	String divisionn(String hexstr,String hexstr2) {
		int one=Integer.parseInt(hexstr,16);
		int two=Integer.parseInt(hexstr2,16);
		int div=one/two;
		return(Integer.toHexString(div));
	}
	// to check whether 2 hexadecimal number are equal or not
	boolean equal(String hexstr,String hexstr2) {
		if(hexstr.equals(hexstr2)) {
			return true;
		}
		else
			return false;
	}
	//check whether 1hexadecimal number is greater than 2nd or not
	boolean greater(String hexstr,String hexstr2) {
		if(hexstr.length()>hexstr2.length()) {
			return true;
		}
		else if(hexstr.length()<hexstr2.length()) {
			return false;
			
		}
		else {
			int a=0;
			while(a<hexstr.length()) {
				int ascii1=hexstr.charAt(a);
				int ascii2=hexstr2.charAt(a);
				a++;
				if(ascii1<ascii2) {
					return false;
				}
				else {
					return true;
				}
			}
			return true;
		}
	}
	//compare the two hexadecimal number
	void compare(String hexstr,String hexstr2) {
		if(equal(hexstr,hexstr2)) {
			System.out.println("Both hexadecimal numbers are equal");
			return;
		}
		else if(greater(hexstr,hexstr2)==true) {
			System.out.println(hexstr+" is greater than "+hexstr2);
			return;
		}
		else if(greater(hexstr2,hexstr)==true){
			System.out.println(hexstr+" is smaller than "+hexstr2);
			return;
		}
	}
	//changing hexadecimal number to decimal number
	void decimalchange(String hexstr,String hexstr2) {
		int num1=Integer.parseInt(hexstr,16);
		int num2=Integer.parseInt(hexstr2,16);
		System.out.println("Hexadecimal converted to decimal is 1st number: "+num1 +" and 2nd number is "+num2);
	}
	//change decimal number to hexadecimal
	void hexadecimalchange(int num1,int num2) {
		System.out.println("Decimal converted to Hexadecimal is 1st number: "+Integer.toHexString(num1) +" and 2nd number is "+Integer.toHexString(num2));
	}
}
