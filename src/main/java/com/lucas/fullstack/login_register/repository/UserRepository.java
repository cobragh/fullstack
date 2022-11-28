package com.lucas.fullstack.login_register.repository;

import com.lucas.fullstack.login_register.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
}
