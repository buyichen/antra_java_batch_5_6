# Short Answer HW

1. **SQL**
SQL is Structured Query Language designed for inserting and modifying in a relational database system.
2. **No-SQL**
A NoSQL database provides a mechanism for storage and retrieval of data that is modeled in means other than the tabular relations used in relational databases.
3. **Relational Database**
Relation database is a transitional way to store data under the row and column format. The key part is the relational which means there are multiple tables can be related together for accessing the data which provide us a more structured way for storing data according to the data’s feature.
4. **Non-Relational Database**
For non-relational database, there is no table. All the data are stored like an object or a model. Under this feature, the NoSQL have the ability to store large amounts of data with a little structure. So, if we want to store a video which could be a very large single file, we are prefer to store it by using a NoSQL database.
5. **Pre-defined Schema**
The Pre-defined Schema is a static schema data have already been provided by the database server. It can be directly used by the user, but cannot be modified. It only can be extended by a static schema.
6. **Dynamic Schema**
Dynamic Schema is a schema that user can modify during the development, it can be a extension of a fixed or predefined schema.
7. **Vertical Scaling**
In vertical scaling, the data lives on a single node and scaling is done through multi-core, e.g. spreading the load between the CPU and RAM resources of the machine.
8. **Horizontal Scaling**
Horizontal scaling means scaling by adding more machines to our pool of resources, whereas vertical scaling refers to scaling by adding more power to an existing machine.
9. **ACID**
ACID stands for Atomicity, Consistency, Isolation, Durability. It is used to ensure that the data transactions are processed reliably in a database system.
**Atomicity**:
Atomicity refers to the transactions that are completely done or failed where transaction refers to a single logical operation of a data. It means if one part of any transaction fails, the entire transaction files and the database state is left unchanged.
**Consistency**:
Consistency ensures that the data must meet all the validation rules. In simple words, you can say that your transaction never leaves the database without completing its state.
**Isolation**:
The main goal of isolation is concurrency control.
**Durability**:
Durability means that if a transaction has been committed, it will occur whatever may come in between such as power loss, crash or any sort of error.
10. **CAP
Consistency**
Every read receives the most recent write or an error.
**Availability**
Every request receives a (non-error) response, without the guarantee that it contains the most recent write.
**Partition tolerance**
The system continues to operate despite an arbitrary number of messages being dropped (or delayed) by the network between nodes.
11. **Hierarchical Data Store**
A hierarchical database is a data model in which data is stored in the form of records and organized into a tree-like structure, or parent-child structure, in which one parent node can have many child nodes connected through links.