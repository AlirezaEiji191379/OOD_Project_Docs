package org.example.content.repositories;

import org.example.content.entities.MusicEntity;

public interface MusicRepository {
    MusicEntity find(int contentId);
}
