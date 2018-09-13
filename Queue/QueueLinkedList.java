/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue;

/**
 *
 * @author SYSTEM
 */

class Node
{
    int data;
    Node next;
    public Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}


class QueueTest
{
    Node front ,rear;
    public QueueTest()
    {
        this.front=null;
        this.rear=null;
    }
    
    void enQue(int data)
    {
        Node temp = new Node(data);
        if(this.rear==null)
        {
            this.front=this.rear=temp;
            return;
        }
        else
        {
            this.rear.next=temp;
            rear=temp;
        }
    }
    
    Node deQue()
    {
        if(this.front==null)
        {
            return null;
        }
        
        Node temp;
        temp=this.front;
        this.front=this.front.next;
        
        if(this.front==null)
            this.rear=null;
        return temp;
    }
}
public class QueueLinkedList {
    
    public static void main(String[] args) {
        
    QueueTest q= new QueueTest();
        q.enQue(10); 
        q.enQue(20); 
        q.deQue(); 
        q.deQue(); 
        q.enQue(30); 
        q.enQue(40); 
        q.enQue(50);
         System.out.println("Dequeued item is "+ q.deQue().data); 
//          
//
    }
}
