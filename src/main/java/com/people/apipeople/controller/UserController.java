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

import com.people.apipeople.models.User;
import com.people.apipeople.service.UserService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value="/api")
@Api(value="API REST Users")
public class UserController {

	@Autowired
	UserService service;
	
	@GetMapping(value="/users")
	@ApiOperation(value="Return one list of users")
	public Flux<User> all() {
		return service.findAll();
	}
	
	@GetMapping(value="/users/{id}")
	@ApiOperation(value="Return only unique user")
	public Mono<User> find(@PathVariable String id) {
		return service.findById(id);
	}
	
	@PostMapping(value="/users")
	@ApiOperation(value="Register the informartions of a users")
	public Mono<User> saveUser(@RequestBody User user){
		return service.save(user);
	}

	
	@PutMapping("/users")
	@ApiOperation(value="Update the informartions of a users")
	public Mono<User> update(@RequestBody @Valid User user) {
		return service.save(user);
	}
	
	@DeleteMapping("/users")
	@ApiOperation(value="Detele one user")
	public Mono<Void> delete(@RequestBody @Valid User user) {
		return service.delete(user);
	}
}
