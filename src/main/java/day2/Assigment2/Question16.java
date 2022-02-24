package day2.Assigment2;

import java.io.File;
import java.util.Arrays;

public class Question16 {
    public static void count(Criteria criteria){
        String folderPath = criteria.getFolderPath();
        int fileCount = 0;
        int folderCount = 0;
        File f= new File(folderPath);
        File fileList[] = f.listFiles();
        for(int i  = 0; i < fileList.length; i++){
            if(fileList[i].isFile()){
                fileCount++;
            }else if(fileList[i].isDirectory()){
                folderCount++;
            }
        }

        criteria.setFileNum(fileCount);
        criteria.setSubFolderNum(folderCount);


//        System.out.println(Arrays.toString(data));
//        return data;


    }

    public static void main(String[] args) {

        String path = "C:\\Users\\david\\Desktop\\ICC Training\\Antra";
        Criteria criteria = new Criteria(path, "", 0, 0, false);
        count(criteria);
        System.out.println(criteria.getFileNum());
        System.out.println(criteria.getSubFolderNum());
    }

}
