package com.web.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.web.model.MyModel;

public interface MyRepo extends MongoRepository<MyModel, String> {
}