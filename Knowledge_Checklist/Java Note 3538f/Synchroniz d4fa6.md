# Synchronization

- **What are some of the ways to perform Thread Synchronization?**
    1. Synchronized Method
    2. Synchronized Block
    3. Static Synchronization
    
    ```java
    class Demo {
    	public void method() {
    		synchronized(Demo.class) {
    }
    }
    
    public synchronized void method() {
    
    }
    
    public synchronized static void method() {
    
    }
    
    public void method () {
    	synchronized(this) {
    }
    }
    
    }
    ```
    
- **What is Deadlock? How to resolve it?**
In Java, a **deadlock** is a programming situation where **two or more threads are blocked forever**. A deadlock condition will occur with at least **two threads** and **two or more resources.**
    - **Avoid Nested Locks**: A deadlock mainly happens when we give locks to multiple threads. Avoid giving a lock to multiple threads if we already have given to one.
    - **Avoid Unnecessary Locks**: We can have a lock only those members which are required. Having a lock unnecessarily can lead to a deadlock.
    - **Using Thread.join():** A deadlock condition appears when one thread is waiting other to finish. If this condition occurs we can use **Thread.join()** with the maximum time the execution will take.
- **What are the differences between SynchronizedMap and ConcurrentHashMap?**
*Collections.synchronizedMap()* requires each thread to acquire a lock on the entire object for both read/write operations. By comparison, the *ConcurrentHashMap* allows threads to acquire locks on separate segments of the collection, and make modifications at the same time.
- **Lock**
Locks (and other more advanced synchronization mechanisms) are created using synchronized blocks, so it is not like we can get totally rid of the `synchronized`keyword.
    
    ```java
    public class Counter{
    
      private Lock lock = new Lock();
      private int count = 0;
    
      public int inc(){
        lock.lock();
        int newCount = ++count;
        lock.unlock();
        return newCount;
      }
    }
    ```
    
    - **Lock Reentrance:**
    Synchronized blocks in Java are reentrant. This means, that if a Java thread enters a synchronized block of code, and thereby take the lock on the monitor object the block is synchronized on, the thread can enter other Java code blocks synchronized on the same monitor object. Here is an example:
        
        ```java
        public class Reentrant{
        
          public synchronized outer(){
            inner();
          }
        
          public synchronized inner(){
            //do something
          }
        }
        ```
        
        Notice how both `outer()`and `inner()`are declared synchronized, which in Java is equivalent to a `synchronized(this)`block. If a thread calls `outer()`there is no problem calling inner() from inside `outer()`, since both methods (or blocks) are synchronized on the same monitor object ("this"). If a thread already holds the lock on a monitor object, it has access to all blocks synchronized on the same monitor object. This is called reentrance. The thread can reenter any block of code for which it already holds the lock.
        
    - **Lock Interface**
        - lock()
        - unlock()
        - newCondition()
        - tryLock()
        - lockInterruptibly()
        - ReentrantLock Class
    - **ReadWriteLock Interface**
        - Method
            - Lock readLock();
            - Lock writeLock();
        - Class
            - reentrantReadWriteLock