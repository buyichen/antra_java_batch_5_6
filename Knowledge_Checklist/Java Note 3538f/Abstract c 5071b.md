# Abstract class vs Interface

| Abstract Class | Interface  |
| --- | --- |
| Abstract class permits you to make functionality that child classes can implement or override. | Interface only permits you to state functionality but not to implement it. |
| Abstract class normally has a mixture of abstract and non-abstract methods. These methods can be public/protected/private. | Interface normally has only abstract and public methods. Interface has started supporting default and static methods since Java 8, which are allowed to be implemented in the interface. |
| Abstract class does not support multiple inheritance. | Interface support multiple inheritance. |
| Abstract class allow final, static, and non-static variables. | Interface only allow static and final variables. |
| Abstract class can implement an interface. | Interface cannot extends an abstract class. |