package com.example.bookMyShow.service;

import com.example.bookMyShow.exception.ShowSeatAlreadyBookedException;
import com.example.bookMyShow.model.Ticket;
import com.example.bookMyShow.model.User;

import java.util.List;
public interface TicketService {
    Ticket bookTicket(List<Integer> showSeatIds, int userId) throws ShowSeatAlreadyBookedException;
}
