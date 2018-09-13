
class Node
{
    int data ;
    Node next;
    Node(int data)
    {
        this.data=data;
    }
}


class LinkedListStack
{
   public static Node top= null;
    
    public void push(int data)
    {
        Node newnode= new Node(data);
        newnode.next=top;
        top=newnode;
        System.out.print(data);
    }
    
    public Node pop()
    {
        Node n = top;
        top=top.next;
        return n;
    }
    
    public int showtop()
    {
        if(top==null);
        {
            return -1;
        } 
        return top.data;
    }
    
    public void pushAtmiddle(int data)
    {
        Node newnode = new Node(data);
        
    }
    
    
    public void popFromMiddle()
    {
        
    }
    
    
}