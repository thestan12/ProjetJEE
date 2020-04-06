package com.mh.forum.services;

import com.mh.forum.dto.AddUserDto;
import com.mh.forum.dto.UserDto;

public interface UserService {

    UserDto addPost(AddUserDto addUserDto);

    UserDto login(String login);

    UserDto deleteUser(String login);


}
