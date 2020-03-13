package com.people.apipeople.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import com.people.apipeople.models.People;
import com.people.apipeople.service.PeopleService;

@RestController
@RequestMapping(value="/api")
public class PeoplesController {

	@Autowired
	PeopleService service;
	
	@GetMapping(value="/peoples")
	public Flux<People> all() {
		return service.findAll();
	}
	
	@GetMapping(value="/peoples/{id}")
	public Mono<People> find(@PathVariable String id) {
		return service.findById(id);
	}
	
	@PostMapping(value="/peoples")
	public Mono<People> save(@RequestBody People people){
		return service.save(people);
	}
	
	@PutMapping("/peoples")
	public Mono<People> update(@RequestBody @Valid People people) {
		return service.save(people);
	}
	
	@DeleteMapping("/peoples")
	public Mono<Void> delete(@RequestBody @Valid People people) {
		return service.delete(people);
	}

}