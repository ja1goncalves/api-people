package com.people.apipeople.service;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.people.apipeople.repository.IPeopleRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import com.people.apipeople.models.People;

@Service
public class PeopleService implements IPeopleService {
	
	@Autowired
	IPeopleRepository repository;

	@Override
	public Flux<People> findAll() {
		return repository.findAll(Sort.by(Sort.Direction.DESC, "created_at"));
	}

	@Override
	public Mono<People> findById(String id) {
		return repository.findById(id);
	}

	@Override
	public Mono<People>save(People people) {
		people.setCreated_at(new Date(System.currentTimeMillis()));
		people.setCpf(people.getCpf().replaceAll("[\\D]", ""));
		return repository.save(people);
	}

	@Override
	public Mono<People>update(People people) {
		people.setUpdated_at(new Date(System.currentTimeMillis()));
		people.setCpf(people.getCpf().replaceAll("[\\D]", ""));
		return repository.save(people);
	}
	
	@Override
	public Mono<Void> delete(People people) {
		return repository.delete(people);
	}
}
