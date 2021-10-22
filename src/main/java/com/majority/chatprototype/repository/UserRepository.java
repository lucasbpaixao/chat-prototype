package com.majority.chatprototype.repository;
import com.majority.chatprototype.model.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>{
    
}
