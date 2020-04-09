package com.mh.forum.dto;

import lombok.Getter;

@Getter
public class AddUserDto {
     String password;
     String email;
     String firstName;
     String lastName;
     //byte[] profilePicture;
}
