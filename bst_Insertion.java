class bst_Insertion{
static class node{
    int data;
    node left,right;
    node(int data){
        this.data=data;
    }
}
static node insert(node root,int value){
    if(root==null){
        return new node(value);
    }
    if(value<root.data){
        root.left=insert(root.left,value);
    }else if(value>root.data){
        root.right=insert(root.right,value);
    }
    return root;
}
    public static void main(String[] args){
  node root = null;
        root = insert(root, 1);
        root = insert(root, 34);
        root = insert(root, 3);
        root = insert(root, 33);
        System.out.println("All insert");
  }
}
