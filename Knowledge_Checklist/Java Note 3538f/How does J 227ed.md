# How does Java implement Encapsulation? Why do we need encapsulation?

**Encapsulation in Java can be achieved by:**

- Declaring the variables of a class as private.
- Providing public setter and getter methods to modify and view the variables values.

Example of Encapsulation:

```java
public class Car {
private String name;
private double topSpeed;
public Car() {}
public String getName(){
	return name; 
}
public void setName(String name){
	this.name= name;
}
public void setTopSpeed(double speedMPH){
	 topSpeed = speedMPH;
}
public double getTopSpeedMPH(){
	return topSpeed;
}    
public double getTopSpeedKMH(){
	return topSpeed*1.609344;   
}
}
```

**Encapsulation is essential in Java because:**

- It controls the way of data accessibility
- Modifies the code based on the requisites
- Helps us to achieve a loose couple
- Achieves simplicity of our application
- It also allows us to change the part of the code without disrupting any other functions or code present in the program.

**Benefits of Encapsulation:**

- **Data Hiding:** A user will have no idea about the inner implementation of the class. Even user will not be aware of how the class is storing values in the variables. He/she will only be aware that we are passing the values to a setter method and variables are getting initialized with that value.
- **Increased Flexibility:** We can make the variables of the class as read-only or write-only depending on our requirement. In case you wish to make the variables as read-only then we have to omit the setter methods like setName(), setAge() etc. or if we wish to make the variables as write-only then we have to omit the get methods like getName(), getAge() etc. from the above program.
- **Reusability:** It also improves the re-usability and easy to change with new requirements.