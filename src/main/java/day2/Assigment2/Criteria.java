package day2.Assigment2;

import java.util.HashMap;

public class Criteria {
    public String getFolderPath() {
        return folderPath;
    }

    public void setFolderPath(String folderPath) {
        this.folderPath = folderPath;
    }

    public HashMap<String, Integer> getExtension() {
        return extension;
    }

    public void setExtension(HashMap<String, Integer> extension) {
        this.extension = extension;
    }

    public int getFileNum() {
        return fileNum;
    }

    public void setFileNum(int fileNum) {
        this.fileNum = fileNum;
    }

    public int getSubFolderNum() {
        return subFolderNum;
    }

    public void setSubFolderNum(int subFolderNum) {
        this.subFolderNum = subFolderNum;
    }

    public boolean isContainSubFolder() {
        return containSubFolder;
    }

    public void setContainSubFolder(boolean containSubFolder) {
        this.containSubFolder = containSubFolder;
    }

    private String folderPath;
    private HashMap<String, Integer> extension;
    private int fileNum;
    private int subFolderNum;
    private boolean containSubFolder;

    public Criteria(String folderPath) {
        this.folderPath = folderPath;
    }


}
