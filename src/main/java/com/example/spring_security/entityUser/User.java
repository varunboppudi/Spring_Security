package com.example.spring_security.entityUser;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@AllArgsConstructor

public class User {
    @Id
    private String username;
    private String password;
    private String role;
}
