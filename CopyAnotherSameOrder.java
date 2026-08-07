import java.util.*;
public class CopyAnotherSameOrder {
    public static void main(String[]args){
      Stack<Integer> s1 = new Stack<>();
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the no of elements");
      int n=sc.nextInt();
      System.out.println("Enter the elements");
      for(int i=0; i<n; i++){
        int x=sc.nextInt();
        s1.push(x);
      }
      System.out.println(s1);
      Stack <Integer> s2=new Stack<>();
      while(s1.size()>0){
        int x=s1.peek();
        s2.push(x);
        s1.pop();
      }
      System.out.println(s2);
      Stack<Integer> s3=new Stack<>();
      while(s2.size()>0){
        int s=s2.peek();
        s3.push(s);
        s2.pop();
      }
      System.out.println(s3);
    }
}
