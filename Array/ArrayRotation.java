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
public class ArrayRotation {
   
    void leftrotatebyone(int arr[], int size)
    {
        int temp;
        temp=arr[0];
        for(int i=0; i<size-1; i++)
            arr[i]=arr[i+1];
        arr[size-1]=temp;
    }
    
    void rotaterightbyone(int arr[], int size)
    {
        int last,i;
        last=arr[size-1];
        for(i=size-1; i>0; i--)
            arr[i]=arr[i-1];
        arr[0]=last;
        
    }
    
    void leftrotate(int arr[], int no_of_rotations , int size)
     {
         for(int i=0; i<no_of_rotations; i++)
         leftrotatebyone(arr,size);
     }
    
    void rightrotate(int arr[], int no_of_raotations, int size)
    {
        int i;
        for(i=0; i<size-1; i++)
        {
            rotaterightbyone(arr,size);
        }
    }
    void arraytraverse(int arr[])
    {
        int i;
        for(i=0; i<arr.length; i++)
            System.out.print(arr[i] + " ");
    }
    
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        System.out.println(arr.length);
        ArrayRotation ar= new ArrayRotation();
        ar.leftrotate(arr, 1, 5);
       // ar.arraytraverse(arr);
      //  ar.rightrotate(arr, 1, 7);
        //System.out.println();
        ar.arraytraverse(arr);
    }
}
