package com.people.apipeople.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.people.apipeople.models.Role;
import com.people.apipeople.repository.IRoleRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class RoleService implements IRoleService{

	@Autowired
	IRoleRepository repository;
	
	@Override
	public Flux<Role> findAll() {
		return repository.findAll();
	}

	@Override
	public Mono<Role> findById(String id) {
		return repository.findById(id);
	}

	@Override
	public Mono<Role> save(Role role) {
		return repository.save(role);
	}

	@Override
	public Mono<Void> delete(Role role) {
		return repository.delete(role);
	}

}
