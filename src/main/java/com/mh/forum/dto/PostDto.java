package com.mh.forum.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder
public class PostDto {

     String idPost;
     String userEmail;
     String subject;
     String content;
     @Builder.Default
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
     LocalDateTime dateCreate = LocalDateTime.now();
     Integer likes;
     List<CommentDto> comments;
}
