// INSERT AT BEGINNING
// public class InsertAtBeginning {
// static class node{
//     int data;
//     node next;
//     node(int data){
//         this.data=data;
//         this.next=null;
//     }
// }    
// public static void main(String[]args){
//     node n1=new node(10);
//     node n2=new node(20);
//     node n3=new node(30);
//     node n4=new node(40);
    
//     n1.next=n2;
//     n2.next=n3;
//     n3.next=n4;
    
//     node head=n1;
//    //----------------------------------------------------------------------- 
//     // INSERT IN BEGINNING
//     // If you write those 3 lines every time, it is not efficient from a programming/design perspective.
//     node newnode=new node(50);
//     newnode.next=head;
//     head=newnode;
    
//      node newnode1=new node(60);
//     newnode1.next=head;
//     head=newnode1;
//    //------------------------------------------------------------------------- 
//     node temp=head;
    
//     while(temp!=null){
//         System.out.println(temp.data);
//         temp=temp.next;
//     }
// }
// }



public class InsertAtBeginning {
    static class node{
        int data;
        node next;
        node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static node head;
    static void InsertBeginning(int data){
        node newnode=new node(data);
        newnode.next=head;
        head=newnode;
    }

    public static void main(String[]args){
        node n1=new node(10);
        node n2=new node(20);
        node n3=new node(30);
        
       
        
        n1.next=n2;
        n2.next=n3;
        
         head=n1;
         
          InsertBeginning(40);
          InsertBeginning(50);
          InsertBeginning(60);
          InsertBeginning(70);
        node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
        
    }
}

