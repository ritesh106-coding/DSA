public class InsertAtEnd {
static class node{
    int no;
    node next;
    
    node(int no){
        this.no=no;
        this.next=null;
    }
}
static node head;
static node Insertend(int no){
    node newnode=new node(no);
    
    if(head==null){
        head=newnode;
        return newnode;
    }
    node temp=head;
    while(temp.next!=null){
        temp=temp.next;
    }
    temp.next=newnode;
    return head;
}
public static void main(String[]args){
    node n1=new node(10);
        node n2=new node(20);
            node n3=new node(30);
    
    n1.next=n2;
    n2.next=n3;
    
     head=n1;
    node temp=head;
    
    Insertend(40);
    Insertend(50);
    
    while(temp!=null){
        System.out.println(temp.no);
        temp=temp.next;
    }
}
}
