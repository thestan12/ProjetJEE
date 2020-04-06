package com.mh.forum.controller;


import com.mh.forum.dto.AddPostDto;
import com.mh.forum.dto.PostDto;
import com.mh.forum.services.ForumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/forum")
public class ForumController {
    @Autowired
    ForumService forumService;


    @PostMapping("/post/{author}")
    //@PreAuthorize("#author==authentication.name")
    public PostDto addPost(@RequestBody AddPostDto addPost, @PathVariable("author") String author) {
        return forumService.addPost(addPost, author);
    }

}
