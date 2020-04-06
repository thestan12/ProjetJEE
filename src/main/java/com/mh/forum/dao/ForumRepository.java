package com.mh.forum.dao;


import com.mh.forum.dto.PostDto;
import com.mh.forum.entity.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ForumRepository extends MongoRepository<Post,String> {
   // public List<Post> findByUserEmailId(String userEmailId);

    Iterable<PostDto> findAllByOrderByDateCreate();
/*    Stream<Post> findbyUser(String user);
    List<Post> findAllByOrderByDatePost();
    List<Post> findPostsBySubject(String subject);*/
}
