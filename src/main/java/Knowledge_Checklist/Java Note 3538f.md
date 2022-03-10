# Java Note

### OOP Related:

[Object](Java%20Note%203538f/Object%205dced.md) oriented programming is a programming mechanism that is driven by object. Which, have the following features:

- **Inheritance:** 
Inheritance means one class can derives from another class and acquires all the properties of the derived class.
    - **[How many types of inheritance are supported by Java?](Java%20Note%203538f/Types%20of%20I%20a0df0.md)**
- **Encapsulation**
Encapsulation means data hiding. This allows class member variables to be invisible and only accessible via the class method, like getter and setter.
    - [How does Java implement Encapsulation? Why do we need encapsulation?](Java%20Note%203538f/How%20does%20J%20227ed.md)
- **Polymorphism**
Polymorphism normally happens during inheritance. Each subclass is a unique form of the parent class. For the methods that are in the parent class, subclasses can override them in different ways.
    - [How does Java implement Polymorphism?](Java%20Note%203538f/How%20does%20J%20580f4.md)
    - [Override vs Overload](Java%20Note%203538f/Override%20v%206d757.md)
- **Abstraction**
Class with abstraction provides the function interface without implementation details. This normally happens in Interfaces/Abstract classes.
    - [What are the differences between abstraction and encapsulation?](Java%20Note%203538f/What%20are%20t%20f63a7.md)
    - [Abstract class vs Interface](Java%20Note%203538f/Abstract%20c%205071b.md)

### JVM Related

A Java virtual machine (JVM) is a virtual machine that enables a computer to run Java programs as well as programs written in other languages that are also compiled to Java bytecodes.

![Untitled](Java%20Note%203538f/Untitled.png)

- **[Class Loader:](Java%20Note%203538f/Class%20Load%20ac48b.md)**
- **[Runtime Memory/Data Area](Java%20Note%203538f/Runtime%20Me%200aad7.md)**
- **[Execution Engine](Java%20Note%203538f/Execution%20%20bff2b.md)**
- **Java Native Interface(JNI):**
JNI acts as a bridge(mediator) between java method calls and corresponding **native method libraries**.

### Data Type Related

- **Primitive Data Types:**
    - [Eight Basic Data Types](Java%20Note%203538f/Eight%20Basi%20d9bdf.md)
- **Non-primitive Data Types:**
    - **Wrapper Classes**
    A wrapper class is a class can contain or wrap the primitive data type in Java. The reason why we need this is, once the primitive data types been wrapped to a class or object, we can do more complex modification.
    - **String**
        - **String/StringBuilder/StringBuffer**
            
            
            | String  | StringBuilder | StringBuffer |
            | --- | --- | --- |
            | Immutable | Mutable | Mutable |
            | Thread safe |  Not thread-safe | Thread safe |
            |  | Faster than StringBuffer | Slower than StringBuilder |
        - **String/String Constant Pool
        String constant pool** is a area that store string in heap memory. We need String pool to save memory and we don’t need to create a new object of String if the String have already exist.
            - **== vs equals()**
            == operator compares reference or memory location of objects in a heap, whether they point to the same location or not.
            equals() evaluates to the comparison of values in the objects.
    - **Autoboxing and Unboxing
    *Autoboxing*** is the automatic conversion that the Java compiler makes between the primitive types and their corresponding object wrapper classes. For example, converting an int to an Integer, a double to a Double, and so on. If the conversion goes the other way, this is called ***unboxing***.

### Java Keywords

- [Flow Control](Java%20Note%203538f/Flow%20Contr%20929d6.md)
- [Modifiers](Java%20Note%203538f/Modifiers%201c092.md)
- [Exception Handling](Java%20Note%203538f/Exception%20%20e0d3c.md)
- [Class-related Keywords](Java%20Note%203538f/Class-rela%201a2d9.md)
- [Object related keywords](Java%20Note%203538f/Object%20rel%20a4b32.md)

### Generics

- [Generics Methods](Java%20Note%203538f/Generics%20M%2053b2a.md)
- [Generic Classes](Java%20Note%203538f/Generic%20Cl%20c82c5.md)

### IO Stream

- **Stream**
A stream can be defined as a sequence of data. There are two kinds of Streams
    - **InputStream**: The InputStream is used to read data from a source.
    - **OutputStream**: The OutputStream is used for writing data to a destination.
- **Byte Stream**
Java byte streams are used to perform input and output of 8-bit bytes. Byte stream invoke InputStream and OutputStream, commonly: **FileInputStream**, **FileOutputStream**.
- **Character Stream**
Java **Character** streams are used to perform input and output for 16-bit Unicode. Character stream invoke Reader and Writer, commonly: **FileReader, FileWriter**.
- **File**
Java File class represents the files and directory pathnames in an abstract manner. This class is used for creation of files and directories, file searching, file deletion, etc.

### Serialization and Deserialization

Serialization is the conversion of the state of an object into a byte stream; deserialization does the opposite. Stated differently, serialization is the conversion of a Java object into a static stream (sequence) of bytes, which we can then save to a database or transfer over a network.

- [Serialization Implementation and Example](Java%20Note%203538f/De%20Seriali%20cb940.md)

### Java 8 Features

- [Lambda](Java%20Note%203538f/Lambda%20Exp%20782d2.md)
- [Functional Interface](Java%20Note%203538f/Functional%20b071d.md)
- [Optional](Java%20Note%203538f/Optional%209aaee.md)
- [Stream API](Java%20Note%203538f/Stream%20API%20b5962.md)

### Collections

- **Collections Type Hierarchy:**
There are 4 core interfaces that compose the hierarchy of the entire collection framework which are: `List`, `Queue`, `Set`:
    - **List**: List contain the element as the arranged sequential order, thus, the element in the list can be access by index.
        - [**Implementations of List](Java%20Note%203538f/Implementa%20fdc4c.md):** `ArrayList`, `LinkedList`, `Vector`, `Stack`
    - **Set**: Set is used for storing the unique elements which mean the duplications are not allowed in Set. Set does not store the element in sequential order, thus, the order of the Set is not same as the order according to our insertion. Elements in the Set can only be iterated using iterator.
        - [Implementations of Set](Java%20Note%203538f/Implementa%205f990.md): `HashSet`, `LinkedHashSet`
        - **`SortedSet`**: SortedSet interface extends the Set interface. SortedSet is the alternate of Set interface that provides a total ordering on its elements. The elements of the SortedSet are arranaged in the increasing order. The SortedSet provides the additional methods that inhibit the natural ordering of the elements.
            - [Implementation of SortedSet](Java%20Note%203538f/Implementa%2057de3.md): `TreeSet`
    - **Queue**: Queue restrict the insertion of an element to the one end of the structure and remove from the another end. This is called FIFO - First In First Out principle.
        - [Implementations of Queue](Java%20Note%203538f/Implementa%20f0072.md): `PriorityQueue`, `LinkedList`
        - [LinkedList of List vs LinkedList of Queue](Java%20Note%203538f/LinkedList%2060feb.md)
        - **Deque**: Deque interface extends the Queue interface. In Deque, we can remove and add the elements from both the side. Deque stands for a double-ended queue which enables us to perform the operations at both the ends.
            - [Implementations of Deque](Java%20Note%203538f/Implementa%20f1732.md): `ArrayDeque`
- **Map Interface:**
The map interface is present in **java.util** package represents a mapping between a key and a value. The Map interface is not a subtype of the **Collection interface**. Therefore it behaves a bit differently from the rest of the collection types. A map contains unique keys.
    - [Implementations of Map](Java%20Note%203538f/Implementa%2078e27.md): `HashMap`, `LinkedHashMap`, `HashTable`
    - **SortedMap:**
    SortedMap is an interface in the **collection framework**. This interface extends the **Map interface** and provides a total ordering of its elements (elements can be traversed in sorted order of keys).
        - [Implementations of SortedMap](Java%20Note%203538f/Implementa%202940a.md): `TreeMap`
    - **ConcurrentMap:**
    ConcurrentMap interface present in **java.util.concurrent** package. It provides some extra methods apart from what it inherits from the SuperInterface i.e. **java.util.Map**. It has inherited the Nested Interface **Map.Entry<K, V>**.
        - [Implementations of Concurrent Map](Java%20Note%203538f/Implementa%204f921.md): `ConcurrentHashMap`, `ConcurrentSkipListMap`
    - **[HashMap vs LinkedHashMap vs TreeMap?](Java%20Note%203538f/What%20are%20t%208e1a9.md)**
    - [HashMap vs HashTable vs ConcurrentHashMap](Java%20Note%203538f/HashMap%20vs%202ec4f.md)
    - [HashSet vs HashMap](Java%20Note%203538f/HashSet%20vs%20aaa5a.md)
    - **hashCode()/equals()
    hashCode()** generates an int value for an object with using some hashing algorithms. **equals()** compare 2 objects and return a Boolean value indicating the comparison result. The default implementation is to compare if 2 references are pointing to the same object.
        - **[How Is HashMap Implemented in Java? How Does Its Implementation Use hashCode and equals Methods of Objects? What Is the Time Complexity of Putting and Getting an Element from Such Structure?](Java%20Note%203538f/How%20Is%20Has%201cd15.md)**

### Comparator vs Comparable

- **Comparable:**
Comparable interface is used to sort the objects with natural ordering. It compares “this” reference with the object specified. It affects the original class, i.e., the actual class is modified.
By using comparable, we need to implement the Comparable interface with the class that we want do sort, and we override the method compareTo() of Comparable interface.
    
    ```java
    class Movie implements Comparable<Movie>
    {
        private double rating;
        private String name;
        private int year;
     
        // Used to sort movies by year
        public int compareTo(Movie m)
        {
            return this.year - m.year;
        }
    }
    ......
    Collections.sort(list);
    ```
    
- **Comparator:**
Comparator is external to the element type we are comparing. It is a separate class. We create multiple separate classes to compare by different members. For using comparator, we need to create a class that implements Comparator, then make an instance of the Comparator class. Call the overloaded sort() method, giving it both the list and the instance of the class that implements Comparator.
    
    ```java
    class NameCompare implements Comparator<Movie>
    {
        public int compare(Movie m1, Movie m2)
        {
            return m1.getName().compareTo(m2.getName());
        }
    }
    
    .....
    
    NameCompare nameCompare = new NameCompare();
    Collections.sort(list, nameCompare);
    ```
    

### Exception

- **Checked Exception:**
Classes that extend Throwable class **except** Runtime and Error are called checked exception. Checked exceptions are checked at compile-time and have to be handled.
    - IOException, CompiletimeException
- **Unchecked Exception:**
Classes that extend **RuntimeException** are known as unchecked exceptions. Unchecked exceptions happen during runtime and are not required to be handled.
- **How can we handle an exception in Java?**
Use try/catch. Just throw and let the function caller handle it.
- **How do we handle exceptions while overriding methods?**
If the superclass method does not declare an exception, subclass overridden method cannot declare the checked exception.
If the superclass method does not declare an exception, subclass overridden method cannot declare the checked exception but can declare unchecked exception.
- **What is custom Exception and why do we need to use custom Exception?**
Custom Exception is used to customize the exception according to user need. We need to use it because it provides us the flexibility to add attributes and methods that are not part of a standard Java exception.
- **Finally Keyword**
Finally is used in Java exception handling, normally placed after the catch block. It will always be executed no matter if the exception is handled or not.

### Multi-threading

- **Process:**
Process are basically the programs which are dispatched from the ready state and are scheduled in the CPU for execution. PCB (Process Control Block) holds the concept of process. A process can create other processes which are known as Child Processes. The process takes more time to terminate and it is isolated means it does not share the memory with any other process.
- **Thread:**
Thread is the segment of a process means a process can have multiple threads and these multiple threads are contained within a process. A thread has three states: Running, Ready, and Blocked. Thread takes less time to terminate as compared to process but unlike process threads do not isolate.
    - [Thread Life Cycle (6 states of Threading)](Java%20Note%203538f/Thread%20Lif%203e0c8.md)
    - [Thread Creation](Java%20Note%203538f/Thread%20Cre%2010d4a.md): `Thread`, `Runnable`, `Callable`, `Thread Pool`
    - [Runnable vs Callable](Java%20Note%203538f/Runnable%20v%20a827c.md)
- [Process vs Thread](Java%20Note%203538f/Process%20vs%200b71f.md)
- [Synchronization](Java%20Note%203538f/Synchroniz%20d4fa6.md)

[De/Serialization Examples](Java%20Note%203538f/De%20Seriali%20cb940.md)