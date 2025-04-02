package com.example.bookMyShow.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;
@Getter
@Setter
public class TicketResponseDTO {
    private double totalAmount;
    private LocalDateTime timeOfShow;
    private String movieName;
    private String auditoriumName;
    List<String> seatNumbers;

}
