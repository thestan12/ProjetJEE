package com.mh.forum.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class AddPostDto {

     String subject;
     String content;



}
