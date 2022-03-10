# Lambda Expression

- **What is Lambda Expression?** 
Lambda Expression is a new language feature allowing us to treat actions as objects which mean we can pass a function as a parameter of method. A lambda expression is a short block of code which takes in parameters and returns a value. Example: x → x+1, this lambda expects an input parameter x and return the x+1 as the result.
- **Why does Lambda Expression work so closely with Functional Interface?**
Lambda Expression works so closely with Functional Interface is because Lambdas simplify the use of interfaces that declare single abstract methods which is the functional interfaces.

Example:

```java
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class JavaNewFeatures {
    public static void main(String[] args) {
        Drawable d = () -> {
            System.out.println("drawing a circle");
        };
        d.draw();
        Queue<Integer> maxHeap = new PriorityQueue<>((e1, e2) -> e2 - e1);
        maxHeap.add(3);
        maxHeap.add(1);
        maxHeap.add(8);
        maxHeap.add(2);
        System.out.println(Arrays.toString(maxHeap.toArray()));

    }
}

interface Drawable {
    public void draw();
}

class Draw implements Drawable {
    @Override
    public void draw() {
        System.out.println("drawing a circle");
    }
}
```