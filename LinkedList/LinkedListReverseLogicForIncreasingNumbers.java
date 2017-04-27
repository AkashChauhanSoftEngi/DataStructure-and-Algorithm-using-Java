/*
#create a linked list and perform element reverse logic in given fashion
-Input: a->b->c->d->e->f->g->h->i->j->null
-Output: a->c->b->f->e->d->j->i->h->g->null
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
        if(traverse.next==null){
            System.out.print(traverse.data + "->null");
            return;
        }
        while(traverse.next!=null){
            System.out.print(traverse.data + "->");
            traverse=traverse.next;
        }
        System.out.println(traverse.data + "->null");
    }
    
    Node reverseLinkedListForLogic(Node HEAD){
        
        Node newList, addPart, start, end, orig=HEAD;
        
        if(HEAD==null | HEAD.next==null){
            return HEAD;
        }
        newList=HEAD;
        int i=2;
        HEAD=HEAD.next;
        while(HEAD!=null){
            start=HEAD;
            int j=i;
            while(j>1 & HEAD.next!=null){
                HEAD=HEAD.next;
                j--;
            }
            end=HEAD;
            //System.out.println("start:"+start.data + "End:"+ end.data);
            HEAD=HEAD.next;
            end.next=null;
            addPart = reversePart(start, end.next);
            newList.next=addPart;
            while(newList.next!=null)
            {
                newList=newList.next;
                //System.out.println(newList.data);
            }
            i++;
        }
        return orig;
    }
    
    Node reversePart(Node start, Node end){
        while(start==null && start.next==null){
            return start;
        }
        Node traverse = start;
        Node prv=null;
        Node nxt;
        while(traverse!=end){
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
        // obj.puchElement('j');
        System.out.println("Given Linked List:");
        obj.printLinkedList(head);
        
        System.out.println();
        System.out.println("Reversed LinkedList for given Logic!");
        Node newHead;
        newHead=obj.reverseLinkedListForLogic(head);
        obj.printLinkedList(newHead);
        
    }
}
