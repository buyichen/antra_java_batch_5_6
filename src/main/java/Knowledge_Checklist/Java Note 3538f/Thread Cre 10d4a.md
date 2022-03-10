# Thread Creation

- **Method 1: Extending the Thread Class**
    
    Create a class that extends the java.lang.Thread class. This class overrides the run() method available in the Thread class. A thread begins its life inside run() method. We create an object of our new class and call start() method to start the execution of a thread. start() invokes the run() method on the Thread object. 
    
    ```java
    class MultithreadingDemo extends Thread{
        public void run(){
            try{
                System.out.println("Thread " + Thread.currentThread().getId() + " is running");
            } catch(Exception e){
                System.out.println("Exception is caught");
            }
        }
    }
    
    public class Multithread {
        public static void main(String[] args) {
            int n = 8;
            for (int i = 0; i < n; i++) {
                MultithreadingDemo object = new MultithreadingDemo();
                object.start();
            }
        }
    }
    ```
    
- **Method 2: Thread creation by implementing the Runnable Interface**
    
    Create a new class which implements java.lang.Runnable interface and override run() method. Then we instantiate a Thread object and call start() method on this object.
    
    ```java
    class MultithreadingDemoMethod2 implements Runnable{
        public void run(){
            try{
                System.out.println("Thread " + Thread.currentThread().getId() + " is running");
            } catch(Exception e){
                System.out.println("Exception is caught");
            }
        }
    }
    
    public class Multithread {
        public static void main(String[] args) {
            int n = 8;
            for (int i = 0; i < n; i++) {
                Thread object = new Thread(new MultithreadingDemoMethod2());
                object.start();
            }
        }
    }
    ```
    
- **Method 3: Thread Creation by implementing the Callable interface**
    
    ```java
    class MultithreadingDemoMethod3 implements Callable {
        @Override
        public Integer call() throws Exception {
            System.out.println("From callable, the current thread is " + Thread.currentThread().getName());
            return 200;
        }
    }
    
    public class Multithread {
        public static void main(String[] args) throws ExecutionException, InterruptedException {
    
            FutureTask ft = new FutureTask(new MultithreadingDemoMethod3());
            Thread t = new Thread(ft);
            t.start();
            System.out.println(ft.get());
    
        }
    }
    ```
    
- **Thread Pool Creation:**
    
    ```java
    public class ThreadPoolDemo {
        public static void main(String[] args) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(
                    2,
                    5,
                    2L,
                    TimeUnit.SECONDS,
                    new ArrayBlockingQueue<>(4),
                    Executors.defaultThreadFactory(),
                    new ThreadPoolExecutor.AbortPolicy()
            );
    
            for(int i = 1; i <= 5; i++){
                threadPoolExecutor.execute(
                        () -> {
                            System.out.println(Thread.currentThread().getName() + " is working");
                        }
                );
            }
            threadPoolExecutor.shutdown();
        }
    }
    ```
    
    - **corePoolSize**
    - **maximumPoolSize**
    - **KeepAliveTime**
    - **Time unit**
    - **work queue**
    - **thread factory**
    - **handler** (choose one of these)
        - abortPolicy
        - callerRunPolicy
        - discardPolicy
        - discardOldestPolicy
        
        ![Untitled](Thread%20Cre%2010d4a/Untitled.png)