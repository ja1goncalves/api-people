package com.people.apipeople.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.people.apipeople.models.Role;
import com.people.apipeople.models.User;
import com.people.apipeople.repository.IUserRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class UserService implements IUserService, UserDetailsService{

	@Autowired
	IUserRepository repository;

	@Override
	public Flux<User> findAll() {
		return repository.findAll();
	}

	@Override
	public Mono<User> findById(String id) {
		return repository.findById(id);
	}

	@Override
	public Mono<User> save(User user) {
		if (user.getRoles() == null) {
			List<Role> roles = new ArrayList<Role>();
			roles.add(new Role("ROLE_USER"));
			roles.add(new Role("ROLE_ADMIN"));
			user.setRoles(roles);
		}
		
		return repository.save(user);
	}
	
	@Override
	public Mono<Void> delete(User user) {
		return repository.delete(user);
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = repository.findByUsername(username).block();
		
		if (user == null)
			throw new UsernameNotFoundException("User not found!");
		
		return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), true, true, true, true, user.getAuthorities());
	}

}
