public class stackoperation {
    static final int no=5;
    static int top=-1;
    static int arr[]=new int[no];
    static void push(int a){
        if(top==no - 1){
            System.out.println("Stack OverFlow");
        }else{
            arr[++top]= a;
            System.out.println("Push :-"+a);
        }
    }
    static void pop(){
        System.out.println("Removwing Element");
        if(top == -1){
            System.out.println("StackUnderflow");
        }else{
            System.out.println("Popped "+arr[top--]);
        }
    }
    static void peek(){
        if(top == -1){
            System.out.println("Stack is Empty");
        }else{
            System.out.println("Top Element "+arr[top]);
        }
    }
    public static void main(String[]args){
        push(10);
        push(20);
        push(30);
        push(40);
        push(50);
        pop();
        peek();
    }
}
