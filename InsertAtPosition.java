public class InsertAtPosition {
static class node{
    int no;
    node next;
    
    node(int no){
        this.no=no;
        this.next=null;
    }
}
static node head;
static void InserPosition(int no,int postion){
    node newnode=new node(no);
    if(postion==1){
        newnode.next=head;
        head=newnode;
        return;
    }
     node temp=head;
    for(int i=1; i<postion-1; i++){
        if(temp==null){
            System.out.println("Invalid postion");
            return;
        }
        temp=temp.next;
    }
    if(temp==null){
        System.out.println("Invalid postion");
        return;
    }
    newnode.next=temp.next;
    temp.next=newnode;
}

public static void main(String[]args){
    node n1=new node(10);
        node n2=new node(20);
            node n3=new node(30);
               node n4=new node(40);
    
    n1.next=n2;
    n2.next=n3;
    n3.next=n4;
    
     head=n1;
    node temp=head;
    
    InserPosition(49,5);
    InserPosition(59,3);
    
    while(temp!=null){
        System.out.println(temp.no);
        temp=temp.next;
    }
}
}
