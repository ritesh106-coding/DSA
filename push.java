public class push {
static int[] stack=new int[5];
static int top=-1;
 static void  push(int value){
    if(top == stack.length-1){
        System.out.println("Stack overflow");
        return;
    }
    top++;
    stack[top]=value;
    System.out.println("Insert Successfuly "+value);    
 }
 public static void main(String[] args) {
    push(10);
    push(20);
    push(30);
    push(40);
    push(50);
    push(60);
 }
}