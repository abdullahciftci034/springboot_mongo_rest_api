package com.SpringMongo.MongoRestApi.Repostory;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.SpringMongo.MongoRestApi.Document.User;

public interface UserRepostory extends MongoRepository<User, String> {

}
