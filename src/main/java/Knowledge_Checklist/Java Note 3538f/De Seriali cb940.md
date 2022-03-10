# De/Serialization Examples

The serialization process is instance-independent; for example, we can serialize objects on one platform and deserialize them on another. **Classes that are eligible for serialization need to implement a special marker interface,** *Serializable.* Both ***ObjectInputStream*** and ***ObjectOutputStream*** are high level classes that extend *java.io.InputStream* and *java.io.OutputStream,* 
respectively. *ObjectOutputStream* can write primitive types and graphs of objects to an *OutputStream* as a stream of bytes. We can then read these streams using *ObjectInputStream*. The most important method in *ObjectOutputStream* is:

```java
public final void writeObject(Object o) throws IOException;
```

This method takes a serializable object and converts it into a sequence (stream) of bytes. Similarly, the most important method in *ObjectInputStream* is:

```java
public final Object readObject() 
  throws IOException, ClassNotFoundException;
```

This method can read a stream of bytes and convert it back into a Java object. It can then be cast back to the original object.

Note: If we want an object of a Class be serialize successfully if must satisfy to conditions:

- The Class must implement java.io.Serializable interface.
- All the attributes of the Class must be serializable. If one of the attribute is not, it must be defined as **transient**.

Example:

```java
public class Employee implements java.io.Serializable
{
   public String name;
   public String address;
   public transient int SSN;
   public int number;
   public void mailCheck()
   {
      System.out.println("Mailing a check to " + name
                           + " " + address);
   }
}
```

**Serialize Object:**
ObjectOutputStream class is used for serialize object. In the following example, we can serialize the object to a file.
Note: When an object be serialized into a file, Java will define a “.ser” extension for the file.

```java
import java.io.*;
 
public class SerializeDemo
{
   public static void main(String [] args)
   {
      Employee e = new Employee();
      e.name = "Reyan Ali";
      e.address = "Phokka Kuan, Ambehta Peer";
      e.SSN = 11122333;
      e.number = 101;
      try
      {
         FileOutputStream fileOut =
         new FileOutputStream("/tmp/employee.ser");
         ObjectOutputStream out = new ObjectOutputStream(fileOut);
         out.writeObject(e);
         out.close();
         fileOut.close();
         System.out.printf("Serialized data is saved in /tmp/employee.ser");
      }catch(IOException i)
      {
          i.printStackTrace();
      }
   }
}
```

**Deserialize Object:** 

```java
import java.io.*;
 
public class DeserializeDemo
{
   public static void main(String [] args)
   {
      Employee e = null;
      try
      {
         FileInputStream fileIn = new FileInputStream("/tmp/employee.ser");
         ObjectInputStream in = new ObjectInputStream(fileIn);
         e = (Employee) in.readObject();
         in.close();
         fileIn.close();
      }catch(IOException i)
      {
         i.printStackTrace();
         return;
      }catch(ClassNotFoundException c)
      {
         System.out.println("Employee class not found");
         c.printStackTrace();
         return;
      }
      System.out.println("Deserialized Employee...");
      System.out.println("Name: " + e.name);
      System.out.println("Address: " + e.address);
      System.out.println("SSN: " + e.SSN);
      System.out.println("Number: " + e.number);
    }
}
```