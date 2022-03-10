# Implementations of List

- **ArrayList**: 
ArrayList uses a dynamic resizable array to store the duplicate element of different data types. The ArrayList class maintains the order according the insertion orders. ArrayList is non-synchronized. ArrayList can be randomly accessed which allow O(1) accessing time.
- **LinkedList**: 
LinkedList use the doubly linked list structure to store the elements. It can store the duplicate elements which remains the insertion order and is not synchronized. The manipulation in LinkedList are fast which takes O(1) time.
- **Vector**: 
Vector uses a dynamic array to store the data elements which is similar to ArrayList. However, it is **synchronized** (thread safe) and contains methods that are not the part of Collection framework.
- **Stack**: 
Stack is a subclass of Vector. It using the stack data structure (**last-in-first-out**). The Stack contains all of the methods of **Vector** class, thus, it is **thread safe**. And also provides its own methods like push(), pop(), peek(), etc.