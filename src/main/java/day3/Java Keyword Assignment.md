# Java Keyword Definition

### Data types

1. `byte`: The byte data type is an 8-bit signed two's complement integer. It has a minimum value of -128 and a maximum value of 127 (inclusive).
2. `short`: The short data type is a 16-bit signed two's complement integer. It has a minimum value of -32,768 and a maximum value of 32,767 (inclusive).
3. `int`: By default, the int data type is a 32-bit signed two's complement integer, which has a minimum value of $-2^{31}$ and a maximum value of $2^{31}-1$.
4. `long`: The long data type is a 64-bit two's complement integer. The signed long has a minimum value of $-2^{63}$ and a maximum value of $2^{63}-1$.
5. `float`: The float data type is a single-precision 32-bit IEEE 754 floating point.
6. `double`: The double data type is a double-precision 64-bit IEEE 754 floating point.
7. `char`: The char data type is a single 16-bit Unicode character. It has a minimum value of `'\u0000'`(or 0) and a maximum value of `'\uffff'`(or 65,535 inclusive).
8. `boolean`: The boolean data type has only two possible values: `true`and `false`. Use this data type for simple flags that track true/false conditions. This data type represents one bit of information, but its "size" isn't something that's precisely defined.

### flow control

1. `if`: In Java, the "if" statement is used to evaluate a condition. The control of the program is diverted depending upon the specific condition. The condition of the If statement gives a Boolean value, either true or false.
2. `else`: The if-else statement is an extension to the if-statement, which uses another block of code, i.e., else block. The else block is executed if the condition of the if-block is evaluated as false.
3. `switch`: The switch statement contains multiple blocks of code called cases and a single case is executed based on the variable which is being switched.
4. `case`: The case keyword marks a block of code in a switch statement.
5. `default`: The default keyword the default block of code in a switch statement. The default keyword specifies some code to run if there is no case match in the switch.
6. `for`: For loop enables us to initialize the loop variable, check the condition, and increment/decrement in a single line of code. We use the for loop only when we exactly know the number of times, we want to execute the block of code.
7. `do`: The do-while loop checks the condition at the end of the loop after executing the loop statements. When the number of iteration is not known and we have to execute the loop at least once, we can use do-while loop.
8. `while`: The while loop is also used to iterate over the number of statements multiple times. However, if we don't know the number of iterations in advance, it is recommended to use a while loop. Unlike for loop, the initialization and increment/decrement doesn't take place inside the loop statement in while loop.
9. `break`: The break statement is used to break the current flow of the program and transfer the control to the next statement outside a loop or switch statement. However, it breaks only the inner loop in the case of the nested loop.
10. `continue`: The continue statement skips the specific part of the loop and jumps to the next iteration of the loop immediately.
11. `return`: Java return keyword is used to complete the execution of a method. The return followed by the appropriate value that is returned to the caller. This value depends on the method return type like int method always return an integer value.

### modifers

1. `public`: can be accessed from anywhere
2. `private`: can be accessed only within the class
3. `protected`: can be accessed from anywhere within the same package and any child classes
4. `static`: The static keyword is a non-access modifier used for methods and attributes.
5. `final`: Final is a reserved keyword in Java. Final is used on Class, Method, and variable. Under this keyword, a final class cannot be inherited, a final method cannot be overridden, a final variable value cannot be re-referenced.
6. `abstract`: The abstract keyword is a non-access modifier, used for classes and methods.
7. `synchronized`: This keyword helps achieve communication between threads such that only one thread accesses the synchronized resource and other threads wait for the resource to become free.
8. `native`: In Java, the native keyword is used to declare a method which is implemented in platform-dependent code such as C or C++. When a method is marked as native, it cannot have a body and must ends with a semicolon instead.
9. `strictfp`: strictfp is used in java for restricting floating-point calculations and ensuring the same result on every platform while performing operations in the floating-point variable.
10. `transient`: transient is a variables modifier used in **[serialization](https://www.geeksforgeeks.org/serialization-in-java/)**
. At the time of serialization, if we don’t want to save value of a particular variable in a file, then we use transient keyword.
11. `volatile`: Volatile is a keyword used to ensure thread safe(all writes and reads will be directly on the main memory instead of CPU cache)

### Exception Handling

1. try: The try statement allows you to define a block of code to be tested for errors while it is being executed.
2. catch: The catch statement allows you to define a block of code to be executed, if an error occurs in the try block.
3. finally: Finally is used in Java exception handling, normally placed after the catch block. It will always be executed no matter if the exception is handled or not.
4. throw: The throw keyword in Java is used to explicitly throw an exception from a method or any block of code. We can throw either checked or unchecked exception. The throw keyword is mainly used to throw custom exceptions.
5. throws: throws is a keyword in Java which is used in the signature of method to indicate that this method might throw one of the listed type exceptions. The caller to these methods has to handle the exception using a try-catch block.
6. assert: **`assert`**is a Java keyword used to define an *assert statement*. An assert statement is used to declare an expected boolean condition in a program. If the program is running with assertions enabled, then the condition is checked at runtime. If the condition is false, the Java runtime system throws an AssertionError.

### Class-related Keywords

1. `class`: The class keyword is used to declare a new Java class, which is a collection of related variables and/or methods.
2. `package`: The package keyword declares a 'name space' for the Java class. It must be put at the top of the Java file, it should be the first Java statement line.
3. `import`: The import keyword declares a Java class to use in the code below the import statement. Once a Java class is declared, then the class name can be used in the code without specifying the package the class belongs to.
4. `extends`: The extends keyword extends a class (indicates that a class is inherited from another class).
5. `implements`: The implements keyword is used to implement an interface. The interface keyword is used to declare a special type of class that only contains abstract methods.
6. `interface`: The interface keyword is used to declare a special type of class that only contains abstract methods.

### Object related keywords

1. `new`: The Java new keyword is used to create an instance of the class.
2. `instanceof`: The instanceof keyword checks whether an object is an instance of a specific class or an interface.
3. `super`: The ****super keyword in java is a reference variable that is used to refer parent class objects.
4. `this`: ****The this keyword refers to the current object in a method or constructor.