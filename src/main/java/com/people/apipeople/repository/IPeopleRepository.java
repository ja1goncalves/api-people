package com.people.apipeople.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import com.people.apipeople.models.People;

public interface IPeopleRepository extends ReactiveMongoRepository<People, String>{

}
