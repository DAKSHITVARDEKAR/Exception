// Java program to demonstrate ArithmeticException 
import java.math.BigDecimal;  
class ArithmeticException_Demo 
{ 
	public static void main(String[]argvs) 
	{ 
		try { 
			int a = 0, b = 23; 
			int c = a/b; // cannot divide by zero 
			System.out.println ("Result = " + c); 
		} 
		catch(ArithmeticException e) { 
			System.out.println ("Can't divide a number by 0"); 
		} 
	} 
} 
