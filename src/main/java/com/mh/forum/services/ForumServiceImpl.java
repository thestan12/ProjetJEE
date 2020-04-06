package com.mh.forum.services;

import com.mh.forum.dao.ForumRepository;
import com.mh.forum.dto.AddCommentDto;
import com.mh.forum.dto.AddPostDto;
import com.mh.forum.dto.CommentDto;
import com.mh.forum.dto.PostDto;
import com.mh.forum.entity.Comment;
import com.mh.forum.entity.Post;
import com.mh.forum.exceptions.PostNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class ForumServiceImpl implements ForumService {

    @Autowired
    ForumRepository forumRepository;

    @Override
    public PostDto addPost(AddPostDto addPostDto, String userEmail) {

        Post post = new Post(userEmail, addPostDto.getSubject(), addPostDto.getContent());
        post = forumRepository.save(post);
        return null;
    }

    @Override
    public PostDto addComment(String id, AddCommentDto addCommentDto) {
        return null;
    }

    @Override
    public PostDto getPost(String id) {
        Post post = forumRepository.findById(id).orElseThrow(() -> new PostNotFoundException(id));
        return convertToPostDto(post);
    }

    @Override
    public Iterable<PostDto> getPostsByUser(String user) {
        return null;
    }

    @Override
    public Iterable<PostDto> getPosts() {
        return forumRepository.findAllByOrderByDateCreate();
    }

    @Override
    public Iterable<CommentDto> getCommentsByPost(String id) {
        return null;
    }

    @Override
    public Iterable<CommentDto> getCommentsByUser(String id, String author) {
        return null;
    }

    @Override
    public PostDto deletePost(String id) {
        return null;
    }

    @Override
    public PostDto updatePost(AddPostDto addPostDto, String id) {
        return null;
    }

    @Override
    public CommentDto updateComent(AddCommentDto addCommentDto, String id) {
        return null;
    }

    @Override
    public boolean addLike(String id) {
        return false;
    }



    private PostDto convertToPostDto(Post post) {
        return PostDto.builder().idPost(post.getIdPost()).userEmail(post.getUserEmail()).subject(post.getSubject())
                .dateCreate(post.getDateCreate()).content(post.getContent())
                .likes(post.getLikes())
                .comments(post.getComments().stream().map(this::convertToCommentDto).collect(Collectors.toList()))
                .build();
    }
    private CommentDto convertToCommentDto(Comment comment) {
        return CommentDto.builder().userEmail(comment.getUserEmail()).content(comment.getContent())
                .dateCreate(comment.getDateCreate())     .build();
    }
}
