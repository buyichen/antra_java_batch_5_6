# Class Loader

The **Java Class Loader** is a part of the **[Java Runtime Environment](Class%20Load%20ac48b/JRE%20d597e.md)** that dynamically loads Java classes into the Java Virtual Machine. The Java run time system does not need to know about files and file systems because of class loaders.
**Java classes** aren’t loaded into memory all at once, but when required by an application. At this point, the **Java Class Loader** is called by the **JRE** and these Class Loaders load classes into memory dynamically.

**Types of Loader:**

- **Bootstrap Class Loader:**
A Bootstrap Class loader is a Machine code which kickstarts the operation when the JVM calls it. It is not a java class. Its job is to load the first pure Java Class Loader. Bootstrap Class Loader loads classes from the location ***rt.jar***. Bootstrap Class Loader doesn’t have any parent Class Loaders. It is also called as the **Primodial Class Loader**.
- **Extension Class Loader:**
The Extension Class Loader is a child of Bootstrap Class Loader and loads the extensions of core java classes from the respective JDK Extension library. It loads files from ***jre/lib/ext*** directory or any other directory pointed by the system property ***java.ext.dirs***.
- **Application Class Loader:**
An Application Class Loader is also known as a System Class Loader. It loads the Application type classes found in the environment variable ***CLASSPATH, -classpath or -cp command line option***. The Application Class Loader is a child class of Extension Class Loader.

**The Class Loader performs three basic activities in this strict order:**

- **Loading:**
It is the process of finding the binary representation of a class or interface type with a particular name and creating a class or interface from that binary representation. JVM provides two types of class loaders. One is called *bootstrap* class loader and another is the *user-defined* class loader. The *bootstrap* class loader is rigidly defined in the JVM and loads class files according to the specification. The *user-defined* class loader is open for vendor-specific implementation and can custom load classes via the *java.lang.Class* instance. In conclusion, the loading process basically performs these three functions:
    - Create a binary stream of data from the class file
    - Parse the binary data according to the internal data structure.
    - Create an instance of *java.lang.Class*
- **Linking:**
Linking a class or interface involves verifying and preparing that class or interface, its direct superclass, its direct super interfaces, and its element type (if it is an array type), if necessary. Resolution of symbolic references in the class or interface is an optional part of linking. This specification allows an implementation flexibility as to when linking activities (and, because of recursion, loading) take place, provided that all of the following properties are maintained:
    - A class or interface is completely loaded before it is linked.
    - A class or interface is completely verified and prepared before it is initialized.
    - Errors detected during linkage are thrown at a point in the program where some action is taken by the program that might, directly or indirectly, require linkage to the class or interface involved in the error.
    
    **Three Steps in Linking:**
    
    - **Verification:** 
    *Verification* ensures that the binary representation of a class or interface is structurally correct. Verification may cause additional classes and interfaces to be loaded but need not cause them to be verified or prepared.
    - **Preparation:**
    *Preparation* involves creating the static fields for a class or interface and initializing such fields to their default values. This does not require the execution of any Java Virtual Machine code; explicit initializers for static fields are executed as part of initialization, not preparation.
    - **Resolution**:
    Resolution transforms symbolic references from the type into direct references.
- **Initializing:**
Initialization of a class or interface consists of executing its class or interface initialization method. After the class or interface is linked through the process of verification, preparing, and optionally resolving, the initialization phase makes the class ready for its first active use. The process starts with initializing the class variables with the value that the program is expected to start off. It is the responsibility of the programmer to decide what the appropriate value for the class variables should be, according to one’s grand plan. Therefore, initialization means that the class variables are initialized via some initialization routine described by the programmer and initialize the class’s direct superclass if it has not been already initialized. The initialization of an interface, however, does not require initialization of its super-interfaces.