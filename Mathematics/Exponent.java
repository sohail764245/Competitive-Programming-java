
package Mathematics;

public class Exponent {

public static int cal(int base , int exponent, int p)
{
    int x=0;
    
    if(exponent == 0)
    {
        return 1;
    }
    
    else if(exponent % 2==0)
    {
       x= pow(cal(base, exponent/2 )% p),2)%p);
       return x*x;
    }
    
         return base*exponent(base , exponent-1); 
    
    
    
    
}
    

public static void main(String args[])
{
   System.out.print(exponent(3, 50));
}
}
