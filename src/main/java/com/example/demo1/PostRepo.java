package com.example.demo1;

import com.example.demo1.models.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepo extends MongoRepository<Post,String> {
}
