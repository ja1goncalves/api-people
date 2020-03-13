package com.people.apipeople.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.people.apipeople.repository.IPeopleRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import com.people.apipeople.models.People;

public class PeopleService implements IPeopleService {
	
	@Autowired
	IPeopleRepository repository;

	@Override
	public Flux<People> findAll() {
		return repository.findAll();
	}

	@Override
	public Mono<People> findById(String id) {
		return repository.findById(id);
	}

	@Override
	public Mono<People> save(People people) {
		return repository.save(people);
	}
	
	@Override
	public Mono<Void> delete(People people) {
		return repository.delete(people);
	}
}
