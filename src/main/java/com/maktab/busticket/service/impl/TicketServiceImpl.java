package com.maktab.busticket.service.impl;

import com.maktab.busticket.entity.Ticket;
import com.maktab.busticket.repository.TicketRepository;
import com.maktab.busticket.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketServiceImpl implements TicketService {
    private TicketRepository ticketRepository;
    @Autowired
    public TicketServiceImpl(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }


    @Override
    public void addTicket(Ticket ticket) {
        ticketRepository.addTicket(ticket);
    }


    @Override
    public List<Ticket> showAllTicket() {
        return ticketRepository.showAllTicket();
    }

    @Override
    public void delete(Ticket ticket) {
        ticketRepository.delete(ticket);
    }
}
