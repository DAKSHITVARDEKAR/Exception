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

 
      
    public class ArithmeticException1  
    {  
    // main method  
    public static void main(String[] argvs)  
    {  
    // creating two objects of BigDecimal  
    BigDecimal a1 = new BigDecimal(11);  
    BigDecimal a2 = new BigDecimal(17);  
      
    // 11 / 17 = 0.6470588235294118...  
    a1 = a1.divide(a2);  
    System.out.println(a1.toString());  
    }  
    }  