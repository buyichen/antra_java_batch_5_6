# Daily Learning Report
## March 9

- **Question not cleared during interview:**
    - Java
        - Disadvantage of Stream API
        - Types of Thread Pool
    - Database
        - Sharding and Replica
        - Isolation Level
- **Content reviewed today:**
    - No-SQL topics, Threading
- **New things learned today:**
    - The common types of threading pool that Java have. For example,
        - Single Thread Executor
        - Cached Thread Pool
        - Fixed Thread Pool
        - Scheduled Thread Pool
        - etc.
- **Learning plan tomorrow:**
    - Get more deeper for multi-threading by research online.
    - Keep reviewing for No-SQL database.


## March 10

- **Content Review Today:**
    - **No-SQL Database**
        - **CAP Theorem**
        - **Concurrency**
        - **MongoDB Concept**
- **New things learned today:**
    - **Lock mechanism in MongoDB:**
        - MongoDB uses multi-granularity locking that allows operations to lock at the global, database or collection level, and allows for individual storage engines to implement their own concurrency control below the collection level.
    - **Sharding and Aggregation in MongoDB:**
        - Aggregation: Aggregations are the activates that handle the data records and give the record results.
        - Sharding: Sharding means storing the data on multiple machines.
    - **MapReduce:**
        - MapReduce is a standard multi-phase data aggregation modality which we use to process the data quantities.
    - **Aggregate Functions of MongoDB:**
        - `AVG`, `SUM`, `MIN`, `MAX`, `FIRST`, `PUSH`, `addTo Set`, `LAST`
    - **CURD in MongoDB:**

        ```java
        Create-db.collection.insert();
        Read-db.collection.find();
        Update-db.collection.update();
        Delete-db.collection.remove();
        ```

    - **How do ACID transactions work in MongoDB?**
        - MongoDB added support for multi-document ACID transactions in version 4.0 in 2018 and extended that support for distributed multi-document ACID transactions in version 4.2 in 2019.
          MongoDB's document model allows related data to be stored together in a single document. The document model, combined with atomic document updates, obviates the need for transactions in a majority of use cases.
    - **What is Daemon Thread?**
        - Daemon thread in Java is a low-priority thread that runs in the background to perform tasks such as garbage collection. Daemon thread in Java is also a service provider thread that provides services to the user thread. Its life depends on the mercy of user threads i.e. when all the user threads die, JVM terminates this thread automatically.
    - **What is Singleton Class? How to use Singleton Class achieve Thread Safe?**
        - In object-oriented programming, a singleton class is a class that can have only one object (an instance of the class) at a time. After the first time, if we try to instantiate the Singleton class, the new variable also points to the first instance created.
        - Code Example:

            ```java
            public class SingletonExample {
                private SingletonExample() {}
                // Singleton Object
                private static SingletonExample instance = null;
                // Static factory method
                public static synchronized SingletonExample getInstance() {
                    if (instance == null) {
                        instance = new SingletonExample();
                    }
                    return instance;
                }
            }
            ```

- **Learning Plan Tomorrow**
    - Reorganize the Checklist make it shorter and more concise.
    - Get a brief view for other types of No-SQL database.
    - Learn more about Stream API


