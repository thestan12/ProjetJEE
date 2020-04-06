package com.mh.forum.dao;


import org.springframework.data.mongodb.repository.MongoRepository;

import javax.xml.stream.events.Comment;

public interface CommentRepositry extends MongoRepository<Comment, String> {
}
