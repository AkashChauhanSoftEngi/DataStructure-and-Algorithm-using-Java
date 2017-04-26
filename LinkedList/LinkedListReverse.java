/*
#create a linked list and reverse it
Input: a->b->c->d->e->f->g->h->i->j
Output: j->i->h->f->e->d->c->b->a
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
    
    Node reverseLinkedList(Node traverse){
        while(traverse==null && traverse.next==null){
            return traverse;
        }
        
        Node prv=null;
        Node nxt;
        while(traverse!=null){
            nxt=traverse.next;
            traverse.next=prv;
            prv=traverse;
            traverse=nxt;
        }
        return prv;
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
        
        System.out.println();
        System.out.println("Reversed LinkedList!");
        Node newHead;
        newHead=obj.reverseLinkedList(head);
        obj.printLinkedList(newHead);
        obj.printLinkedList(head);
        
        
    }
}
