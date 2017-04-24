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
        Node parent=root;
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
            if(node.left==null & node.right==null){
                if(root==node){
                    root=null;
                    return true;
                }
                if(node==parent.right){
                    parent.left=null;
                    System.gc();
                    return true;   
                }
                if(node==parent.right){
                    parent.right=null;
                    System.gc();
                    return true;
                }
            }
            
            //if node has only one child (left | right)
            if(node.left!=null & node.right==null){
                if(root==node){
                    root=node.left;
                    node=null;
                    return true;
                }
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
                if(root==node){
                    root=node.right;
                    node=null;
                    return true;
                }
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
                            /*
                            To find smallest element in right sub tree=successor;
                            */
                            Node successor = getSuccessor(node);
                            
                            if(node==root){
                                root=successor;
                                root.left=node.left;
                                return true;
                            }
                            
                            if(parent.left==node){
                             parent.left=successor;
                             successor.left = node.left;
                             return true;
                            }
                            if(parent.right==node){
                             parent.right=successor;
                             successor.left = node.left;
                             return true;
                            }
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
    
    public Node getSuccessor(Node deleteNode){
        Node current=null;
        Node successor=null;
        Node successorParent=null;
        
        current=deleteNode.right;
        
        if(current.left==null){
            successor=current;
            successor.right=current.right;
            return successor;
        }
        
        while(current!=null){
            successorParent=successor;
            successor=current;
            current=current.left;
        }
        if(successor.right==null){
        successorParent.left=null;
        }
        else{
            successorParent.left=successor.right;
        }
        successor.right=deleteNode.right;
        return successor;
    }
    
    public static void main(String[] args){
        BinarySearchTree obj=new BinarySearchTree();
        
        //insert
        obj.insertNode(2); 
        obj.insertNode(1);
        obj.insertNode(4);
        obj.insertNode(3);
        obj.insertNode(5);
        obj.insertNode(6);
        obj.displayTree(obj.root);
        
        //empty space/line
        System.out.println();
        
        //search
        if(obj.searchNode(6)){
            System.out.println(6 + " Exists in the tree");
        }
        
        //empty space/line
        System.out.println();
        
        //delete
        if(obj.deleteNode(2)){
            System.out.println("root is deleted!");
        }
        else{
            System.out.println("Node does not exist in given Tree till now!");
        }
        obj.displayTree(obj.root);
        
    }
}