/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;

import java.util.Scanner;

/**
 *
 * @author SYSTEM
 */
public class Fibonnaci {

    public static int FibonnaciTest(int n) {
        if(n<=1 ) {
       return 1;
        }
        else
        {
            return FibonnaciTest(n-1) + FibonnaciTest(n-2);
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n= input.nextInt();
        System.out.println(FibonnaciTest(n));
        }
}
