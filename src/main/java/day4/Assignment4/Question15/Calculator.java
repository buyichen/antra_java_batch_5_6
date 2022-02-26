package day4.Assignment4.Question15;


import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;



public class Calculator {
    public static void main(String[] args) {
        String inputPath = "src/main/java/day4/Assignment4/Question15/input.txt";
        String outputPath = "src/main/java/day4/Assignment4/Question15/output.txt";
        BlockingQueue<String> bufferedString = new ArrayBlockingQueue<String>(1024);

        InputThread inputThread = new InputThread(inputPath, bufferedString);
        OutputThread outputThread = new OutputThread(bufferedString, outputPath);
        new Thread(inputThread).start();
        new Thread(outputThread).start();



    }


}
