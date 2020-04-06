package com.mh.forum.services;

import com.mh.forum.dto.AddCommentDto;
import com.mh.forum.dto.AddPostDto;
import com.mh.forum.dto.CommentDto;
import com.mh.forum.dto.PostDto;


public interface ForumService {


    PostDto addPost(AddPostDto addPostDto,String userEmail);

    PostDto addComment(String id, AddCommentDto addCommentDto);

    PostDto getPost(String id);

    Iterable<PostDto> getPostsByUser(String user);
    Iterable<PostDto> getPosts();

    Iterable<CommentDto> getCommentsByPost(String id);

    Iterable<CommentDto> getCommentsByUser(String id, String author);

    PostDto deletePost(String id);

    PostDto updatePost(AddPostDto addPostDto, String id);

    CommentDto updateComent(AddCommentDto addCommentDto, String id);

    boolean addLike(String id);


}
