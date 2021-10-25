package com.maktab.busticket.entity;

import com.maktab.busticket.entity.base.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = Customer.TABLE_NAME)
public class Customer extends BaseEntity<Long> {
    private static final String USER_NAME = "username";
    private static final String PASSWORD = "password";
    private static final String EMAIL = "email";
    protected static final String TABLE_NAME = "customers";

    private String firstName;
    private String lastName;
    private String phoneNumber;
    private int age;
    private String gender;
    private boolean admin;

    @Column(name = EMAIL, nullable = false, unique = true)
    private String email;

    @Column(name = USER_NAME, nullable = false, unique = true)
    private String username;

    @Column(name = PASSWORD, nullable = false)
    private String password;

    @OneToMany(mappedBy = "customer",cascade = CascadeType.ALL)
    private List<Ticket> ticket;

}
