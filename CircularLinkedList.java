public class CircularLinkedList {
  static class node{
      int data;
      node next;
      node(int data){
          this.data=data;
          this.next=null;
      }
  }   
  static node head=null;
  static node tail=null;
  public static void main(String[]args){
   CircularLinkedList list=new CircularLinkedList();
   node s1=new node(10);
   node s2=new node(20);
   node s3=new node(30);
   
   list.head=s1;
   s1.next=s2;
   s2.next=s3;
   list.tail=s3;
   list.tail.next=list.head;
   node temp=head;
   do{
       System.out.println(temp.data);
       temp=temp.next;
   }
   while(temp!=list.head);
  }
}


