
class Node{
    int key;
    Node left, right;
    public Node(int item){
        key=item;
        left=right=null;
    }
}

class BinaryTree {
    // root of the tree (Has a relation)
    Node root;
    
    //constructor
    public BinaryTree(int item){
    root = new Node(item);    
    }
    
    //constructor
    public BinaryTree(){
        root = null;
    }
    
    public static void main(String[] args){
        BinaryTree bTree=new BinaryTree();
        
        bTree.root = new Node(1);
        bTree.root.left = new Node(2);
        bTree.root.right = new Node(3);
    }
    
}
