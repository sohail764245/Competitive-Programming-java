/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prime;

import java.util.Arrays;

/**
 *
 * @author SYSTEM
 */
public class CheckPrime {
 
    public static boolean isPrime(int data)
    {
        if(data<=1)
        {
            return false;
        }
        else
        {
            for(int i=2; i<data; i++)
            {
                if(data%i==0)
                    return false;
                
            }
        }
        return true;
    }
    
    
    //Check number wheather it is prime or not by using o(sqrt(n)) 
    public static boolean isPrimeNum(int n)
    {
        if(n<=1)
            return false;
        if(n<=3)
            return true;
        if(n%2==0||n%3==0)
            return false;
        
        for(int i=5; i*i<=n ;i=i+6)
        {
            if(n%i==0 || n%(i+2)==0)
                return false;
        }
        
        return true;
    }
    
    // print all prime numbers till n
   public static int primeTillN(int data)
   {
       
       int[] prime = new int[data];
       int loc=0;
       if(data<=1)
           return 0;
       
       for(int i=2; i<data; i++)
       {
           int flag=0;
           for(int j=2; j < i; j++)
           {
               if(i%j==0)
                   flag=1;
           }
           if(flag==0)
           {
               prime[loc]=i;
               loc++;
           }
           
       }
       
       for(int i=0 ; i<loc; i++)
       {
           System.out.print(prime[i] + " ");
       }
       return 0;
   }
   
   // print all prime factors of n using o(sqrt(n))
    public static void primeFactorsOfN(int n)
//    {
//        if(n<=1)
//        {
//            System.out.println("Sorry,No prime Factors have found");
//        }    
//        while(n%2==0)
//        {
//        System.out.print(2 +  " ");
//        n/=2;
//        }
//            
//        for(int i=3 ; i<=Math.sqrt(n);i+=2)
//        {
//            while(n%i == 0)
//            {
//                System.out.print(i + " ");
//                n=n%i;
//            }
//        }
//            
//        if(n>2)
//            System.out.print(n);    
//        
//    }
            
            	{ 
	      if(n<=1)
            System.out.println("Sorry,No prime Factors have found");
		// Print the number of 2s that divide n 
		while (n%2==0) 
		{ 
			System.out.print(2 + " "); 
			n /= 2; 
		} 

		// n must be odd at this point. So we can 
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
   
    public static void main(String args[])
    {
        System.out.println(isPrime(5));
        System.out.println(isPrimeNum(103));
        primeTillN(150);
        System.out.println();
        primeFactorsOfN(100);
    }
}
