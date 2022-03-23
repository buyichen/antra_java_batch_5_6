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
    
  ## March 14

- **Content Reviewed Today:**
    - **Java Collection**
        - List, Set, Queue, Map
        - Implementations of the Collection: `ArrayList`, `LinkedList`, `HashSet`, `TreeSet`, `PriorityQueue`, `ArrayDeque`, etc.
        - ArrayList vs LinkedList
        - HashTable vs HashMap
        - ConcurrentHashMap vs HashMap
        - TreeMap vs HashMap
        - HashMap’s implementation
    - **Comparator vs Comparable**
- **New Things Learned Todays:**
    - **What is JDBC and How does it work?**  
      JDBC (Java Database Connectivity) is the Java API that manages connecting to a database, issuing queries and commands, and handling result sets obtained from the database.
      JDBC establish a connection with a data source, send queries and update statements to the data source, then process the result. The processes are under JDBC drivers which are client-side adapters that convert requests from Java programs to a protocol that the DBMS can understand.
    - **What are JDBC statements? List all types of JDBC statements and their usage.**  
      There are three types of statements in JDBC, Statement, Prepared Statement Callable Statement.
      **Statement**:  
      A statement object is used to send a simple SQL statement to the database with no parameters. If n rows need to be inserted, then the same statement gets compiled n number of times.
      **PreparedStatement**:  
      The Prepared Statement interface extends the Statement interfaces. It represents a precompiled SQL statement which can be executed multiple times. This accepts parameterized SQL quires and you can pass 0 or more parameters to this query.
      Initially, this statement uses place holders “?” instead of parameters, later on, we can pass arguments to these dynamically using the set methods of the PreparedStatement interface.
      **CallableStatement**:  
      The CallableStatement interface provides methods to execute stored procedures. Since the JDBC API provides a stored procedure SQL escape syntax, we can call stored procedures of all RDBMS in a single standard way. It do provide a better performance due to pre-compilation.
    - **What is Callable Statement in JDBC? Give an example.
      CallableStatement**:  
      The CallableStatement interface provides methods to execute stored procedures. Since the JDBC API provides a stored procedure SQL escape syntax, we can call stored procedures of all RDBMS in a single standard way. It do provide a better performance due to pre-compilation.
      If there is a stored procedures in the database called myProcedure. We can prepare the statement by using: `CallableStatement cstmt = con.prepareCall("{call myProcedure(?, ?, ?)}");`
- **Learning Plan Tomorrow**  
    - Review JVM related topic
    - Keep learning JDBC

### March 15

- **Content Review Today:**
    - **JVM**
        - Class Loader
            - Types of class loader: Bootstrap, Extension, Application
            - Processes of class loader:
                - Loading
                - Linking
                    - Verification
                    - Preparation
                    - Resolution
                - Initialization
        - Runtime Memory/Data Area (5 components):
            - Program Counter Register
            - Stack
            - Heap
            - Method Area
            - Native Method Area
        - Execution Engine:
            - Interpreter
            - JIT Compiler
            - Garbage Collector
        - Java Native Interface
- **New Things Learned Today**
    - **volatile keyword:**
        - Visibility  
          Visibility is mean when multiple threads visit a same variable, if one thread modified that variable, all the other threads can see the changed value of the variable immediately.
          By using volatile keyword, the variable under the volatile will be immediately updated to the main memory once it been modified. Every time before the volatile variable been used, it will always fresh and updated from main memory. Thus, we can use volatile to make sure the visibility during the variable operation in multi-threading environment.
        - Atomicity  
          Atomicity means that an operation cannot be terminate with any reason. The operation must be all done, or not done.
          **Volatile cannot grantee the atomicity.**
        - Instruction Ordering  
          Instruction Ordering means that the order of program execution follow the same order as the code.
          Volatile can forbid the order of instructions be optimized by CPU which can grantee the exactly same expected order of instruction from our code.
        - volatile + CAS(Compare and Swap Two Thread) = thread safe
          Used by java.util.concurrent. CAS grantee the atomicity which the volatile lacked of.
            - [ABA problem](https://www.baeldung.com/cs/aba-concurrency)
- **Learning Plan Tomorrow**
    - Keep Learning the Java Concurrency
    - Review Java keywords

## March 16

- **Content Review Today:**
    - **Java Keywords:**
        - Flow Control
            - default
        - Modifiers
            - abstract
            - transient
            - volatile
            - native
        - Exception Handling
            - assert
            - throw vs throws
        - Class-related keywords
            - package
        - Object related keywords
            - instanceof
- **New Things Learned Today:**
    - Singleton Class and Thread Safe
        - **Lazy Initialization:**

            ```java
            public class SingletonExample1 {
                private SingletonExample1() {}
                private static SingletonExample1 instance = null;
                public static SingletonExample1 getInstance() {
                    if (instance == null) {
                        instance = new SingletonExample1();
                    }
                    return instance;
                }
            }
            ```

          Lazy Initialization’s instantiation is created during the first time it been used. The static method will check whether it has a instantiation or not, then create do the instantiation. However, this way **cannot grantee us the thread safe**. If there are two threads, and they get the singleton object at the same time, it will pass the “if” condition and get two instantiation.

        - **Eager Initialization:**

            ```java
            public class SingletonExample2 {
                private SingletonExample2() {}
                private static SingletonExample2 instance = new SingletonExample2();
                public static SingletonExample2 getInstance() {
                    return instance;
                }
            }
            ```

          In Eager Initialization, we declare the singleton object by using static keyword, thus, the instantiation been put into the heap memory. In this case, it grantee the **visibility** for the multi-threading environment. However, the disadvantage of this approach is the **waste of the memory** since we put the object’s instantiation into the heap.

        - **Eager Initialization with synchronized keyword:**

            ```java
            public class SingletonExample3 {
                private SingletonExample3() {}
                private static SingletonExample3 instance = null;
                public static synchronized SingletonExample3 getInstance() {
                    if (instance == null) {
                        instance = new SingletonExample3();
                    }
                    return instance;
                }
            }
            ```

          This can grantee the thread safe for sure. However, since the method been declared with synchronized keyword, the method can only be called by a single thread for a period of time. Thus, the performance is low with this method due to the limitation of using the CPU.

        - Double Detection Enhancement

            ```java
            public class SingletonExample4 {
                private SingletonExample4() {}
                private static SingletonExample4 instance = null;
                public static SingletonExample4 getInstance() {
                    if (instance == null) {
                        synchronized (SingletonExample4.class) {
                            if (instance == null) {
                                instance = new SingletonExample4();
                            }
                        }
                    }
                    return instance;
                }
            ```

          In this case, we double check the if the instance have already been instantiated by add an inner synchronized lock to the object. However, this method is **not thread safe**. When a thread get into the `instance = new SingletonExample4();` , JVM will allocate memory space for the object, then initialize the object, then set the reference of the instance to the address that allocated. In the multi-threading environment**, JVM and CPU may reorder the instruction for the optimization,** thus, the 3 instruction that we mentioned might be get reordered, thus, it’s not thread safe.

        - **Volatile + Double Detection Enhancement:**

            ```java
            public class SingletonExample5 {
                private SingletonExample5() {}
                private volatile static SingletonExample5 instance = null;
                public static SingletonExample5 getInstance() {
                    if (instance == null) {
                        synchronized (SingletonExample5.class) {
                            if (instance == null) {
                                instance = new SingletonExample5();
                            }
                        }
                    }
                    return instance;
                }
            }
            ```

          Since the last method we mention has the problem with the instruction reorder, we can use the **volatile** keyword to forbid that action, thus, in this method we eliminate the only possible factor make the thread not safe. **Thus, this method is thread safe**.

    - **How synchronized keyword works?**

      When we use a synchronized block, Java internally uses a monitor which every object has one monitor. When a monitor been occupied, it will be in locked status, the thread execute the `monitorenter`instruction to access the monitor as following steps:

        - If the monitor’s enter as 0, which mean unlocked. Then the thread get into the monitor, and see the enter number as 1 which mean locked. Thus, this thread is the owner of the monitor
        - If a thread have already own the monitor, which mean it reenter the monitor, then the entered monitor’s number been plus one.
        - If there are other threads owning the monitor, then the thread become as blocking status, till the enter number of the monitor become to zero. It will retry to own the monitor.

      For exiting an monitor, it need to execute the `monitorexit`instruction. The thread execute the monitorexit must be the owner of the corresponding monitor. By executing this instruction, the enter number of the monitor be subtracted 1, if the enter number become 0 after the subtraction, the thread will exit the monitor and it will not own the monitor. Thus, if there any other threads blocked by the monitor can try to obtain the ownership of the monitor.

- **Learning Plan Tomorrow**
    - Review Java Data Type related topic
    - Review the String related topic
    - Keep reviewing this week’s content:
        - Hibernate
        - Java Reflection Mechanism

## March 17

- **Content Review Today:**
    - **Java Data Type**
        - Primitive Data Type:
            - `int`, `double`, `float`, `long`, `short`, `byte`, `char`, `boolean`
        - Non-primitive Data Type:
            - Wrapper Class
                - `String`, `Integer`, `Byte`, `Character`, `Double`, etc.
        - String Constant Pool
            - == vs equals()
        - String vs StringBuffer vs StringBuilder
    - **Hibernate**
        - ORM (Object Relational Mapping)
        - Advantage of Hibernate
            - Clean Readable Code
            - HQL (Hibernate Query Language)
            - Transaction Management
            - Exception Handling
            - OOP Supporting
        - Important Interfaces
            - Configuration
            - SessionFactory
            - Session
            - Criteria
            - Query
            - Transaction
        - Lazy Loading
        - First/Second Level Cache
        - Hibernate Configuration File
    - **Java Reflection**
        - Class Object
            - Methods of Class Object
        - Usage of Reflection
            - IDE
            - Debugger
            - Test Tools
            - Spring framework
- **New Things Learned Today:**
    - **HTTP Request Methods:**
        - GET
          The GET method requests a representation of the specified resource. Requests using GET should only retrieve data.
        - HEAD
          The HEAD method asks for a response identical to a GET request, but without the response body.
        - POST
          The POST method submits an entity to the specified resource, often causing a change in state or side effects on the server.
        - PUT
          The PUT method replaces all current representations of the target resource with the request payload.
        - DELETE
          The DELELTE method deletes the specified resource.
        - CONNECT
          The CONNECT method establishes a tunnel to the server identified by the target resource.
        - OPTIONS
          The OPTIONS method describes the communication options for the target resource.
        - TRACE
          The TRACE method performs a message loop-back test along the path to the target resource.
        - PATCH
          The PATCH method applies partial modifications to a resources.
    - **POST vs PUT**

      The difference between POST and PUT is that PUT requests are idempotent. Thus, by calling a same PUT request multiple times, it always produce the same result. Whereas, calling a same POST request multiple times will creating affect the resource multiple times.

    - **HTTP Response Status Codes**
        - 1xx: The request was received, continuing process.
            - `100 Continue`
              This interim response indicates that the client should continue the request or ignore the response if the request is already finished.
            - `101 Switching Protocols`
              This code is sent in response to an `Upgrade`
              request header from the client and indicates the protocol the server is switching to.
        - 2xx: success code
            - `200 OK`
              The request succeeded.
            - `204 No Content`
              There is no content to send for this request, but the headers may be useful. The user agent may update its cached headers for this resource with the new ones.
        - 3xx: redirection (clients need to take additional action)
            - `301 Moved Permanently`
              The URL of the requested resource has been changed permanently. The new URL is given in the response.
            - `302 Found`
              This response code means that the URI of requested resource has been changed *temporarily*. Further changes in the URI might be made in the future. Therefore, this same URI should be used by the client in future requests.
        - 4xx: client errors, the request contains bad syntax or cannot be fulfilled.
            - `400 Bad Request`
              The server cannot or will not process the request due to something that is perceived to be a client error.
            - `404 Not Found`
              The server can not find the requested resource.
        - 5xx: service errors, the server failed to fulfill an apparently valid request.
            - `500 Internal Server Error`(for security season, generic error, no details)
              The server has encountered a situation it does not know how to handle.
            - `502 Bad Gateway`
              This error response means that the server, while working as a gateway to get a response needed to handle the request, got an invalid response.
    - **Learning Plan Tomorrow**
        - Learning more about HTTP and TCP/IP
        - Review Java 8 new feature
        - Review Exception in Java

## March 18

- **Content Review Today:**
    - Java 8 New Feature
        - Optional
        - Functional Interface
        - Lambda Expression
        - Relationship between Lambda and Functional Interface
        - Stream API
            - Advantage/Disadvantage
            - When to use?
            - intermediate and terminal operation
    - Exception
        - Checked Exception
        - Unchecked Exception
        - Keywords
            - try-catch
            - throw
            - throws
            - finally
            - Exception Hierarchy
            - Custom Exception
- **New Things Learned Today:**
    - **Java Servlet**
        - **What is Servlet?**

          Servlets are the Java programs that run on the Java-enabled web server or application server. They are used to handle the request obtained from the webserver, process the request, produce the response, then send a response back the the webserver. Servlets work on the server-side which are capable of handling complex requests obtained from the webserver.

        - **What is servlet life cycle?**
            1. The servlet is initialized by calling the init() method.
            2. The servlet calls service() method to process a client’s request.
            3. The servlet is terminated by calling the destroy() method.
            4. Finally, servlet is garbage collected by the garbage collector of the JVM.
        - **How does Java Servlet work?**
            - **Explain how does Java Servlet work?**
                1. When the web server (e.g. Apache Tomcat) starts up, the servlet container deploy and loads all the servlets. During this step Servlet container creates ServletContext object. **ServletContext is an interface that defines the set of methods that a servlet can use to communicate with the servlet container**.
                   Note: **There is only one ServletContext per webapp** which is common to all the servlets. ServletContext has several useful methods such as addListener(), addFilter() etc.
                2. Once the servlet is loaded, the servlet container creates the instance of servlet class. For each instantiated servlet, its **init()** method is invoked.
                3. Client (user browser) sends an Http request to web server on a certain port. Each time the web server receives a request, the servlet container creates **HttpServletRequest** and **HttpServletResponse** objects. The HttpServletRequest object provides the access to the request information and the HttpServletResponse object allows us to format and change the http response before sending it to the client.
                   The servlet container spawns a new thread that calls **service()** method for each client request. **The service() method dispatches the request to the correct handler method based on the type of request**.
                   For example if server receives a Get Request the service() method would dispatch the request to the doGet() method by calling the doGet() method with request parameters. Similarly the requests like Post, Head, Put, etc. are dispatched to the corresponding handlers doPost(), doHead(), doPut() etc. by service() method of servlet.
                4. When servlet container shuts down, it unloads all the servlets and calls destroy() method for each initialized servlets.
    - **HTTP**
        - **What is HTTP Session?**

          HTTP sessions is an industry standard feature that allows Web servers to maintain **user identity** and to **store user-specific data** during multiple request/response interactions between a client application and a Web application. HTTP sessions preserves:

            - Information about the session itself (session identifier, creation time, time last accessed, etc.)
            - Contextual information about the user (client login state, for example, plus whatever else the Web application needs to save)
        - **What is URL and What is URI?**
            - **URI**
              A URI (Uniform Resource Identifier) is a string containing characters that identify a physical or logical resource. URI follows syntax rules to ensure uniformly. Moreover, it also maintains extensibility via a hierarchical naming schema. URL and URN (Uniform Resource Name) are the two ways to achieve URI.
            - **URL**
              A URL (Uniform Resource Locator) is a type of URI which we can identify a physical or logical resource by a series of location.
- **Learning Plan Tomorrow:**
    - Learn more about TCP/IP
    - Learn more about Servlet Application
    - Review Java Generics
    - Review Comparator and Comparable

## March 21

- **Content Review Today:**
    - **Java Generics**
        - Generic Type Parameter: *`T`*
        - Advantage of Generics:
            - Stronger type checks at compile time.
            - Elimination of casts.
            - Enabling programmers to implement generic algorithms.
        - Type Erasure
        - Generic Method vs Generic Type
        - Type Inference
        - Bounded Type Parameter
    - **Comparator**
        - `java.util.Comparator`
        - `compare(Object obj1, Object obj2)`
        - Compare two arbitrary objects
        - multiple sorting sequences
        - does not affect the original class
    - **Comparable**
        - `java.lang.Comparable`
        - `compareTo(Object toCompare)`
        - compare to current object
        - single sorting sequence
        - affects the original class
- **New Things Learned Today:**
    - **HTTP**
        - **HTTP vs HTTPS**

          HTTPS is HTTP with encryption. The only difference between the two protocols is that HTTPS uses TLS (SSL) to encrypt normal HTTP requests and responses. As a result, HTTPS is far more secure than HTTP. A website that uses HTTP has http:// in its URL, while a website that uses HTTPS has https://.

        - **HTTP Session**

          HTTP sessions is an industry standard feature that allows Web servers to maintain user identity and to store user-specific data during multiple request/response interactions between a client application and a Web application. HTTP sessions preserves:

            - Information about the session itself (session identifier, creation time, time last accessed, etc.)
            - Contextual information about the user (client login state, for example, plus whatever else the Web application needs to save)
    - **TCP**
        - **SACK**

          TCP Selective Acknowledgements (SACK) are a refinement of TCP’s traditional “cumulative” acknowledgements. SACKs allow a receiver to acknowledge non-consecutive data, so that the sender can retransmit only what is missing at the receivers end. This is particularly helpful helpful on paths with a large bandwidth-delay product(BDP).
          A Selective Acknowledgment (SACK) mechanism, combined with a selective repeat retransmission policy, can help to overcome these limitations. The receiving TCP sends back SACK packets to the sender informing the sender of data that has been received. The sender can then retransmit only the missing data segments.

    - **Java Servlet**
        - **ServletConfig object**

          A servlet configuration object used by a servlet container to pass information to a servlet during initialization. ServletConfig is for a particular servlet, that means one should store servlet specific information in web.xml and retrieve them using this object.

        - **ServletContext object**

          ServletContext is the object created by Servlet Container to share initial parameters or configuration information to the whole application.

        - **How does servlet communicate with each other?**

          Servlet communication is sending users request, and the response object passed to a servlet to another servlet. We are using the method **getParameter()**, which is basically used to get the input from user value in a specified field. So, when Servlet request the object is passed from one servlet to another servlet, then we will use this method to get the input that the user has given in an HTML/JSP form.

- **Learning Plan Tomorrow:**
    - Review OOP
    - Review IO Stream
    - Learn more about SpringBoot

## March 22

- **Content Review Today:**
    - **OOP**
        - Inheritance
        - Polymorphism
            - Override vs Overload
        - Encapsulation
        - Abstraction
            - Abstract class vs Interface
    - **I/O Stream**
        - Types of I/O streams
            - Byte Stream
            - Character Stream
            - Primitive data Stream
            - Object Stream
        - Buffered Stream
        - Data Stream
- **New Things Learned Today:**
    - Main Features of Spring Boot
        - Starters
        - Auto-configuration
        - Actuator
        - Security
        - Logging
    - **What are the two features in Spring?**
        - IOC (Inversion of Control)

          IOC supports objects to give their dependencies rather than looking for creating dependent objects.

        - AOP (Aspect Oriented Programming)

          The AOP part of Spring supports unified development by ensuring separation of application’s business logic from other system services.

    - **What are the Spring Boot starters?**

      Spring Boot starters are a set of convenient dependency management providers that can be used in the application to enable dependencies. These starters, make development easy and rapid.

- **Learning Plan Tomorrow:**
    - Review SQL database
    - Review Serialization
    - Keep learning about Spring Boot
- **Today’s HW**
    - CI/CD (Continuous Integration/Continuous Delivery)

      A CI/CD pipeline is a series of steps that must be performed in order to deliver a new version of software. It introduces monitoring and automation to improve the process of application development, particular at the integration and testing phases, as well as during delivery and deployment.

    - **Procedures of CI/CD pipeline**
        - Source

          In the source stage, pipeline is triggered by a code repository. Any change in the program triggers a notification to the CI/CD tool that runs an equivalent pipeline. Other common triggers include user-initiated workflows, automated schedules, and the results of other pipelines.

        - Build

          In this stage, we merge the source code and its dependencies which the code should be compiled. Failure to pass the build stage means there is a fundamental project misconfiguration, so it is better for us to know the issue immediately.

        - Test

          Test stage includes the execution of automated tests to validate the correctness of code and the behavior of the software. This stage prevents easily reproducible bugs from reaching the clients.

        - Deploy

          This is the final stage that the product goes live. Once the build has successfully passed through all the required test scenarios, it ready to deploy to live server.

    - **CI/CD Tools**
        - Jenkins
        - GitLab
        - TeamCity
    - **GitHub Actions CI/CD**
        1. Create or choose a repository, and pick a project
        2. Open GitHub Actions in the repository to start building CI/CD workflow.
        3. Make changes to our code to trigger the CI/CD pipeline.
        4. Take a look at the workflow visualizer and live logs to get a full look into how the pipeline is running.

      *Reference: [https://github.blog/2022-02-02-build-ci-cd-pipeline-github-actions-four-steps/](https://github.blog/2022-02-02-build-ci-cd-pipeline-github-actions-four-steps/)*