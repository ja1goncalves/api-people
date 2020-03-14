package com.people.apipeople.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.people.apipeople.models.Role;

public interface IRoleRepository extends ReactiveMongoRepository<Role, String>{

}
