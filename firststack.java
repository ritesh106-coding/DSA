import java.util.Stack;
public class firststack {
    public static void main(String[] args) {
     Stack<Integer> st =new Stack<>();
     System.out.println("Size of stack: "+st.size());
     st.push(2);
     st.push(23);
    st.push(12);
    st.push(45);
    st.push(67);
    System.out.println("Top element of stack: "+st.peek());
    System.out.println(st);
    st.pop();
    System.out.println(st);
    }
}
