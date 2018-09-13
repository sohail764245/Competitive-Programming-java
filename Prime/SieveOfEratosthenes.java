/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prime;

/**
 *
 * @author SYSTEM
 */
public class SieveOfEratosthenes {

    public SieveOfEratosthenes(int n) {
        boolean prime[] = new boolean[n+1]; 
        for(int i=0;i<n;i++) 
            prime[i] = true; 
          
        
        for(int p = 2; p*p <=n; p++) 
        { 
             
            if(prime[p] == true) 
            { 
                // Update all multiples of p 
                for(int i = p*2; i <= n; i += p) 
                    prime[i] = false; 
            } 
        } 
          
        // Print all prime numbers 
        for(int i = 2; i <= n; i++) 
        { 
            if(prime[i] == true) 
                System.out.print(i + " "); 
        }
        
    }
    public static void main(String args[])
    {
        new SieveOfEratosthenes(100);
    }
    
    
}
