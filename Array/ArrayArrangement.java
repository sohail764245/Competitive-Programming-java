package Array;

import java.util.Arrays;
public class ArrayArrangement {

public static int[] fix(int[] a)
{
    int i;
    for( i=0; i<a.length-1; i++)
    {
        if(a[i]!=-1 && a[i]!=i)
        {
            int x= a[i];
            while(a[x]!=-1 && a[x]!=x)
            {
                int y= a[x];
                a[x]=x;
                x=y;
            }
            
           a[x]=x;
            
           if(a[i]!=i)
            {
                a[i]=-1;
            }
        }
    }
    return a;
}
    
//     public static int[] fix(int[] A)
//    {
//        for (int i = 0; i < A.length; i++) 
//        {
//            if (A[i] != -1 && A[i] != i)
//            {
//                int x = A[i];
// 
//                while (A[x] != -1 && A[x] != x) 
//                {
//                    int y = A[x];
// 
//                    // place the x to its correct
//                    // position
//                    A[x] = x;
// 
//                    // now y will become x, now
//                    // search the place for x
//                    x = y;
//                }
// 
//                // place the x to its correct
//                // position
//                A[x] = x;
// 
//                // check if while loop hasn't 
//                // set the correct value at A[i]
//                if (A[i] != i)
//                {
// 
//                    // if not then put -1 at
//                    // the vacated place
//                    A[i] = -1;
//                }
//            }
//        }
//        return A;
//    }


    public static void main(String[] args)
    {
        int a[] = {5,4,3,2,1,0};
        System.out.println(Arrays.toString(fix(a)));
    }
    
    
//     public static void main(String[] args)
//    {
//        int A[] = {-1, -1, 6, 1, 
//                    9, 3, 2, -1, 4,-1};
//        System.out.println(Arrays.toString(fix(A)));
//    }
}

