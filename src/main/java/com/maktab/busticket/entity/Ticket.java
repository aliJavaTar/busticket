package com.maktab.busticket.entity;

import com.maktab.busticket.entity.base.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.thymeleaf.standard.inline.StandardTextInliner;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.sql.Date;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = Customer.TABLE_NAME)
public class Ticket extends BaseEntity<Long> {
    protected final static String TABLE_NAME = "tickets";
    @ManyToOne()
    private Customer customer;
    private String goal;
    private String beginning;
    private Date move;
    private LocalDateTime hourMove;
    private long travelId;

}
