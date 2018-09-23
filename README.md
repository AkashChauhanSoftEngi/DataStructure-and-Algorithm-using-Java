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
