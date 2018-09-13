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
public class SquareRootFactorN {

    public SquareRootFactorN(int n) {
        int i;
        for(i=1; i<=Math.sqrt(n);++i)
        {
            if(n%i==0)
            {
                if(i!=(n/i))
                    System.out.print(" "+ n/i);
                else
                    System.out.print(i);
            }
        }
    }

    public static void main(String[] args) {
        SquareRootFactorN squareRootFactorN = new SquareRootFactorN(50);
    }

    
}
