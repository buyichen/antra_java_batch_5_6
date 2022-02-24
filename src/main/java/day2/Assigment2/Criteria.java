package day2.Assigment2;

public class Criteria {
    public String getFolderPath() {
        return folderPath;
    }

    public void setFolderPath(String folderPath) {
        this.folderPath = folderPath;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
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
    private String extension;
    private int fileNum;
    private int subFolderNum;
    private boolean containSubFolder;

    public Criteria(String folderPath, String extension, int fileNum, int subFolderNum, boolean containSubFolder) {
        this.folderPath = folderPath;
        this.extension = extension;
        this.fileNum = fileNum;
        this.subFolderNum = subFolderNum;
        this.containSubFolder = containSubFolder;
    }


}
