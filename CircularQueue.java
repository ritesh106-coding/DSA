public class CircularQueue {
    static class queue{
        int arr[];
        int size;
        int front=-1;
        int rear=-1;
        
        queue(int size){
            this.size=size;
            arr=new int[size];
        }
        
        void add(int data){
            if((rear+1)% size==front){
                 System.out.println("Queue is full");
                 return;
            }
            if(front==-1){
                front=0;
            }
            rear=(rear+1)%size;
            arr[rear]=data;
        }
        int remove(){
            if(front==-1){
                 System.out.println("Queue is empty");
                 return -1;
            }
            int result=arr[front];
            if(front==rear){
                front=-1;
                rear=-1;
            }else{
                front=(front+1)%size;
            }
            return result;
        }
        int peek(){
            if(front==-1){
                 System.out.println("Queue is Empty");
                 return-1;
            }
            return arr[front];
            
        }
    
    }
  public static void main(String[] args) {
    queue s1=new queue(4);
    s1.add(15);
    s1.add(20);
    s1.add(3);
    s1.add(4);
     s1.add(12);
    s1.add(19);
    System.out.println(s1.remove());
    System.out.println(s1.remove());
    System.out.println(s1.peek());
   
    System.out.println(s1.peek());
  }
}



