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