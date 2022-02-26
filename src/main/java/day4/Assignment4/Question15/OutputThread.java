package day4.Assignment4.Question15;

import java.io.*;
import java.util.concurrent.BlockingQueue;

public class OutputThread implements Runnable {
    public BlockingQueue<String> bufferedString;
    public String filePath;

    public OutputThread(BlockingQueue<String> bufferedString, String filePath){
        this.bufferedString = bufferedString;
        this.filePath = filePath;
    }

    @Override
    public void run(){
        try{
            FileWriter fileWriter = new FileWriter(filePath);
            while(true){
                String line = bufferedString.take();
                if(line.equals("end")) break;
                fileWriter.write(line + "\n");
            }
            fileWriter.close();

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }


    }
}
