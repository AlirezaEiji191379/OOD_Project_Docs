package org.example.content.repositories;

import org.example.content.entities.VideoEntity;

public interface VideoRepository {
    VideoEntity find(int contentId);
}
