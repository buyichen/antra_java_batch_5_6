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


## March 11

- **Content Reviewed Today:**
    - Java 8 new feature (mainly on Stream API)
    - Types of No-SQL database.
- **New Things Learned Today:**
    - **Collection vs Stream**
        - The main difference between a Collection and a Stream is that Collection contains its elements, but a Stream doesn’t. Stream work on a view where elements are actually store by Collection or array, but unlike other views, any changed made on Stream doesn’t reflect the original Collection.
    - **What does it mean by “Stream is lazy”?**
        - It means that most of the methods are defined on Java.util.stream.Stream class is lazy. They will not work by just including them on the Stream pipeline. They only work when we call a terminal method on the Stream and finish as soon as they find the data they are looking for rather than scanning through the whole set of data.
    - **How can we transform Stream to primitive type Stream?**
        - We can use mapToInt, mapToDouble and mapToLong that can be used to transform stream of objects to a stream of primitive types.
        - Example:

            ```java
              
            List<String> list = Arrays.asList("3", "6", "8", 
                                                        "14", "15");
            list.stream().mapToInt(num -> Integer.parseInt(num))
            .filter(num -> num % 3 == 0)
            .forEach(System.out::println);
            ```

    - **What is Parallel Stream in Java Stream API?**
        - We can execute streams in serial or in parallel. When a stream executes in parallel, the Java runtime partitions the stream into multiple sub-streams.
        - Example:

            ```java
            List<IntegerlistOfNumbers = Arrays.asList(1, 2, 3, 4);
            listOfNumbers.parallelStream().forEach(number ->
                System.out.println(number + " " + Thread.currentThread().getName())
            );
            ```

    - **Disadvantage of Stream**
        - Once a Stream is consumed, it can’t be used later.
        - Lambda expressions in Java can only access to the final variables of the enclosing scope.
        - Stream is worse than for loop in terms of heap and CPU usage.
        - More hard to debug.
    - **MongoDB No-SQL Alternatives**
        - **Apache Cassandra**
          Apache Cassandra is a heavyweight MongoDB alternative that’s ideal for enterprises with large datasets.
        - **Redis**
          Like Apache Cassandra, Redis comes with linearly scaling high performance and excellent built-in search capabilities.
        - **OrientDB**
          OrientDB is an excellent choice for modeling data with complex relationships, and, unlike some of the other MongoDB alternatives. Thus, it is a good choice for graph databases.
        - **DynamoDB**
          Amazon DynamoDB is an excellent option for global applications with a ton of users.
        - **CouchDB**
          CouchDB is perfect if you’re handling an enormous amount of loosely structured data.
- **Learning Plan Tomorrow**
    - Keep revising the Checklist
    - Start previewing the topic for the advanced training
        - Web Programming Concept
        - Java Servlet
    - Get Deeper for implementation of HashMap and ConcurrentHashMap by research online.