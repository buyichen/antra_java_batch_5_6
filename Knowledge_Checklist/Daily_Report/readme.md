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

## March 23

- **Content Review Today:**
    - SQL database:
        - Normalization/De-normalization
        - Transaction
            - ACID
        - Index
            - Clustered Index
            - Non-Clustered Index
            - B tree
            - B+ tree
        - SQL Data Languages
            - DDL
            - DQL
            - DML
            - DCL
            - DTL
    - Java Serialization:
        - Serialize Object
        - Deserialize Object
        - **transient** keyword
        - ObjectInputStream/ObjectOuputStream
- **New Things Learned Today:**
    - AOP
        - Key Terminology
            - Aspect

              An aspect is a modularization of a concern that cuts across multiple classes. Unified logging can be an example of such cross-cutting concern.

            - Join Point

              A *Joinpoint* is a point during the execution of a program, such as the execution of a method or the handling of an exception. In Spring AOP, a *JoinPoint* always represents a method execution.

            - PointCut

              A *Pointcut* is a predicate that helps match an *Advice* to be applied by an *Aspect* at a particular *JoinPoint*.

              We often associate the *Advice* with a *Pointcut* expression, and it runs at any *Joinpoint* matched by the *Pointcut*.

            - Advice

              An *Advice* is an action taken by an aspect at a particular *Joinpoint*. Different types of advice include *“around,” “before,”* and *“after.”* In Spring, an *Advice* is modelled as an interceptor, maintaining a chain of interceptors around the *Joinpoint*.

        - **Transaction**  
          The Spring Framework's declarative transaction management is made possible with Spring aspect-oriented programming (AOP), although, as the transactional aspects code comes with the Spring Framework distribution and may be used in a boilerplate fashion, AOP concepts do not generally have to be understood to make effective use of this code.

          In Spring, we can use @Transactional to approach as the example showing in the official document : [https://docs.spring.io/spring-framework/docs/3.0.0.M4/reference/html/ch10s05.html](https://docs.spring.io/spring-framework/docs/3.0.0.M4/reference/html/ch10s05.html)

- **Learning Plan Tomorrow:**
    - Review No-SQL database
    - Keep learning Spring Boot related Topic
    - Review Java Collections

## March 24

- **Content Review Today:**
    - **No-SQL database**
        - Categories of No-SQL database
            - Document Data Store
            - Key-value pair Store
            - Column Family Store
            - Graph Data Store
        - CAP
            - Consistency
            - Availability
            - Partition tolerance
        - Sharding and Replica
        - MongoDB
        - Redis
    - **Java Collection**
        - List
            - ArrayList
            - LinkedList
            - Vector
            - Stack
        - Set
            - HashSet
            - LinkedHashSet
            - TreeSet
        - Queue
            - Deque
                - ArrayDeque
            - LinkedList
            - PriorityBlockingQueue
        - Map
            - HashMap
                - Hash Collision
                - equals() and hashCode()
            - ConcurrentHashMap
                - ConcurrentHashMap vs SynchronizedMap
            - HashTable
            - LinkedHashMap
            - TreeMap
- **New Things Learned Today:**
    - **MVC**
        - **What is MVC?**

          **MVC** Pattern stands for Model-View-Controller Pattern. This pattern is used to separate application’s concerns.

            - **Model** represents an object or JAVA POJO(Plain Old Java Object) carrying data. It can also have logic to update controller if its data changes.
            - **View** represents the visualization of the data that model contains.
            - **Controller** acts on both model and view. It controls the data flow into model object and updates the view whenever data changes. It keeps view and model separate.
    - **Spring MVC**

      A Spring MVC is a Java framework which is used to build web applications. It follows the Model-View-Controller design pattern. It implements all the basic features of a core spring framework like Inversion of Control, Dependency Injection. A Spring MVC provides an elegant solution to use MVC in spring framework by the help of **DispatcherServlet**. Here, **DispatcherServlet** is a class that receives the incoming request and maps it to the right resource such as controllers, models, and views.

        - **Spring Web Model-View-Controller**
            - **Model** - A model contains the data of the application. A data can be a single object or a collection of objects.
            - **Controller** - A controller contains the business logic of an application. Here, the @Controller annotation is used to mark the class as the controller.
            - **View** - A view represents the provided information in a particular format. Generally, JSP+JSTL is used to create a view page. Although spring also supports other view technologies such as Apache Velocity, Thymeleaf and FreeMarker.
            - **Front Controller** - In Spring Web MVC, the DispatcherServlet class works as the front controller. It is responsible to manage the flow of the Spring MVC application.
        - **Spring MVC workflow**
            - All the incoming request is intercepted by the DispatcherServlet that works as the front controller.
            - The DispatcherServlet gets an entry of handler mapping from the XML file and forwards the request to the controller.
            - The controller returns an object of ModelAndView.
            - The DispatcherServlet checks the entry of view resolver in the XML file and invokes the specified view component.
        - **Advantages of Spring MVC**
            - Separate roles
            - Light-weight
            - Powerful Configuration
            - Rapid development
            - Reusable business code
            - Easy to test
            - Flexible Mapping
- **Learning Plan Tomorrow:**
    - Java Exception Handling
    - Concurrency in Database
    - Keep learning Spring

## March 25

- **Content Review Today:**
    - **Java Exception Handling**
        - Types of Exception
            - Checked Exception
                - I/O Exception
                - CompiletimeException
            - Unchecked Exception
                - RuntimeException
            - How to handle Exception
                - try/catch
                - finally
            - Overriding method handle exceptions
            - Custom Exception
            - Throw vs Throws
            - Exception vs Error
    - **Database Concurrency Control**
        - Dirty Data
        - Non-repeated Read
        - Phantom Read
        - Isolation Level
        - Lock
            - Type of Locks
                - Shared
                - Update
                - Exclusive
                - Schema (modification and stability)
                - Bulk Update
                - Intent (shared, update, exclusive)
                - Key Range (shared, insert, exclusive)
            - Lock Escalation
            - Dead Lock
            - Optimistic Lock
            - Pessimistic Lock
- **New Things Learned Today:**
    - **Swagger**

      Swagger is used in sharing documentation in the products, managers, testers and developers and also is used by vatious tools in automating API Related processes.It is also used in developing APIs through OpenAPI Specification(OAS), also consists of open source and professional tools.

        - Features provided by Swagger
            - **Swagger Editor** used in writing OpenAPI Specs.
            - **Swagger UI** helps in rendering OpenAPI Specs as an Interactive API Documentation.
            - **Swagger Codegen** used in generating sever stubs and libraries from OpenAPI Spec.
        - API Testing

          API Testing helps in analyzing Application Program Interface in verifying its functionality, security, performance and reliability. It is performed by requesting it to one or more API Endpoints and also in comparing the response with the results. API Testing performs with critical layers such as Business, and in business logic processing it is carried out and all Transactions through the User Interface and Database Layers.

            - Benefits of API Testing
                - Language Independent - used in language automation and also in structuring data, and making the verification and stable.
                - GUI Independent - used in performing the app prior to GUI Testing and also can gives feedback and better team productivity.
                - Improved Test Coverage - used in creating and allowing automated tests with high coverage.
                - Faster Release - used in executing API Testing and testing, allowing the software development and releasing products faster.
            - Type of API Testing
                - Unit Testing
                - Functional Testing
                - Load Testing
                - Error Detection
                - Security Testing
                - UI Testing
                - Penetration Testing
                - Fuzz Testing
- **Learning Plan Tomorrow:**
    - Review Java Concurrency
    - Review JDBC
    - Review Spring

## March 28

- **Content Review Today:**
    - **Multi-Threading**
        - Process
        - Thread
            - Thread Life Cycle
                - New State
                - Runnable State
                - Running State
                - Blocked State
                - Dead State
            - Thread Creation
                - Extending Thread Class
                - Implementing Runnable Interface
                - Implementing Callable Interface
                - Thread Pool
                    - corePoolSize
                    - maximumPoolSize
                    - KeepAliveTime
                    - Time unit
                    - work queue
                    - thread factory
                    - handler
                        - abortPolicy
                        - callerRunPolicy
                        - discardPolicy
                        - discardOldestPolicy
        - Synchronization
            - Ways to perform Thread Synchronization
                - Synchronized Method
                - Synchronized Block
                - Static Synchronization
            - Lock
                - Dead Lock
                - Lock Reentrance
                - Lock Interface
    - JDBC
        - Steps to connect to database via JDBC
        - Types of JDBC statements
            - Statement
            - PreparedStatement
            - CallableStatement
        - Transaction Management
            - auto-commit
    - Spring
        - AOP + IOC
        - Bean Scope
            - single
            - prototype
            - request
            - session
            - global session
        - Important Annotations
            - @Autowired
            - @Resource
            - @Component
            - @Scope(”singleton/prototype”)
            - @Configuration
            - @ComponentScan(”package”)
            - @Bean
        - Spring MVC
        - Spring Boot
            - auto config
            - starter
            - tomcat
            - annotation based
        - Restful API
            - @RestController
            - @Controller
            - @Service
            - @Repository
            - @GetMapping
            - @PostMapping
            - @PutMapping
            - @DeleleMapping
            - @RequestMapping
            - @PatchMapping
            - @PathVariable
            - @RequestParam
            - @RequestBody
            - @ResponseBody
        - Lombok
            - @Data
            - @AllArgsConstructor
            - @NoArgsConstructor
        - Exception
            - @ExceptionHandler
            - @ControllerAdvice
            - @ResponseStatus
        - Validation
            - @NotNull
            - @NotEmpty
            - @NotBlank
            - @Min
            - @Max
            - @Pattern
            - @Email
- **New Things Learned Today:**
    - JAR vs WAR
        - JAR stands for Java Archive. JAR is zipped file containing the compressed versions of .class files and resources of compiled Java libraries and application which mean its for pure Java application.
        - WAR stands for Web Application Resource. These archive files have the .war extension and are used to package web applications that we can deploy on any Servlet/JSP container.
    - Lock vs Synchronized
        - Lock is an interface whereas Synchronized is a keyword.
        - Synchronized releases the lock automatically, and Lock must release the lock manually.
        - Lock can interrupt the response of the thread waiting for the lock, but Synchronized will not, and the thread will wait all the time.
        - Lock lets you know if a thread has a lock, but Synchronized can’t.
        - Lock can improve the efficiency of multiple threads.
        - Synchronized locks classes, methods, and code blocks, while lock is block-wide.
- **Learning Plan Tomorrow:**
    - Review the Interview Questions that provided today.
    - Review Spring Annotation
    - Review Java 8 new features

## March 29

- **Content Review Today:**
    - **Spring Annotations**
        - Spring Core
            - @Configuration
            - @ComponentScan
            - @Import
            - @Component
            - @Service
            - @Autowired
            - @Bean
            - @Lookup
            - @Primary
            - @Required
            - @Value
            - @DependsOn
            - @Lazy
            - @Scope
            - @Profile
        - Spring Boot
            - @SpringBootApplication
            - @Configuration
            - @ComponentScan
            - @EnableAutoConfiguration
        - Spring MVC
            - @Service
            - @Repository
            - @Controller
            - @RequestBody
            - @ResponseBody
            - @RestController
            - @RequestMapping(method=RequestMethod.GET, value=”/path”)
            - @RequestParam(value=”name”, defaultValue=”World”)
            - @PathVariable(”placeholderName”)
            - @ExceptionHandler
            - @CrossOrigin
    - **Java 8 new features**
        - Functional Interface
            - Build-in Functional Intefaces
                - Comparator
                - Runnable
                - Predicate
                - Function
        - Lambda
            - Lambda Scopes
        - Stream
            - Intermediate Operation
                - Filter
                - Sorted
                - Map
            - Terminate Operation
                - Match
                - Count
                - Reduce
            - Parallel Streams
                - Parallel Sort
            - Sequential Streams
                - Sequential Sort
        - Optional
            - Prevent NullPointerException
- **New Things Learned Today:**
    - **Authentication**
        - The proof for system to verify your identity (username/userID + password)
    - **Encryption**
        - Symmetric (Data Encryption)

          Symmetric encryption is a type of encryption where only one key (a secret key) is used to both encrypt and decrypt electronic information. The entities communicating via symmetric encryption must exchange the key so that it can be used in the decryption process.

          e.g. 123 → key1 → %^^* → key1 → 123

        - Asymmetric (Signature Encryption)
            - Public Key

              For encryption.

            - Private key

              For decryption, it is intended to be private so that only the authenticated recipient can decrypt the message.

            - Keys Generation

              At the heart of **Asymmetric Encryption** lies a cryptographic algorithm. This algorithm uses a key generation protocol (a kind of mathematical function) to generate a key pair. Both the keys are mathematically connected with each other. This relationship between the keys differs from one algorithm to another.

              The algorithm is basically a combination of two functions – **encryption function and decryption function**. To state the obvious, the encryption function encrypts the data and decryption function decrypts it.


            e.g. Server (public key of user) “hello” ← SSH (private)
            
    - **Hashing**
        
        Hashing is a cryptographic process that can be used to validate the authenticity and integrity of various types of input. It is widely used in authentication systems to avoid storing plaintext passwords in databases, but is also used to validate files, documents and other types of data.
        
        - Hashing in Authentication
            
            In authentication systems, when users create a new account and input their chosen password, the application code passes that password through a hashing function and stores the result in the database. When the user wants to authenticate later, the process is repeated and the result is compared to the value from the database. If it's a match, the user provided the right password.
            
        - Hashing Algorithms
            - SHA-1
            - SHA-2 (Family of Hashing)
            - MD5
    - **Encoding**
        - URL Encoding
        - File Encoding
        - Unicode Encoding
        - ASCII Encoding
    - **HTTPS**
        - HTTP + SSL (Secure Socket Layer) / TLS (Transport Layer Security)
            
            HTTPS establishes the communication between the browser and the webserver. It uses the **Secure Socket Layer** (SSL) and **Transport Layer Security** (TLS) protocol for establishing communication. The new version of SSL is TSL.
            
        - TCP Handshake
        - TLS Handshake
    - **Token**
        - JWT
            - Header: Algorithm & Token Type
            - Payload: Data
            - Verify Signature
    - **OAuth2**
        - OAuth Roles
            - Resource Owner:
                
                The resource owner is the *user* who authorizes an *application* to access their account. The application’s access to the user’s account is limited to the scope of the authorization granted (e.g. read or write access)
                
            - Client:
                
                The client is the *application* that wants to access the *user*’s account. Before it may do so, it must be authorized by the user, and the authorization must be validated by the API.
                
            - Resource Server:
                
                The resource server hosts the protected user accounts.
                
            - Authorization Server:
                
                The authorization server verifies the identity of the *user* then issues access tokens to the *application*.
                
        - Abstract Protocol Flow
            1. The *application* requests authorization to access service resources from the *user*
            2. If the *user* authorized the request, the *application* receives an authorization grant
            3. The *application* requests an access token from the *authorization server* (API) by presenting authentication of its own identity, and the authorization grant
            4. If the application identity is authenticated and the authorization grant is valid, the *authorization server* (API) issues an access token to the application. Authorization is complete.
            5. The *application* requests the resource from the *resource server* (API) and presents the access token for authentication.
            6. If the access token is valid, the *resource server* (API) serves the resource to the *application.*
    - **CORS**
        - RESTful + SPA (angular react)
    - **SSO (single sign on)**
        - login once, login everything
    - **Lightweight Directory Access Protocol (LDAP)**
        - Active Directory (AD)
            - Directory DB
- **Learning Plan Tomorrow:**
    - Review Java Keywords
    - Review Interview Questions

## March 30

- **Content Review Today:**
    - **Java Keywords**
        - Primitive Type Keywords
            - `boolean`, `byte`, `char`, `short`, `int`, `long`, `float`, `double`
        - Control Flow
            - `if`, `else if`, `else`
            - `do`, `while`, `for`
            - `switch`, `case`
            - `continue`, `break`
            - `return`
            - `default`
        - Access Modifier
            - `private`, `protected`, `public`
        - Class, Method, Variable Modifier
            - `abstract`, `class`, `extends`, `final`, `implements`, `interface`, `native`, `new`, `static`, `strictfp`, `synchronized`, `transient`, `volatile`
        - Exception Handling
            - `assert`, `try`, `catch`, `throw`, `throws`, `finally`
        - Enumeration
            - `enum`
        - Object Keywords
            - `new`, `instanceof`, `super`, `this`
    - **Hibernate**
        - ORM (Object Relational Mapping)

          ORM is a programming technique for converting data between relational databases and OOP languages such as Java.

            - ORM Tools
                - Hibernate
                - Sequelize
                - MyBatis
                - Doctrine 2
                - SQLAlchemy
            - Advantages of ORM
                - ORM allows a programmer to interact with a relational database without knowing very well about SQL.
                - ORM allows a developer to use the language of their choice.
                - ORM provides the flexibility of switching different types of databases to developer. By adding a layer of abstraction, a developer doesn’t have to remember everything regarding the different between the different SQL languages. Instead, they can focus exclusively on using ORM and it handles low-level database interaction.
                - ORM offer better performance than standard SQL, especially when a developer not knowing the SQL a lot.
                - Transaction management and automatic key generation.
                - Fast development of application.
            - Disadvantages of ORM
                - Potential vendor lock-in. Since ORM is often provided through a library, framework, or API, there’s always the chance a developer may become too dependent on ORM to move to other choices.
                - Another potential disadvantage of using ORM is the abstraction which make it easy to use. However, in some scenario developer needs to know exactly what happening under the abstraction in the low-level perspective. Thus, it will make the troubleshooting more difficult.
        - JPA (Java Persistence API)

          JPA is a **specification** of Java. It is used to persist data between Java object and relational database. JPA acts a bridge between object-oriented domain models and relational database systems.

          As JPA is just a specification, it doesn’t perform any operation by itself. It requires an implementation. So, ORM tools like **Hibernate** implements JPA specification for data persistence.

        - Hibernate Architecture

          The Hibernate architecture consists many objects such as a persistent object, session factory, session, query, transaction, etc. Applications developed using Hibernate is mainly categorized into 4 parts:

            - Java Application
            - Hibernate Framework
                - Configuration File
                - Mapping File
                - Core Objects of Hibernate Framework:
                    - SessionFactory:

                      This provides a factory method to get session objects and clients of ConnectionProvider. It holds a second-level cache (optional) of data.

                    - Session:

                      This is a short-lived object that acts as an interface between the Java application objects and database data.

                        - The session can be used to generate transaction, query, and criteria objects.
                        - It also has a mandatory first-level cache of data.
                    - Transaction:

                      This object specifies the atomic unit of work and has methods useful for transaction management. This is optional.

                    - ConnectionProvider:

                      This is a factory of JDBC connection objects and it provides an abstraction to the abstraction to the application from the DriverManager. This is optional.

                    - TransactionFactory:

                      This is a factory of Transaction objects. It is optional.

            - Internal API
                - JDBC
                - JTA (Java Transaction API)
                - JNDI (Java Naming Directory Interface)
            - Database
                - MySQL, PostgreSQL, etc.
        - Fetch Type
            - Eager Loading
            - Lazy Loading
        - Mapping
            - One to One
            - One to Many
            - Many to One
            - Many to Many
        - Cascade
            - persist
            - merge
            - refresh
            - remove detach
            - all
        - Cache
            - first level cache: session level (open by default)
            - second level cache: session factory level (close by default)
- **New Things Learned Today:**
    - REST API Consumer
        - Feign Client
        - RestTemplate
    - 3-tier Architecture
        - Web Layer
            - Communication with clients using network protocols like HTTP, websocket
            - Input Validation
            - Exception Handling
            - Authorization, access control
        - Service Layer
            - Business Logic
            - Transaction Management
        - Data Layer
            - Data Access, CRUD operations to DB
    - Monolithic Architecture

      Everything in one package. Deploy once and all functions are up. All components are bound together.

    - Distributed Systems
        - SOA (Service-Oriented Archiecture)

          Focusing on interaction and integration between independent services, usually using a service bus, SOAP or messaging system.

            - ESB (Enterprise Service Bus)
                - In SOA, an ESB acts as a center control of the communication and integration between the services.
                - Popular product like MuleSoft ESB, Anypoint ESB
        - Microservice Architecture

          This is an architectural development style that allows building applications as a collection of small autonomous services developed for a business domain. It is a variant of structural style architecture that helps arrange applications as a loosely coupled service collection. The Microservice contains fine-grained services and lightweight protocol.

            - Service Discovery
                - Spring Cloud Netflix Eureka
                - Act like a registry to record all the addresses of each service
            - Communication
                - HTTP
                - RestTemplate class
                - OpenFeign Client
                - Netflix Ribbon is used with Eureka to implement Client-side load balancing.
- **Learning Plan Tomorrow:**
    - Review Java Web
    - Review Spring

## March 31

### Content Review Today

- **Java Web**
    - OSI Model
        - 7 Layers
            - Application Layer
            - Presentation Layer
            - Session Layer
            - Transport Layer
            - Network Layer
            - Data Link Layer
            - Physical Layer
    - TCP/IP
        - TCP 3-way handshaking
        - TCP 4-way handshaking
    - UDP
    - HTTP
        - HTTP Request Method
            - GET
            - POST
            - PUT
            - DELETE
            - PATCH
        - HTTP Response
            - HTTP Status Code
                - 1xx information
                - 2xx success
                - 3xx redirection
                - 4xx client error
                - 5xx server error
        - Session
        - Cookie
    - Servlet
        - Servlet Life Cycle

### New Things Learned Today

- Microservice
    - Log Tracing
        - Spring Cloud Sleuth is a framework to add the traceId and spanId into the HTTP Request Header, as well as the logs.
        - Zipkin server is used for aggregation of the logs with traceId and spanId.
    - Config Server
        - Spring Config Server can be used for centralizing all the configuration files for each service, also for every environment(dev, test, staging, UAT, prod).
    - Fault Tolerance
        - Resilience4j is the recommended framework.
        - Netflix Hystrix (Not used anymore)
        - Resilience4j provides: circuit breaker, retry, ratelimiter, cache, bulkhead.
    - API Gateway

      The API Gateway is a server. It is a single entry point into a system. API Gateway encapsulates the internal system architecture. It provides an API that is tailored to each client. It also has other responsibilities such as authentication, monitoring, load balancing, caching, request shaping and management, and static response handling.

      API Gateway is also responsible for request routing, composition, and protocol translation. All the requests made by the client go through the API Gateway. After that, the API Gateway routes requests to the appropriate microservice.

- Apache Jmeter

  Tool for pressure test by create high amount of requests.


### Learning Plan Tomorrow

- Review Spring
- Review Web Services

## April 1

### Content Review Today

- Web Service
    - REST
        - Producer
        - Consumer
        - Verbs
        - URI
        - Payload
        - Header
        - Security
        - Document
        - Test
    - SOAP
        - XML
        - WSDL
    - Spring Web MVC
        - Annotations
- Spring
    - IOC/DI
        - Container
        - Factory
        - Context
        - Loose Coupling
    - AOP
        - Aspect
        - Advice
        - PointCut
        - JoinPoint
    - Spring Boot
        - Auto-Configuration
        - Embedded Server
        - Self-Executable Jar
        - Starter
        - Actuator

### New Things Learned Today

- Cloud/AWS
    - IASS

      Infrastructure as a service

    - PAAS

      Platform as a service

    - SAAS

      Software as a service

    - AWS

      AWS is a platform to provide secure cloud services, database storage, offerings to compute power, content delivery, and other services to help business level and develop.

        - EC2

          It provides user servers with CPU, memory, disk, network and OS.

        - S3

          File storage using bucket and key to indicate the id. Fast and lots of space.

        - SQS

          Message Queue. Very simple one.

        - SNS

          Notification service, can send SMS, Email, SQS, HTTP etc.

            - Maximum size of an S3 Bucket

              The maximum size of an S3 bucket is 5 TB.

        - Lambda

          It hosts functions which could be triggered by other services. It is serverless. Could be used for small tasks which don’t need a dedicated server.

        - RDS

          RMDBS hosts, like Oracle, MySQL, PostgreSQL, etc.

        - ECS

          Orchestration and management of Docker containers.

        - What are containers?

          Containers provide a standard way to package your application’s code, configurations, and dependencies into a single object. Containers share an operating system installed on the server and run as resource-isolated processes, ensuring quick, reliable, and consistent deployments, regardless of environment.


### Learning Plan Tomorrow

- Review Application Architectures
- Learn more about AWS

## April 5

### Content Review Today

- **Application Architectures**
    - MVC Pattern
        - Model
        - View
        - Controller
    - Frontend-backend Separation
        - Frontend Technologies
            - Angular
            - React
            - Vue.js
            - Jquery
        - Ajax
        - Communication
            - HTTP
            - WebSocket
    - 3-tier Architecture
        - Web Layer
        - Service Layer
        - Data Layer
    - Monolithic
    - SOA (Service-Oriented Architecture)
        - ESB
    - Microservices
        - Service Discovery
        - Communication
        - Log Tracing
        - Config Server
        - Fault Tolerance
- Learn more about AWS
    - Main features of AWS
        - Data Management and Data Transfer
        - Compute & Networking
        - Storage
        - Automation and Orchestration
        - Operations and Management
        - Visualization
        - Security and Compliance
    - Main components of AWS
        - Route 53
        - Simple Storage Service (S3)
            - What is S3?

              S3 is referred to as Simple Storage Service. It is used to store and retrieve data of any amount at any time from anywhere in the world using the web. To use this service the payment model developed is “Pay As You Go”.

            - Can we send a request to Amazon S3?

              Yes, we can send a request to Amazon S3 by using the REST API or the AWS SDK wrapper libraries which wrap the underlying Amazon S3 REST API.

            - What are the main difference between EC2 and S3?


                | EC2 | S3 |
                | --- | --- |
                | A cloud web service | A data storage system |
                | Used for hosting the web application | Used for storing data |
                | Works as a huge computer machine | It is a REST interface |
                | It can either run LINUX or Windows and could also handle PHP, Python, Apache and various other kinds of databases | It applies secure authentication keys such as HMAC-SHA1 |
        - Simple E-mail Service (SES)
        - Identify and Access Management (IAM)
        - Elastic Compute Cloud (EC2)
            - Main features of EC2
                - **Elastic Compute Cloud (EC2)** provides virtual computing environments in the form of a virtual server known as instances, requested in the form of a web server for computing in AWS public cloud.
                - EC2 allows pre-configured templates, Amazon Machine Images (AMIs) for instances, that allow package information needed like operating system and additional software for configuring your cloud server.
                - Various instance types like CPU, memory, storage, and networking capabilities can be configured with EC2.
                - EC2 offers secured login information in key pair form, where AWS stores public key as an identity for customers, whereas customers will save the private key for securely logging in the AWS cloud server.
                - Instance store volumes for temporary data, which gets deleted when an instance is stopped or terminated.
                - Persistent storage volume for our data for storage and computing purpose using Elastic Block Store by Amazon known as Amazon EBS volume.
                - Regions and Availability zones give multiple physical locations for resources such as instances and Amazon EBS volumes.
                - Protocols, ports, and source IP ranges to reach the instances can be configured in the form of a firewall.
                - Elastic IP addresses are static IPv4 addresses for dynamic cloud computing.
                - Metadata can be created and assigned to Amazon EC2 resources.
                - **Virtual Private Clouds (VPCs)** are virtual networks isolated from the rest of the AWS cloud and can be connected to our private network if needed.
        - Elastic Block Store (EBS)
        - CloudWatch
    - Types of AWS cloud products
        - Computing
            
            Auto-scaling, EC2, Lightsat, Elastic Beanstalk, Lambda
            
            - Types of Computing
                - IaaS (Infrastructure as Service)
                - PaaS (Platform as Service)
                - SaaS (Software as a Service)
            - Benefit of clouding computing
                - Scalability
                - Reliability
                - Security
                - Cost Efficiency
        - Storage
            
            S3, Elastic File System, Elastic Block Storage, Glacier
            
        - Networking
            
            VPC, Route53, Amazon CloudFront


### New Things Learned Today

- **Working Environment**

  Local Environment → Git, Bitbucket, GitLab → CI/CD (configure maven, gradle, aws) → {

  Dev with its own db ← QA/BA

  Test/Integration with its own db → 3rd clients

  UAT (User Acceptance Test Staging) with its own db

  Production Env (Releasing) (Database → Integration’s Database as mocking) ← Users

  }

- **Roles in the production team**
    - Manager (Quantity: 1)
    - Product Owner (1)
    - Scrum Master (1) (The above two roles could be taken by a same person)
    - Team Lead  / Architect (1)
    - Developers (5)
    - QA / SDET (1)
    - BA (1 - 2)
    - DBA (1)
    - Devops (1) (A BA, DBA, or Devops may work for different groups)

### Learning Plan Tomorrow

- Review ORM
- Review Java OOP
- Learn Spring Boot