package com.example.bookMyShow.model;

import com.example.bookMyShow.model.constants.BaseModel;
import com.example.bookMyShow.model.constants.PaymentService;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class Payment extends BaseModel {
    @Enumerated(EnumType.STRING)
    private PaymentService paymentService;
    private LocalDateTime paymentTime;
    private Double amount;
    private String referenceId;
    @ManyToOne
    private Ticket ticket;

}
/*
Ticket Payment
   1    M (including failed payments)
   1    1
 */
