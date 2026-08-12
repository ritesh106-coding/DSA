public class LinkListCreatingNodeTraversal {
static class node{
    int number;
    node next;
    node(int number){
        this.number=number;
        this.next=null;
    }
}    
public static void main(String[]args){
    node n1=new node(10);
    node n2=new node(20);
    node n3=new node(30);
    node n4=new node(40);
    
    n1.next=n2;
    n2.next=n3;
    n3.next=n4;
    
    node head=n1;
    
    node temp=head;
    while(temp!=null){
        System.out.println(temp.number);
        temp=temp.next;
    }
}
}
