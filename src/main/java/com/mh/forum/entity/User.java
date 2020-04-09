package com.mh.forum.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashSet;
import java.util.Set;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonSerialize(using = ToStringSerializer.class)
@Document(collation = "users")
public class User {
    @Id
    String idUser;
    String password;
    String email;
    String firstName;
    String lastName;
    byte[] profilePicture;
/*    Set<Comment> comments = new HashSet<Comment>(0);
    Set<Post> posts = new HashSet<Post>(0);*/


}
