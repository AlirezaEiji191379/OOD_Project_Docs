package org.example.content.entities;

import org.example.content.entities.enums.FileQuality;

public class FileEntity {
    private int id;
    private String format;
    private double size;
    private String filePath;
    private FileQuality quality;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public FileQuality getQuality() {
        return quality;
    }

    public void setQuality(FileQuality quality) {
        this.quality = quality;
    }
}
