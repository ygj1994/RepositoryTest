package com.example.demo.model;



/**
 * ResourceDir
 */
public class ResourceDir {
    private int resDir;
    private String dirName;
    private int parentId;
	public String toString() {
        return "{" +
            "resDir=" + getResDir() +
            ",dirName='" + getDirName() + "'" +
            ",parentId=" + getParentId() +
            "}";
    }
    public void setResDir(int resDir) {
        this.resDir = resDir;
    }
    public int getResDir() {
        return this.resDir;
    }
    public void setDirName(String dirName) {
        this.dirName = dirName;
    }
    public String getDirName() {
        return this.dirName;
    }
    public void setParentId(int parentId) {
        this.parentId = parentId;
    }
    public int getParentId() {
        return this.parentId;
    }


   


    
}