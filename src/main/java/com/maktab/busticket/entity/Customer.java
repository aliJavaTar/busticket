package com.maktab.busticket.entity;

import com.maktab.busticket.entity.base.BaseUser;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@NotBlank
@NotNull
@Table(name = Customer.TABLE_NAME)
public class Customer extends BaseUser {
    protected static final String TABLE_NAME = "customers";

    public Customer(String firstName, String lastName, String phoneNumber, int age, String gender,
                    String email, String username, String password, List<Ticket> ticket) {
        super(firstName, lastName, phoneNumber, age, gender, email, username, password);
        this.ticket = ticket;
    }

    public Customer(List<Ticket> ticket) {
        this.ticket = ticket;
    }

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<Ticket> ticket;

}
