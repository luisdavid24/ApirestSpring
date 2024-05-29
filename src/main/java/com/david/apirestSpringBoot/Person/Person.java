package com.david.apirestSpringBoot.Person;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
@Entity
public class Person {
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;


}
