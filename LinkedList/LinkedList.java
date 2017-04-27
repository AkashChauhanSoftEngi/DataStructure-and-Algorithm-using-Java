//Linked List

import java.util.*;
class LinkedListExample {
     public static void main(String args[]) {

         /* Linked List Declaration */
         LinkedList<String> linkedlist = new LinkedList<String>();

         /*add(String Element) is used for adding 
          * the elements to the linked list*/
         linkedlist.add("Item1");
         linkedlist.add("Item5");
         linkedlist.add("Item3");
         linkedlist.add("Item6");
         linkedlist.add("Item2");
         
         System.out.println(linkedlist);
     }
}