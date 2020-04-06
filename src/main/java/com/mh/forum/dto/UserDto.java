package com.mh.forum.dto;

import com.mh.forum.entity.ProfilePicture;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;


@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDto {


     String idUser;
     String password;
     String email;
     String firstName;
     String lastName;
     ProfilePicture profilePicture;
     Set<CommentDto> comments =new HashSet<CommentDto>(0);
     Set<PostDto> posts = new HashSet<PostDto>(0);
}
