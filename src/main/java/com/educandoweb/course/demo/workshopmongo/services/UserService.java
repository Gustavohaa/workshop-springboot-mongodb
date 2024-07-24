package com.educandoweb.course.demo.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.demo.workshopmongo.domain.User;
import com.educandoweb.course.demo.workshopmongo.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;
	
	
	public List<User> findAll(){
		return repo.findAll();
	}
}
