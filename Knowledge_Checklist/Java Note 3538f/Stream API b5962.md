# Stream API

- **intermediate operation:** return a stream as result
    - **map():**
    To convert elements of a *Stream* by applying a special function to them and to collect these new elements into a *Stream*, we can use the *map()* method:
        
        ```java
        List<String> uris = new ArrayList<>();
        uris.add("C:\\My.txt");
        Stream<Path> stream = uris.stream().map(uri -> Paths.get(uri));
        ```
        
        This code converts *Stream<String>*to the *Stream<Path>* by applying a specific lambda expression to every element of the initial *Stream*.
        
    - **flatmap():**
    If we have a stream where every element contains its own sequence of elements and you want to create a stream of these inner elements, you should use the *flatMap()* method:
        
        ```java
        List<Detail> details = new ArrayList<>();
        details.add(new Detail());
        Stream<String> stream
          = details.stream().flatMap(detail -> detail.getParts().stream());
        ```
        
        In this example, we have a list of elements of type *Detail*. The *Detail* class contains a field *PARTS*, which is a *List<String>*. With the help of the *flatMap()* method, every element from field *PARTS* will be extracted and added to the new resulting stream. After that, the initial *Stream<Detail>* will be lost*.*
        
    - **filter():**
    The *filter()* method allows us to pick a stream of elements that satisfy a predicate.
        
        ```java
        Stream<String> stream = list.stream().filter(element -> element.contains("d"));
        ```
        
- **terminal operation:** return non-stream value(boolean, long, Optional, void, etc...)
    - **forEach():**
    The `forEach()`method is part of the `Stream`interface and is used to execute a specified operation, defined by a `Consume`.
        
        ```java
        list.stream().forEach((k) -> {
            System.out.print(k + " ");
        });
        ```
        
    - **collect():**
    The **collect()** operation accumulates elements in a stream into a container such as a collection. It performs mutable reduction operation in which the reduced (final) value is a mutable result container such as an ArrayList.
    The following example accumulates emails of the persons into a list collection:
    
    ```java
    List<String> listEmails = listPersons.stream()
                    .map(p -> p.getEmail())
                    .collect(Collectors.toList());
     
    System.out.println("List of Emails: " + listEmails);
    ```