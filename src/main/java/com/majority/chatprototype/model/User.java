package com.majority.chatprototype.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.majority.chatprototype.model.form.UserForm;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String username;
    private String password;
    private LocalDateTime creationDate;

    public Long getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public String getUsername(){
        return this.username;
    }

    public String getPassword(){
        return this.password;
    }

    public LocalDateTime getCreationDate(){
        return this.creationDate;
    }

    public void setId(Long id){
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public void convertUserFormToUser(UserForm userForm){
        this.name = userForm.getName();
        this.username = userForm.getUsername();
        this.password = userForm.getPassword();
        this.creationDate = LocalDateTime.now();
        
    }
}
