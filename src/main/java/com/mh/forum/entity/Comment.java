package com.mh.forum.entity;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Document(collation = "comments")
public class Comment {

    @Id
    String idComment;
    String userEmail;
    String content;
    Post post;
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    LocalDateTime dateCreate;


    public Comment(String userEmail, String content) {
        this.userEmail = userEmail;
        this.content = content;
        dateCreate = LocalDateTime.now();
    }
}
