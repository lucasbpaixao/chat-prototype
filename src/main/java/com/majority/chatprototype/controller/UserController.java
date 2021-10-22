package com.majority.chatprototype.controller;

import com.majority.chatprototype.model.form.UserForm;
import com.majority.chatprototype.repository.UserRepository;

import java.net.URI;

import com.majority.chatprototype.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping
    @Transactional
    public ResponseEntity<User> createUser(@RequestBody UserForm userForm, UriComponentsBuilder uriBuilder){
        User user = new User();
        user.convertUserFormToUser(userForm);

        userRepository.saveAndFlush(user);
        
        URI uri = uriBuilder.path("/user/{id}").buildAndExpand(user.getId()).toUri();
        return ResponseEntity.created(uri).body(user);
        
    }
}
