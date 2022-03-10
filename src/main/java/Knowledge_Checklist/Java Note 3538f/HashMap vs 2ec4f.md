# HashMap vs HashTable vs ConcurrentHashMap

`ConcurrentHashMap` uses multiple buckets to store data. This avoids read locks and greatly improves performance over a `HashTable`. Both are thread safe, but there are obvious performance wins with `ConcurrentHashMap`.

When you read from a `ConcurrentHashMap` using `get()`, there are no locks, contrary to the `HashTable` for which all operations are simply synchronized. `HashTable` was released in old versions of Java whereas `ConcurrentHashMap` is a java 5+ thing.

`HashMap` is the best thing to use in a single threaded application.