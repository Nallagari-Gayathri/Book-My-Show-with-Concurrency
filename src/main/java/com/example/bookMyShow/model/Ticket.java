package com.example.bookMyShow.model;

import com.example.bookMyShow.model.constants.BaseModel;
import com.example.bookMyShow.model.constants.TicketStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Entity
public class Ticket extends BaseModel {
    private Double Amount;
    private LocalDateTime movieBookingTime;
    @Enumerated(EnumType.STRING)
    private TicketStatus ticketStatus;
    @ManyToOne
    private Show show;
    @ManyToMany
    private List<ShowSeat> showSeats;
}
/*
 Show Ticket
 1    M
 1      1
 Ticket ShowSeat
 1       M
 M        1 (if cancellation is allowed)
 */
