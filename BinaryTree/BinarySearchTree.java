/*
#Binary Search Tree
-search:O(logn)
-delete:O(logn)
-insert:O(logn)
-display:O(n)
*/

class Node{
    int key;
    Node left;
    Node right;
    public Node(int data){
        this.key=data;
        this.left=null;
        this.right=null;
    }
}

class BinarySearchTree{
    Node root;
    public BinarySearchTree(){
        root=null;
    }
    
    //This method should place element at right location
    public void insertNode(int data){
        
        if(root==null){
            root=new Node(data);
        }
        else{
         Node node=new Node(data);
         Node node1;
         node1 = root;
         while(node1.left!=null & node1.right!=null){
               if(node.key<node1.key){
                   node1=node1.left;
               }
               else{
                   node1=node1.right;
               }
            }
            if(node.key<node1.key){
                    node1.left=node;
        }
        else{
            node1.right=node;
        }
        }
    }
    public void displayTree(Node root){
        if(root!=null)
        {
        displayTree(root.left);
        System.out.print(" " + root.key);
        displayTree(root.right);
        }
        
    }
    
    public boolean searchNode(int data){
        Node node=null;
        node = root;
        if(root==null){
            return false;
        }
        while(node.key!=data)
        {
            if(data<node.key){
                node=node.left;
            }
            else{
                node=node.right;
                
            }
        }
        if(node.key==data)
        {
         return true;   
        }
        else{
        return false;
        }
    }
    
    public boolean deleteNode(int data){
        Node node;
        Node parent=null;
        if(root==null){
            return false;
        }
        node = root;
        while(node.key!=data)
        {
            parent = node;
            if(data<node.key){
                node=node.left;
            }
            else{
                node=node.right;
                
            }
        }
        
        //till now we have reached to the node to be deleted
        if(node.key==data)
        {
            //if node does not have any left of right child
            if(node==parent.left & (node.left==null & node.right==null)){
            parent.left=null;
            System.gc();
            return true;
            }
            if(node==parent.right & (node.left==null & node.right==null)){
                parent.right=null;
                System.gc();
                return true;
            }
            
            //if only node has only one child (left | right)
            if(node.left!=null & node.right==null){
                if(parent.left==node){
                parent.left=node.left;
                }
                if(parent.right==node){
                    parent.right=node.left;
                }
                node=null;
                return true;
            }
            if(node.right!=null & node.left==null){
                if(parent.left==node){
                parent.left=node.right;
                }
                if(parent.right==node){
                    parent.right=node.right;
                }
                node=null;
                return true;
            }
            
            //if node has both left and right child
            if(node.left!=null & node.right!=null){
                            /*Not completed*/
                            return false;    
            }
            
            else{
                return false;
            }
        }
        else{
            return false;
        }
        
    }
    
    public static void main(String[] args){
        BinarySearchTree obj=new BinarySearchTree();
        
        //insert
        obj.insertNode(2); 
        obj.insertNode(1);
        obj.insertNode(4);
        obj.insertNode(3);
        obj.displayTree(obj.root);
        
        //empty space/line
        System.out.println();
        
        //search
        if(obj.searchNode(3)){
            System.out.println(3 + " Exists in the tree");
        }
        
        //empty space/line
        System.out.println();
        
        //delete
        if(obj.deleteNode(3)){
            System.out.println("3 is deleted!");
        }
        obj.displayTree(obj.root);
        
    }
}