package com.codeclan.example.filesandfolders.models;

public class File {

    private String name;
    private String extension;
    private String size;

    public File(String name, String extension, String size) {
        this.name = name;
        this.extension = extension;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
