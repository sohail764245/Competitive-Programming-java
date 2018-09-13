/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author SYSTEM
 */
public class ArrayTest {
 
 int[] array= new int[20];

 static Scanner input  = new Scanner(System.in);
        public void insert()
        {
            int data;
            System.out.println("Enter how many elements you want to insert");
            data=input.nextInt();
            if(data<20)
            {
                for(int i=0;i<data;i++)
                    array[i]=input.nextInt();
                System.out.println("Success");
            }
            else
            {
                System.out.println("Limit Exceed!");
            }    
        
        }
        public void insertAtposition(int data, int position)
        {
            System.out.println("Enter the Position and value:");
            position=input.nextInt();
            data=input.nextInt();
            for(int i = array.length; i>=(position-1); i--)
            {
                array[i+1]=array[i];
            }    
                
            array[position-1]=data;
            System.out.println("Insetion at position success");
        }
        
        public void delete(int position)
        {        
            System.out.println("Enter the position of element you want to delete");
            position=input.nextInt();
             for(int i=array.length; i>=position-1 ;i--)
                 array[i-1]=array[i];
            System.out.println("Deletion from position success");
        }       
        public void traverse()
        {
            System.out.println(" Traversion of array");
            for(int i = 0 ; i< array.length; i++)
                System.out.println(array[i] + " ");
        } 
        
        public void sort()
        {
            Arrays.sort(array);
            System.out.println("Sorting Success");
            traverse();
        }    

        public static void main(String args[])
        {
            int choise, data, position;
            ArrayTest at= new ArrayTest();
            System.out.println("1. Insert");
            System.out.println("2. Insert at Position");
            System.out.println("3. Delete");
            System.out.println("4. Traverse");
            System.out.println("5. Sort");
            System.out.println("Enter the Choise: ");
            choise = input.nextInt();
            while(true)
            {
                switch(choise)
                {
                    case 1: 
                        at.insert();
                        break;
                    case 2:
                        System.out.println("Enter the data and position");
                        data=input.nextInt();
                        position=input.nextInt();
                        at.insertAtposition(data, position);
                        break;
                    case 3:
                        System.out.println("Enter the position");
                        position=input.nextInt();
                        at.delete(position);
                    case 4:
                        at.traverse();
                        break;
                    case 5:
                        at.sort();
                    default :
                        System.exit(0);
                }
        }
            
        }
}