package com.example.spring_security.userRepository;

import com.example.spring_security.entityUser.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,String> {
}
