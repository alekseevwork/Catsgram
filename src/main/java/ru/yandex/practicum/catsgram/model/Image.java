package ru.yandex.practicum.catsgram.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(of = { "id"})
public class Image {
    long id;
    long postId;
    String originalFileName;
    String filePath;

    public Image(long id, long postId, String originalFileName, String filePath) {
        this.id = id;
        this.postId = postId;
        this.originalFileName = originalFileName;
        this.filePath = filePath;
    }

    @Override
    public String toString() {
        return "Image{" +
                "id=" + id +
                ", postId=" + postId +
                ", originalFileName='" + originalFileName + '\'' +
                ", filePath='" + filePath + '\'' +
                '}';
    }
}
