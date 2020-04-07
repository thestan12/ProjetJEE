package com.mh.forum.entity;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Document(collation = "posts")
public class Post {
    @Id
     String idPost;
     String userEmail;
     String subject;
     String content;
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
     LocalDateTime dateCreate;
     int likes;
     Set<Comment> comments;

    public Post(String userEmail, String subject, String content) {
        this.userEmail = userEmail;
        this.subject = subject;
        this.content = content;
        this.dateCreate = LocalDateTime.now();
        likes = 0;
        comments = new HashSet<Comment>(0);
    }

    public void addLike() {
        likes++;
    }

    public boolean addComment(Comment comment) {

        return comments.add(comment);
    }
}