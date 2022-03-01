# Short Answer HW

### **Future vs CompletableFuture:**

CompletableFuture is used for asynchronous programming in Java. Asynchronous programming is a means of writing non-blocking code by running a task on a separate thread than the main application thread and notifying the main thread about its progress, completion or failure.
CompletableFuture is an extension to Java’s Future API which was introduced in Java 5.
A Future is used as a reference to the result of an asychronous computation. It provides an isDone() method to check whether the computation is done or not, and a get() method retrieve the result of the computation when it is done.

### Summary:

1. **Maven**
Maven is a powerful project management tool that is based on POM (project object model). It is used for projects build, dependency and documentation. It simplifies the build process like ANT.
Types of Repositories: local, central, remote. 
Life Cycle: validate, compile, test, package, verify, install, deploy.
2. **Git**
Git is a DevOps tool used for source code management.
3. **Eight Basic Data Types**
    1. `byte`: The byte data type is an 8-bit signed two's complement integer. It has a minimum value of -128 and a maximum value of 127 (inclusive).
    2. `short`: The short data type is a 16-bit signed two's complement integer. It has a minimum value of -32,768 and a maximum value of 32,767 (inclusive).
    3. `int`: By default, the int data type is a 32-bit signed two's complement integer, which has a minimum value of $-2^{31}$ and a maximum value of $2^{31}-1$.
    4. `long`: The long data type is a 64-bit two's complement integer. The signed long has a minimum value of $-2^{63}$ and a maximum value of $2^{63}-1$.
    5. `float`: The float data type is a single-precision 32-bit IEEE 754 floating point.
    6. `double`: The double data type is a double-precision 64-bit IEEE 754 floating point.
    7. `char`: The char data type is a single 16-bit Unicode character. It has a minimum value of `'\u0000'`(or 0) and a maximum value of `'\uffff'`(or 65,535 inclusive).
    8. `boolean`: The boolean data type has only two possible values: `true`and `false`. Use this data type for simple flags that track true/false conditions. This data type represents one bit of information, but its "size" isn't something that's precisely defined.
4. **String, StringBuilder, StringBuffer
String** is a sequence of characters. In Java, objects of String are immutable which means a constant and cannot be changed once created.
**StringBuilder** is mutable, not thread-safe with a higher performance.
**StringBuffer** is mutable, thread-safe with lower performance.
5. **String/String constant pool**
String pool is a area that store string in heap memory. We need String pool to save memory and we don’t need to create a new object of String if the String have already exist.
6. **equals/hashcode
hashCode()** generates an int value for an object with using some hashing algorithms.
**equals()** compare 2 objects and return a Boolean value indicating the comparison result. The default implementation is to compare if 2 references are pointing to the same object.
7. **Collection**
There are 4 core interfaces that compose the hierarchy of the entire collection framework which are: `List`, `Queue`, `Set`. 
**`List`**: List contain the element as the arranged sequential order, thus, the element in the list can be access by index. Under the List interface, we can implement ArrayList, LinkedList, Vector, Stack.
**`Set`**: Set is used for storing the unique elements which mean the duplications are not allowed in Set. Set does not store the element in sequential order, thus, the order of the Set is not same as the order according to our insertion. Under the Set interface, we can implement HashSet, LinkedHashSet. Elements in the Set can only be iterated using iterator.
**`Queue`**: Queue restrict the insertion of an element to the one end of the structure and remove from the another end. This is called FIFO - First In First Out principle. This interface can implement LinkedList and PriorityQueue.
There are extend interfaces which are: 
**`Deque`**: Deque interface extends the Queue interface. In Deque, we can remove and add the elements from both the side. Deque stands for a double-ended queue which enables us to perform the operations at both the ends. Under Deque interface, we can implement ArrayDeque.
**`SortedSet`**: SortedSet interface extends the Set interface. SortedSet is the alternate of Set interface that provides a total ordering on its elements. The elements of the SortedSet are arranaged in the increasing order. The SortedSet provides the additional methods that inhibit the natural ordering of the elements. SortedSet interface can implements TreeSet.
8. **Comparator vs Comparable
Comparable:**
Comparable interface is used to sort the objects with natural ordering. It compares “this” reference with the object specified. It affects the original class, i.e., the actual class is modified.
By using comparable, we need to implement the Comparable interface with the class that we want do sort, and we override the method compareTo() of Comparable interface.
**Comparator:**
Comparator is external to the element type we are comparing. It is a separate class. We create multiple separate classes to compare by different members. For using comparator, we need to create a class that implements Comparator, then make an instance of the Comparator class. Call the overloaded sort() method, giving it both the list and the instance of the class that implements Comparator.
9. **JVM**
Java Virtual Machine (JVM) is a virtual machine that enables a computer to run Java programs as well as programs written in other languages that are also compiled to Java bytecode. JVM’s three part: Class Loader, Runtime Memory/Data Area, Execution Engine.
10. **class Loader**
Class loaders are responsible for loading Java classes dynamically to the JVM during runtime. They’re also part of the JRE (Java Runtime Environment). Therefore, the JVM doesn’t need to know about the underlying files or file systems in order to run Java programs.
11. **Garbage Collector**
Garbage means unreferenced objects. Garbage collection is a process in Java where unused memory is recycled by destroying the unreferenced objects.
Garbage collector counts the references to objects.  When the number of references to an object becomes 0 in the JVM, the collector will destroy and recycle the memory. When heap memory is full, Garbage Collection starts from the older object in the old space.
12. **OOP**
Object oriented programming is a programming mechanism that is driven by object. Which, have the following features:
    1. **Inheritance**
    Inheritance means one class can derives from another class and acquires all the properties of the derived class.
    2. **Encapsulation**
    Encapsulation means data hiding. This allows class member variables to be invisible and only accessible via the class method, like getter and setter. 
    3. **Polymorphism**
    Polymorphism normally happens during inheritance. Each subclass is a unique form of the parent class. For the methods that are in the parent class, subclasses can override them in different ways.
    4. **Abstraction**
    Class with abstraction provides the function interface without implementation details. This normally happens in Interfaces/Abstract classes.
13. **Exception**
    1. **What is Exception Handling?**
    Java method can throw exceptions. The logic used to handle these exceptions is called exception handling.
    2. **How to handle exception?**
    Use try/catch. Just throw and let the function caller handle it.
    3. **Checked Exception:**
    Classes that extend Throwable class except Runtime and Error are called checked exception. Checked exceptions are checked at compile-time and have to be handled.
    4. **Unchecked Exception:**
    Classes that extend RuntimeException are known as unchecked exceptions. Unchecked exceptions happen during runtime and are not required to be handled.
14. **Generics**
A generic type is a generic class or interface that is parameterized over types. For example, the Java List class can be applied to different data types in java.
15. **IO Stream**
An I/O Stream represents an input source or an output destination. A stream can represent many different kinds of sources and destinations, including disk files, devices, other programs, and memory arrays.
Byte Stream:
InputStream, OutputStream (1 byte = 8 bits)
CharacterStream:
Reader, Writer (2 byte = 16 bits)
16. **Serialization and deserialization**
Serialization is a mechanism of converting the state of an object into a byte stream. Deserialization is the reverse process where the byte stream is used to recreate the actual Java object in memory. This mechanism is used to persist the object.  
17. **Java 8 features**
    1. **Lambda Expression**
    A new language feature allowing us to treat actions as objects which mean we can pass a function as a parameter of method. A lambda expression is a short block of code which takes in parameters and returns a value. Example: x → x+1, this lambda expects an input parameter x and return the x+1 as the result.
    2. **Method References**
    Method References enable us to define Lambda Expressions by referring to methods directly using their names.
    3. **Optional**
    Optional is special wrapper class used for expressing optionally.  We can use Optional to avoid the null pointer exception.
    4. **Functional Interface**
    An interface with maximum one abstract method; implementation can be provided using a Lambda Expression.
    5. **Default methods**
    Default methods give us the ability to add full implementations in interfaces besides abstract methods.
    6. **Nashorn, JavaScript Engine**
    Java-based engine for executing and evaluating JavaScript code.
    7. **Stream API**
    A special iterator class that allows us to process collections of objects in a functional programming manner.
    8. **Date API**
    An improved, immutable JodaTime-inspired Date API.
18. **Multi-threading**
    1. **How to implement Multithread?**
        
        **Method 1: Extending the Thread Class**
        
        Create a class that extends the java.lang.Thread class. This class overrides the run() method available in the Thread class. A thread begins its life inside run() method. We create an object of our new class and call start() method to start the execution of a thread. start() invokes the run() method on the Thread object. 
        
        **Method 2: Thread creation by implementing the Runnable Interface**
        
        Create a new class which implements java.lang.Runnable interface and override run() method. Then we instantiate a Thread object and call start() method on this object.
        
        **Method 3: Thread creation by implementing** java.util.concurrent interface. The callable object can return the computed result done by a thread in contrast to a runnable interface which can only run the thread. The Callable object returns a Future object which provides methods to monitor the progress of a task being executed by a thread. The future object can be used to check the status of a Callable and then retrieve the result from Callable once the thread is done. It also provides timeout functionally.
        
    2. **Thread class vs Runnable interface vs Callable**
    If we extend the Thread class, our class cannot extend any other class because Java doesn’t support multiple inheritance. But, if we implement the Runnable interface, our class can still extend other base classes.
    We can achieve basic functionality of a thread by extending Thread class because it provides some inbuilt methods like yield(), interrupt() etc. that are not available in Runnable interface.
    Using Runnable will give you an object that can be shared amongst multiple threads.
    Using Callable will give a return object.