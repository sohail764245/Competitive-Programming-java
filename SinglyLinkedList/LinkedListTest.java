/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SinglyLinkedList;

class Node {
    int data;
    Node next;
}


class LinkedList {
    Node head;
    public void insert(int data)
    {
        Node node= new Node();
        node.data=data;
        
        if(head==null)
        {
            head = node;
        }
        else
        {
            Node temp = head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=node;
            
        }
    }
    
    
    public void insertAtFirst(int data)
    {
     Node newnode = new Node();
     newnode.data=data;
     newnode.next=null;
     newnode.next=head;
     head=newnode;
    }
    
    public void insertAtPosition(int data, int pos)
    {
     Node newnode = new Node();
     newnode.data=data;
     newnode.next=null;
     if(pos==0)
     {
         insertAtFirst(data);
     }
     else
     {
     Node temp = head;
     for(int i=0;i<pos-1; i++ )
         temp=temp.next;
     newnode.next=temp.next;
     temp.next=newnode;
    
     }
    }
    
    public int search(int data)
    {
        if(head==null)
        {
            System.out.println("Linked List is Empty");
        }
        
        else 
        {
            Node temp=head;
            int count=0;
            while(temp.next!=null)
            {
                if(temp.data==data)
                {
                  return count;   
                }
                count++;
                temp=temp.next;
            }
        }
           
        assert(false);
        return 0;
    }
    public void deleteFirst()
    {
        head=head.next;
    }
    
    public void deleteAtPosition(int pos)
    {
        if(pos==0)
        {
          deleteFirst();
        }
        else
        {
         Node temp = head;
         Node temp2=null;
        for(int i=0;i<pos-1; i++ )
        {
            temp=temp.next;
        }
        temp2=temp.next; 
        temp.next=temp2.next;
         System.out.println("Element at position " + pos + " Deletion Success");
        }
    }
            
    public void showlist()
    {
        Node node=head;
        while(node.next!=null)
        {
            System.out.print(node.data + "---->");
            node=node.next;
        }
        System.out.print(node.data);
        System.out.println();
    }    
}

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insert(14);
        ll.insert(15);
        ll.insert(18);
        ll.insertAtFirst(13);
        ll.insertAtFirst(12);
        ll.insertAtPosition(16, 4);
        ll.showlist();
        ll.deleteAtPosition(3);
        ll.showlist();
        System.out.println("Element found at position " + ll.search(26));
        
    }
    
}
