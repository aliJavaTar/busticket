package com.maktab.busticket.service;


import com.maktab.busticket.entity.Ticket;

import java.util.List;

public interface TicketService {
    void addTicket(Ticket Ticket);

    void delete(Ticket ticket);

    List<Ticket> showAllTicket();


}
