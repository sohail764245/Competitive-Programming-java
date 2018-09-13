/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;

/**
 *
 * @Sohail Pathan
 */

class Node
{
    int data;
    Node next;
}

class Stack
{
 Node top = null;
    public void push(int data)
    {
        Node newnode =null;
        newnode.data=data;
        newnode.next=top;
    }
    
    
    public void pop()
    {
        if(top==null)
        {
            System.out.println("Stack is underflow");
        }
        else
        {
            Node temp;
            int x;
            temp = top;
            x=temp.data;
            top=top.next;
        }
    }
    
    public void peak()
    {
        if(top==null)
        {
            System.out.println("Stack is underflow");
        }
        else
        {
        System.out.println(" Element at Top: " + top.data);
        }
    }
    
    public void traverse()
    {
     if(top==null)
        {
            System.out.println("Stack is Empty");
        }
     else
     {
         Node temp=top;
         while(temp.next!=null)
         {
             System.out.println("| " + temp.data + " |");
             temp=temp.next;
         }
         
     }
    }
}


public class StackLinkedList {
 
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(15);
        stack.push(14);
        stack.push(13);
        stack.push(12);
        stack.push(11);
        stack.pop();
        stack.peak();
        stack.traverse();
        
    }
}
