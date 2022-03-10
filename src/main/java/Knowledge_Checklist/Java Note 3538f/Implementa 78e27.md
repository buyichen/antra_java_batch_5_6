# Implementations of Map

- **HashMap:**
It provides the basic implementation of the Map interface of Java. It stores the data in (Key, Value) pairs, and you can access them by an index of another type (e.g. an Integer). One object is used as a key (index) to another object (value). If you try to insert the duplicate key, it will replace the element of the corresponding key.
    - **LinkedHashMap:**
    The LinkedHashMap Class extends the **HashMap** with an additional feature of maintaining an order of elements inserted into it. HashMap provided the advantage of quick insertion, search, and deletion but it never maintained the track and order of insertion which the LinkedHashMap provides where the elements can be accessed in their insertion order.
- **HashTable:**
The **Hashtable** class implements a hash table in **java.util.Hashtable**, which maps keys to values. Any non-null object can be used as a key or as a value. To successfully store and retrieve objects from a hashtable, the objects used as keys must implement the hashCode method and the equals method.
    - **Features of Hashtable**
        - It is similar to HashMap, but is synchronized.
        - Hashtable stores key/value pair in hash table.
        - In Hashtable we specify an object that is used as a key, and the value we want to associate to that key. The key is then hashed, and the resulting hash code is used as the index at which the value is stored within the table.
        - The initial default capacity of Hashtable class is 11 whereas loadFactor is 0.75.
        - HashMap doesn’t provide any Enumeration, while Hashtable provides not fail-fast Enumeration.