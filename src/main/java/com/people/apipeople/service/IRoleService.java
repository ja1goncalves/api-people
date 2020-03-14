package com.people.apipeople.service;

import com.people.apipeople.models.Role;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IRoleService {

	Flux<Role> findAll();
	Mono<Role> findById(String id);
	Mono<Role> save(Role role);
	Mono<Void> delete(Role role);
}
