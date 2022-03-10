# Modifiers

1. `public`: can be accessed from anywhere
2. `private`: can be accessed only within the class
3. `protected`: can be accessed from anywhere within the same package and any child classes
4. `static`: The static keyword is a non-access modifier used for methods and attributes.
5. `final`: Final is a reserved keyword in Java. Final is used on Class, Method, and variable. Under this keyword, a final class cannot be inherited, a final method cannot be overridden, a final variable value cannot be re-referenced.
6. `abstract`: The abstract keyword is a non-access modifier, used for classes and methods.
7. `synchronized`: This keyword helps achieve communication between threads such that only one thread accesses the synchronized resource and other threads wait for the resource to become free.
8. `native`: In Java, the native keyword is used to declare a method which is implemented in platform-dependent code such as C or C++. When a method is marked as native, it cannot have a body and must ends with a semicolon instead.
9. `strictfp`: strictfp is used in java for restricting floating-point calculations and ensuring the same result on every platform while performing operations in the floating-point variable.
10. `transient`: transient is a variables modifier used in **[serialization](https://www.geeksforgeeks.org/serialization-in-java/)**. At the time of serialization, if we don’t want to save value of a particular variable in a file, then we use transient keyword.
11. `volatile`: Volatile is a keyword used to ensure thread safe(all writes and reads will be directly on the main memory instead of CPU cache)