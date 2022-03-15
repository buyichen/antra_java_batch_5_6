### **Statement vs PreparedStatement vs CallableStatement**

- **Statement**:
  
  A statement object is used to send a simple SQL statement to the database with no parameters. If n rows need to be inserted, then the same statement gets compiled n number of times.
- **PreparedStatement**:
  
  The Prepared Statement interface extends the Statement interfaces. It represents a precompiled SQL statement which can be executed multiple times. This accepts parameterized SQL quires and you can pass 0 or more parameters to this query.
  Initially, this statement uses place holders “?” instead of parameters, later on, we can pass arguments to these dynamically using the set methods of the PreparedStatement interface.
- **CallableStatement**:
  
  The CallableStatement interface provides methods to execute stored procedures. Since the JDBC API provides a stored procedure SQL escape syntax, we can call stored procedures of all RDBMS in a single standard way. It do provide a better performance due to pre-compilation.