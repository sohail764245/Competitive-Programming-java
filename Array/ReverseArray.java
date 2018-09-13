/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

/**
 *
 * @author SYSTEM
 */
public class ReverseArray {

ReverseArray(int arr[], int from, int to)
{
 int temp;
 while(from<=to)
 {
     temp=arr[from];
     arr[from]=arr[to];
     arr[to]=temp;
     from++;
     to--;
 }
    printarray(arr);
}
 void printarray(int arr[])
 {
     int i;
     for(i=0; i<arr.length; i++)
     {
      System.out.print(arr[i] + " ");   
     }
 }
 
 


    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        new ReverseArray(arr, 0, 9);
    }
   
}
