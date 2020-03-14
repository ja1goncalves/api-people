package com.people.apipeople.service;

import com.people.apipeople.models.User;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IUserService {

	Flux<User> findAll();
	Mono<User> findById(String id);
	Mono<User> save(User user);
	Mono<Void> delete(User user);
}
