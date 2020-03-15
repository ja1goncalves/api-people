package com.people.apipeople.service;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import com.people.apipeople.models.People;

public interface IPeopleService {

	Flux<People> findAll();
	Mono<People> findById(String id);
	Mono<People> save(People people);
	Mono<People> update(People people);
	Mono<Void> delete(People people);
}
