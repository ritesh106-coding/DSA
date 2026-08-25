public class DoubleLinkList {
static class node {
    int data;
    node prev;
    node next;
    
    node(int data){
        this.data=data;
        this.prev=null;
        this.next=null;
    }
}    
public static void main(String[]args){
    DoubleLinkList n1=new DoubleLinkList();
    node s1=new node(10);
        node s2=new node(20);
                node s3=new node(30);
                s1.next=s2;
                s2.prev=s1;
                
                s2.next=s3;
                s3.prev=s2;
            node current=s3;
            while(current!=null){
                System.out.println(current.data);
                current=current.prev;
            }
            
          System.out.println("null");      
}
}


