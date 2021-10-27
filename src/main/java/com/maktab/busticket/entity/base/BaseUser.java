package com.maktab.busticket.entity.base;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Inheritance;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Inheritance
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@NotBlank
@NotNull
public class BaseUser extends BaseEntity<Long> {
    private static final String USER_NAME = "username";
    private static final String PASSWORD = "password";
    private static final String EMAIL = "email";
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private int age;
    private String gender;

    @Column(name = EMAIL, nullable = false, unique = true)
    private String email;

    @Column(name = USER_NAME, nullable = false, unique = true)
    private String username;

    @Column(name = PASSWORD, nullable = false)
    private String password;
}
