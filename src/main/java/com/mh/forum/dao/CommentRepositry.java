package com.mh.forum.dao;


import com.mh.forum.entity.Comment;
import com.mh.forum.entity.Post;
import org.springframework.data.mongodb.repository.MongoRepository;


import java.util.stream.Stream;

public interface CommentRepositry extends MongoRepository<Comment, String> {

    Stream<Comment> findCommentByUserEmail(String user);
}
