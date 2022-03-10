# Functional Interface

A **functional interface** is an interface that contains only one abstract method. They can have only one functionality to exhibit. From Java 8 onwards, **[lambda expressions](https://www.geeksforgeeks.org/lambda-expressions-java-8/)** can be used to represent the instance of a functional interface. A functional interface can have any number of default methods. ***Runnable***, ***ActionListener***, ***Comparable*** are some of the examples of functional interfaces.
Functional Interface is additionally recognized as **Single Abstract Method Interfaces**.

Example:

```java
@FunctionalInterface
interface GreetingService 
{
    void sayMessage(String message);
}

public static void main(String[] args){
	GreetingService greetService1 = message -> System.out.println("Hello " + message);
}
```

**Java SE 8 included four main kinds of functional interfaces** 
which can be applied in multiple situations. These are:

- **Predicate**
A predicate functional interface of java is a type of function which accepts a single value or argument and does some sort of processing on it, and returns a boolean (True/ False) answer. The implementation of the Predicate functional interface also encapsulates the logic of filtering (a process that is used to filter stream components on the base of a provided predicate) in Java.
    - `public boolean test(T t)`
- **Function**
A function is a type of functional interface in Java that receives only a single argument and returns a value after the required processing. There are many versions of Function interfaces because a primitive type can’t imply a general type argument, so we need these versions of function interfaces.
    - `public R apply(T t)`
- **Consumer**
The consumer interface of the functional interface is the one that accepts only one argument or a gentrified argument. The consumer interface has no return value. It returns nothing. There are also functional variants of the Consumer — DoubleConsumer, IntConsumer, and LongConsumer. These variants accept primitive values as arguments. Other than these variants, there is also one more variant of the Consumer interface known as Bi-Consumer.
    - `public void accept(T t)`
- **Supplier**
The Supplier functional interface is also a type of functional interface that does not take any input or argument and yet returns a single output. This type of functional interface is generally used in the lazy generation of values. Supplier functional interfaces are also used for defining the logic for the generation of any sequence.
    - `public R get()`