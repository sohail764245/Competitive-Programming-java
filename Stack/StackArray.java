package Stack;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 *
 * @Sohail Pathan
 */

public class StackArray {
    Scanner sc =new Scanner(System.in);
    int n=sc.nextInt();
    int stack[]= new int[n];
    int top=-1;

public int push(int data)
{
    if(top>=n)
    {
        System.out.print("Stack Overflow");
    }
    else
    {
    stack[++top]=data;
    return stack[top];
    }
   return 0;
}

public int pop()
{
    if(top==-1)
    {
        System.out.println("Stack Empty");
    }
    
    int x= stack[top--];  
        return x;
}

public int peek()
{
    if(top==-1)
    {
        System.out.println("Stack Empty");
    } 
    return stack[top];
}

public void show()
{
    int i;
    System.out.println();
    for(i=top; i>=0 ;i--)
    {
        System.out.println("| "+ stack[i] + " |");
    }
    
}


    public static void main(String[] args) {
        StackArray stack= new StackArray();
        System.out.println();
        System.out.println("Pushed: " + stack.push(15));
        System.out.println("Pushed: " + stack.push(25));
        System.out.println("Pushed: " + stack.push(11));
        System.out.println("Pushed: " + stack.push(13));
        System.out.println();
        System.out.println("Popped from stack :-> " + stack.pop());
        System.out.println("Popped from stack :-> " + stack.pop());
        System.out.println();
        System.out.print("TOP-->" + stack.peek());
        System.out.println();
        stack.show();
    }
}