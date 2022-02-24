package day2.Assigment2;

import java.io.File;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.InvalidPropertiesFormatException;
import java.util.Scanner;

public class Question16 {
    public static void count(Criteria criteria){
        String folderPath = criteria.getFolderPath();
        HashMap<String, Integer> extensionMap = new HashMap<>();
        int fileCount = 0;
        int folderCount = 0;
        File f= new File(folderPath);
        File fileList[] = f.listFiles();
        for(int i  = 0; i < fileList.length; i++){
            if(fileList[i].isFile()){
                String fileName = fileList[i].toString();
                int index = fileName.lastIndexOf('.');
                if(index > 0){
                    String extension = fileName.substring(index + 1);
                    if(extensionMap.containsKey(extension)){
                        extensionMap.put(extension, extensionMap.get(extension) + 1);
                    }else{
                        extensionMap.put(extension, 1);
                    }
                }
                fileCount++;
            }else if(fileList[i].isDirectory()){
                folderCount++;
            }
        }

        if(folderCount > 0) criteria.setContainSubFolder(true);

        criteria.setFileNum(fileCount);
        criteria.setSubFolderNum(folderCount);
        criteria.setExtension(extensionMap);



    }

    public static void main(String[] args) {

        System.out.println("Enter the file path you want to count:");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();

        try{
            Paths.get(path);
        } catch (InvalidPathException ex){
            System.out.println("Invalid path pattern entered");
            return;
        }

        File file = new File(path);
        if (!file.isDirectory()){
            System.out.println("The path not exist.");
            return;
        }

        Criteria criteria = new Criteria(path);
        count(criteria);

        System.out.println("Path: " + path);
        System.out.println("Contains Sub folder? " + criteria.isContainSubFolder());
        System.out.println("File Number: " + criteria.getFileNum());
        System.out.println("Subfolder Number: " + criteria.getSubFolderNum());

        HashMap<String, Integer> output = criteria.getExtension();
        output.entrySet().forEach(entry -> {
            System.out.println("Number of " + entry.getKey() + " file: " + entry.getValue());
        });
//        System.out.println(Arrays.asList(output));
    }

}
