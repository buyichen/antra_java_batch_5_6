### HQL

- **What is HQL?**  
  Hibernate Query Language (HQL) is an object-oriented query language, similar to SQL, but instead of operating on tables and columns, HQL works with persistent objects and their properties. HQL queries are translated by Hibernate into conventional SQL queries, which in turns perform action on database.
- **HQL clauses:**  
    - SELECT Statement

        ```java
        String hql = "SELECT E.firstName FROM Employee E";
        Query query = session.createQuery(hql);
        List results = query.list();
        ```

    - UPDATE Statement

        ```java
        Query query=session.createQuery("update Employee set age=:age where name=:name");
        query.setInteger("age", 32);
        query.setString("name", "Lokesh Gupta");
        int modifications=query.executeUpdate();
        ```

    - INSERT Statement

        ```java
        Query query=session.createQuery("insert into purged_accounts(id, code, status) "+
            "select id, code, status from account where accStatus=:status");
        query.setString("accStatus", "PURGED");
        int rowsCopied=query.executeUpdate();
        ```

    - DELETE Statement

        ```java
        Query query=session.createQuery("delete from Account where acctStatus=:status");
        query.setString("acctStatus", "PURGED");
        int rowsDeleted=query.executeUpdate();
        ```


### Criteria Query

- **What is Criteria Query?**  
  Criteria Query enables us to write queries without doing raw SQL as well as gives us some object-oriented control over the queries, which is one of the main features of Hibernate. The Criteria API allows us to build up a criteria query object programmatically, where we can apply different kinds of filtration rules and logical conditions.
  The Hibernate **Session** interface provides **createCriteria()** method, which can be used to create a **Criteria** object that returns instances of the persistence object's class when your application executes a criteria query.
- Examples:

    ```java
    // Simplest one
    Criteria cr = session.createCriteria(Employee.class);
    List results = cr.list();
    
    //Add Restriction
    cr.add(Restrictions.eq("salary", 2000)); // find record which salary is 2000
    cr.add(Restrictions.gt("salary", 2000)); // more than 2000
    cr.add(Restrictions.like("firstName", "zara%")); // firstname start with "zara"
    
    //Sort the records
    cr.addOrder(Order.desc("salary")); //To sort records by decending order
    
    //Aggregations
    cr.setProjection(Projections.avg("salary")); // Get average of the salary column
    ```


### Native SQL

- **What is Native SQL in Hibernate?**  
  Hibernate support native SQL by providing SQLQuery interface, we can obtain it by calling **Session.createSQLQuery()**.

  Example:

    ```java
    String sql = "SELECT * FROM EMPLOYEE";
    SQLQuery query = session.createSQLQuery(sql);
    query.addEntity(Employee.class);
    List results = query.list();
    ```


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