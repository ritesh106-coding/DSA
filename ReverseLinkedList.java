public class ReverseLinkedList {
static class node{
    int data;
    node next;
     node(int data){
        this.data=data;
        this.next=null;
    }
}
 static node head;
 static void reverse(){
     node curr=head;
     node prev=null;
     while(curr!=null){
         node next=curr.next;
         curr.next=prev;
         prev=curr;
         curr=next;
     }
     head=prev;
 }
public static void main(String[]args){
    node n1=new node(10);
    node n2=new node(20);
    node n3=new node(30);
    n1.next=n2;
    n2.next=n3;
      head=n1;
     node temp=head;
     while(temp!=null){
         System.out.println(temp.data);
         temp=temp.next;
     }
     System.out.println("Show");
      reverse();

        // Print reversed linked list
        temp = head;

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        } 
}
}
