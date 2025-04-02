package com.example.bookMyShow.controller;

import com.example.bookMyShow.dto.BookTicketRequestDTO;
import com.example.bookMyShow.dto.TicketResponseDTO;
import com.example.bookMyShow.exception.ShowSeatAlreadyBookedException;
import com.example.bookMyShow.model.Ticket;
import com.example.bookMyShow.service.TicketService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
public class TicketController {
    private TicketService ticketService;
    @PostMapping("/ticket")
    public ResponseEntity createTicket(@RequestBody BookTicketRequestDTO bookTicketRequestDTO) throws ShowSeatAlreadyBookedException {
        Ticket ticket = ticketService.bookTicket(bookTicketRequestDTO.getShowSeatIds(), bookTicketRequestDTO.getUserId());
        TicketResponseDTO resTicket = new TicketResponseDTO();
        resTicket.setMovieName("YEH JAWANI HAI DIWANI");
        resTicket.setSeatNumbers(List.of("A01", "A02", "A03", "A04", "A05"));
        resTicket.setAuditoriumName(("AUDI_01"));
        resTicket.setTotalAmount(400.0);
        resTicket.setTimeOfShow(LocalDateTime.now());

        return ResponseEntity.ok(ticket);
    }
}
