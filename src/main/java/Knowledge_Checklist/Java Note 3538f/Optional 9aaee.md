# Optional

Optional is a container object used to contain not-null objects. Optional object is used to represent null with absent value. This class has various utility methods to facilitate code to handle values as ‘available’ or ‘not available’ instead of checking null values.

```java
public static void main(String[] args) {
        String str = null;
        if(str == null){
            System.out.println("Nothing here");
        }else{
            System.out.println(str);
        }

        Optional<String> opt = Optional.ofNullable(str);
        System.out.println(opt.orElse("Nothing here"));

    }
```