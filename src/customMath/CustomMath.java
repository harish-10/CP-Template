package customMath;

public class CustomMath {
	
	public static int gcd(int a, int b) 
    { 
    if (a == 0) 
        return b;  
    return gcd(b % a, a);  
    } 
      
    // method to return LCM of two numbers 
    public static int lcm(int a, int b) 
    { 
        return (a*b)/gcd(a, b); 
    } 
    
    public static double power(int base, int exponent) {
    	return Math.pow(base, exponent);
    }

    public static void primeFactors(int n) 
    { 
        // Print the number of 2s that divide n 
        while (n%2==0) 
        { 
            System.out.print(2 + " "); 
            n /= 2; 
        } 
  
        // n must be odd at this point.  So we can 
        // skip one element (Note i = i +2) 
        for (int i = 3; i <= Math.sqrt(n); i+= 2) 
        { 
            // While i divides n, print i and divide n 
            while (n%i == 0) 
            { 
                System.out.print(i + " "); 
                n /= i; 
            } 
        } 
  
        // This condition is to handle the case whien 
        // n is a prime number greater than 2 
        if (n > 2) 
            System.out.print(n); 
    } 
    
    public static String toBinaryString(int decimal) {
    	return Integer.toBinaryString(decimal);
    }
}
