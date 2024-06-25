package ru.yandex.practicum.catsgram.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@EqualsAndHashCode(of = { "id"})
public class Post {
    Long id;
    long authorId;
    String description;
    Instant postDate;

    public Post(Long id, long authorId, String description, Instant postDate) {
        this.id = id;
        this.authorId = authorId;
        this.description = description;
        this.postDate = postDate;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", authorId=" + authorId +
                ", description='" + description + '\'' +
                ", postDate=" + postDate +
                '}';
    }
}
