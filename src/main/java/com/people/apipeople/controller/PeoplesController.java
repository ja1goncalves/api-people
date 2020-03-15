package com.people.apipeople.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
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

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value="/api")
@Api(value="API REST People")
public class PeoplesController {

	@Autowired
	PeopleService service;

	@GetMapping(value="")
	@ApiOperation(value="Inital page")
	public Flux<People> index() {
		return this.all();
	}
	
	@GetMapping(value="/peoples")
	@ApiOperation(value="Return one list of people")
	public Flux<People> all() {
		return service.findAll();
	}
	
	@GetMapping(value="/peoples/{id}")
	@ApiOperation(value="Return only unique people")
	public Mono<People> find(@PathVariable String id) {
		return service.findById(id);
	}
	
	
	@PostMapping(value="/peoples")
	@ApiOperation(value="Register the informartions of a peoples")
	public Mono<People> save(@RequestBody People people){
		return service.save(people);
	}

	
	@PutMapping("/peoples")
	@ApiOperation(value="Update the informartions of a people")
	public Mono<People> update(@RequestBody @Valid People people) {
		return service.update(people);
	}
	
	@DeleteMapping("/peoples")
	@ApiOperation(value="Detele one people")
	public Mono<Void> delete(@RequestBody @Valid People people) {
		return service.delete(people);
	}

}
