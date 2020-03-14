package com.people.apipeople.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.people.apipeople.models.User;

import reactor.core.publisher.Mono;

public interface IUserRepository extends ReactiveMongoRepository<User, String>{

	Mono<User> findByUsername(String username);
}
