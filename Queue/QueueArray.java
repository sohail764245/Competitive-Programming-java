/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue;

/**
 *
 * @Sohail Pathan
 */



class Queue
{
    int[] queue = new int[10];
    int front,rear,size;
    
    public int enQueue(int data)
    {
       if(!isFull())
       {
        queue[rear] = data;
        rear = (rear+1)%5;
        size=size+1;
       } 
       else{
        System.out.println("Queue is full");
       }
       return data;
   }
    
    public int deQueue()
    {
        int data = 0;
        if(!isEmpty())
       {
        data = queue[front];
        front=(front+1)%5;
        size=size-1;   
       } 
       else
       {
         System.out.println("Queue is empty");
       } 
        return data;
    }
    
    public void showQueue()
    {
        for(int i=0; i<size; i++)
        {
            System.out.print(queue[front+i] + " ");
        }
    }
    
    public int queueSize()
    {
        return size;
    }
    
    public boolean isFull()
    {
        return queueSize()==5;
    }
    
    public boolean isEmpty()
    {
        return queueSize()==0;
    }
}

public class QueueArray {
 
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enQueue(4);
        queue.enQueue(5);
        queue.enQueue(8);
        queue.enQueue(2);
        queue.enQueue(7);
        queue.enQueue(6);
        queue.deQueue();
        queue.showQueue();
        System.out.println("Size : " + queue.queueSize());
    }
    
}
