import java.util.*;
public class Insertion_BinaryTree{
    static class node{
        int data;
        node left,right;
        node(int data){
            this.data=data;
        }
    }
    static node root=null;
    static void insert(int value){
        node newnode=new node(value);
        if(root==null){
            root=newnode;
            return;
        }
        Queue<node>q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            node current=q.remove();
            if(current.left==null){
                current.left=newnode;
                return;
            }else{
                q.add(current.left);
            }
            if(current.right==null){
                current.right=newnode;
                return;
            }else{
                q.add(current.right);
            }
        }
    }
    static void inorder(node node1){
        if(node1==null){
            return;
        }
        inorder(node1.left);
        System.out.println(node1.data+" ");
        inorder(node1.right);
    }
    public static void main(String[]args){
       insert(10);
       insert(20);
       insert(30);
       insert(40);
       insert(50);
       System.out.println("Inorder Traversal");
       inorder(root);
       
    }
}


