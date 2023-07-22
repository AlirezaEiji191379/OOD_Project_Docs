package org.example.content.entities;

import org.example.content.entities.enums.SubtitlePosition;

public class SubtitleEntity {
    private int id;
    private FileEntity file;
    private SubtitlePosition position;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public FileEntity getFile() {
        return file;
    }

    public void setFile(FileEntity file) {
        this.file = file;
    }

    public SubtitlePosition getPosition() {
        return position;
    }

    public void setPosition(SubtitlePosition position) {
        this.position = position;
    }
}
