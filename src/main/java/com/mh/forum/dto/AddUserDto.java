package com.mh.forum.dto;

import com.mh.forum.entity.ProfilePicture;
import lombok.Getter;

@Getter
public class AddUserDto {
     String password;
     String email;
     String firstName;
     String lastName;
     ProfilePicture profilePicture;
}
