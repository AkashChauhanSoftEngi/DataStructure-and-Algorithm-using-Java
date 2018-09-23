# DataStructure-and-Algorithm-using-Java
This repository includes DataStructure and Algorithms implementation in Java

I have included Data Structure and Algorithm implementations using java along with their Time and Space complexities. I have added the description of each implementation so it's easy to understand the code itself!
I intend to uploading more implementations using java with simple and easy descriptions to understand the concept behind the code I make!


## Binary Tree
* Binary Tree
  - At max two children
  - height: Log(n), base 2 {from leaf nodes}
  - Depth: Log(n), base 2 {from root node}

* Binary Search Tree(BST)
  - LeftNode.data < root.data < RightNode.data {Ordered}
  - Left and Right tree must be BST as well
  - Log(n), base 2: search time
  - There can not be any duplicate element in the entire tree
  - Reference: https://www.youtube.com/watch?v=MILxfAbIhrE
  
* Left Skew and right skew tree
  - All nodes in left side, and right side respectively
  - O(n), complexity
  
* Height Balanced Tree(HBT)
  - Height diff (Balance factor) = k (height of left tree and right tree)
  - This rule applies for every node in the tree
  - O(logn), complexity
  
* AVL Tree
  - It is a HBT(k=1)

* Full Binary Tree (Fully Complete Binary Tree)
  - HBT(k=0)
  - No missing number
  - all leaf nodes at height h
  - last level fills completely

* Complete Binary Tree
  - No missing Number
  - all leaf nodes at height h or h-1
  
* Red Black Tree (black and red nodes only)
  - 1.Root & leaves are black
  - 2.Children of red node are black 
  - 3.All path from a node to its nill descendants must have the same black nodes
  - Reference: https://www.youtube.com/watch?v=qvZGUFHWChY
  - Search, insert, delete: O(logn)
  - Need rotation to maintain property when inserting/delete any node
  - Longest path: alternate of black and red
  - Shortest path: all black nodes
  - So longest path <= 2* shortest path
  - uses TreeMap for the implementation

## Heap
* Binary Heap
  - Complete Binary Tree, no missing element, max two children
  - Can be represented by Array as well, in simple level order traversal
  - Binary Heap is being used to implement, Priority Queue
  - Heap: general term with no restriction on no of children
  - Reference: https://www.youtube.com/watch?v=t0Cq6tVNRBA
  
* Max Heap
  - Largest element at root
  - Elements are bigger than their children
  - Smaller elements as we go down
  
* Min Heap
  - Smallest element as root
  - Elements are smaller than their children
  - Larger elements as we go down

* Insertion in Heap
  - Next empty spot
  - top to bottom
  - left to right
  - We do not need to care about the value at first, just find a suitable empty spot
  - Then later we can use heapify to find the correct position of this element
  - HeapifyUp(): swap with the parent if smaller than root, until you find the correct position  

* Delettion
  - Easiest to delete the last element no need of any kind of change
  - remove the element and replace it with the last location element
  - Run heapifyDown() on this element to find the correct position according to its value
  - Replace it with smallest element among the children
  
* Heapsort
  - Build the heap: Insert element in natural order
  - Try to make it a Max heap
  - Find the correct place of root node in Max heap using heapifyDown
  - Repeat this process from the root then top to down and left to right, till the last node in the heap
  - Output of heap sort: Complete Max Heap
  
