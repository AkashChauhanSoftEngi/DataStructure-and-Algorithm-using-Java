/*
#create a linked list and add functions like push, delete, print elements
-Time Complexity: O(n)
-Space Complexity: O(1)
*/

class Node{
    char data;
    Node next;
    
    public Node(char key){
        this.data=key;
        this.next=null;
    }
}

class LinkedList{
    
    static Node head;
    Node traverse;
    
    void puchElement(char key){
        if(head==null){
            head=new Node(key);
            return;
        }
        else{
            traverse=head;
            while(traverse.next!=null){
            traverse=traverse.next;
        }
        
        Node ele=new Node(key);
        traverse.next=ele;
        return;
        }
    }
    
    void printLinkedList(Node HEAD){
        Node traverse=HEAD;
        if(traverse.next==null | traverse==null){
            return;
        }
        while(traverse.next!=null){
            System.out.print(traverse.data + "->");
            traverse=traverse.next;
        }
        System.out.println(traverse.data + "->null");
        return;
    }
    
    void deleteElemment(char item){
        Node traverse=head;
        Node prv=null, nxt;
        while(traverse.data!=item){
            prv=traverse;
            traverse=traverse.next;
        }
        nxt=traverse.next;
        prv.next=nxt;
        traverse=null;
    }
    
    public static void main(String[] args){
        LinkedList obj=new LinkedList();
        obj.puchElement('a');
        obj.puchElement('b');
        obj.puchElement('c');
        obj.puchElement('d');
        obj.puchElement('e');
        obj.puchElement('f');
        obj.puchElement('g');
        obj.puchElement('h');
        obj.puchElement('i');
        obj.puchElement('j');
        System.out.println("Given Linked List:");
        obj.printLinkedList(head);
        
        //Delete element
        obj.deleteElemment('j');
        System.out.println();
        System.out.println("After Deleting 'j' The LinkedList:");
        obj.printLinkedList(head);
        
    }
}
