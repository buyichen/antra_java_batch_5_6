# Short Answer HW

1. **Memcached vs Redis**
    - What is Memcached?
    Memcached is a Free and open source, high-performance, distributed memory object caching system. Memcached is an open source way to store key value pairs in memory, meaning that data is very quickly retrieved. This makes Memcached another way to return data where speed is a factor. Memcached is multithreaded, meaning that there may be some performance improvements where our application can utilize multiple cores.
    - What is Redis?
    Redis is an open source, in-memory data structure store, used as a database, cache, and message broker. Redis is a way to store key-value pairs, in a selection of different data types such as Lists, Sets, and Hashes. Redis keeps this data in memory, meaning that it is extremely fast to return the data when requested. This speed makes it perfect as a cache for our application where we need to request and return data and speed is an important factor.
    - What are the commons between them?
        - Store data in memory for fast retrieval, making them perfect targets for caching.
        - Are a NoSQL data store, keeping data as key value pairs.
        - Are both open source, with plenty of documentation to help get set up.
    - What are the difference between them?
        - Data Types:
        When storing data, Redis stores data as specific data types, whereas Memcached only stores data as strings. Because of this, Redis can change data in place without having to re-upload the entire data value. This reduces network overhead.
            - Data Types that Redis can handle:
                - String
                - List
                - Hash
                - Set
                - Sorted Set
        - Persistence:
        Redis allows for persistence to disk, meaning that the data in Redis’ database can be stored and recovered in the event of the Redis server crashing or being rebooted. Whilst memory is fantastic for speed, it does have the caveat that if the server goes down, the data on the memory is lost. Redis’ persistence is not 100% data safe depending on the type of persistence used there many be between a few seconds and several minutes of changed data, but the persistence is better than none at all.
        Memcached does not have the ability to persist to disk natively. Instaclstr enables persistence as default, ensuring that even a new luster can recover from an outage, with nodes restarting with a “warm cached”.
2. **AWS: Elastic Cache**
Amazon ElastiCache is a fully managed, in-memory caching service supporting flexible, real-time use cases. We can use ElastiCache for caching, which accelerates application and database performance, or as a primary data store for use cases that don’t require durability like session stores, gaming leaderboards, streaming, and analytics. ElastiCache is compatible with Redis and Memcached.
    
    **Use cases:**
    
    - **Accelerate application performance**
    Access data with microsecond latency and high throughout for lightning-fast application performance.
    - **Ease backend database load**
    Cache the data to reduce pressure on the backend database, enabling higher application scalability and reducing operational burden.
    - **Build low-latency data stores**
    Use ElastiCache to store non-durable datasets in memory and support real-time applications with microsecond latency.