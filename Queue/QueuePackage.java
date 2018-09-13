/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue;

import java.util.Iterator;
import java.util.PriorityQueue;

/**
 *
 * @Sohail Pathan 
 */
public class QueuePackage {

  PriorityQueue<Integer> pQueue = new PriorityQueue<>();
     
  public void enQueue(int data)
  {
      pQueue.add(data);
  }
  
  public void deQueue(int data)
  {
      pQueue.remove(data);
  }
  
  public boolean queueContain(int data)
  {
      return pQueue.contains(data);
  }
  
  public void queueTraverse()
  {
      Iterator<Integer> itr = pQueue.iterator();
      while(itr.hasNext())
      {
          System.out.println(itr.hasNext());
      }
  }
  
  public static void main(String args[])
  {
      QueuePackage queue = new QueuePackage();
      queue.enQueue(10);
      queue.enQueue(11);
      queue.enQueue(12);
      queue.enQueue(13);
      queue.enQueue(14);
      queue.enQueue(13);
      queue.queueContain(15);
      queue.queueTraverse();
  }
    
    
}
