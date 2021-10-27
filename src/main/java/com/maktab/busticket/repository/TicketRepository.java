package com.maktab.busticket.repository;

import com.maktab.busticket.entity.Ticket;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface TicketRepository {
    void addTicket(Ticket ticket);
    List<Ticket> showAllTicket();
    void delete (Ticket ticket);
}
