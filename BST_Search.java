class BST_Search {
    static class node{
        int data;
        node left,right;
        
        node(int data){
            this.data=data;
        left=right=null;
        }
    }
    static boolean search(node root,int key){
        if(root==null){
            return false;
        }
        if(root.data==key){
            return true;
        }
        if(key<root.data){
            return search(root.left,key);
        }
        return search(root.right,key);
    }
  public static void main(String[] args) {
      node root=new node(50);
      root.left=new node(30);
      root.right=new node(70);
      root.left.left=new node(20);
      root.left.right=new node(40);
      root.right.left=new node(60);
      root.right.right=new node(80);
      int key=90;
    System.out.println("This is key   "+key);
    
    if(search(root,key)){
        System.out.println(key+ " found is BST");
    }else{
        System.out.println(key+ " not found is BST"); 
    }
  }
}







