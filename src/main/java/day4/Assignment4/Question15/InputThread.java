package day4.Assignment4.Question15;

import java.io.*;
import java.util.concurrent.BlockingQueue;

public class InputThread implements Runnable {
    public String filePath;
    public BlockingQueue<String> bufferedString;

    public InputThread(String filePath, BlockingQueue<String> bufferedString ){
        this.filePath = filePath;
        this.bufferedString = bufferedString;
    }

    @Override
    public void run(){
        BufferedReader bufferedReader = null;
        try{
            File file  = new File(this.filePath);
             bufferedReader = new BufferedReader(new FileReader(file));
            String line;
            while((line = bufferedReader.readLine()) != null){
                int currentResult = 0;
                line = line.trim();
                if(!line.equals("")){
                    String[] ops = line.split(" ");
                    int multi = 1;
                    for(int i = 0; i < ops.length; i++){
                        if(ops[i].equals("+")){
                            continue;
                        }
                        if(ops[i].equals("-")){
                            multi = -1;
                            continue;
                        }
                        currentResult += multi * Integer.parseInt(ops[i]);
                    }
                        bufferedString.add(line + " = " + currentResult);
                }
            }
            bufferedString.add("end");

        }catch( FileNotFoundException e){
            System.out.println("Read Thread Interrupted");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try{
                bufferedReader.close();
            }catch(IOException ioe2){
                ioe2.printStackTrace();
            }
        }
    }
}
