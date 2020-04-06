package com.mh.forum.entity;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
//@Builder
@Document(collation = "pictures")
public class ProfilePicture {

@Id
     String idPicture;
     User user;
     byte[] photo;
}
