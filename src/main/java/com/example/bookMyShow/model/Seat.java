package com.example.bookMyShow.model;

import com.example.bookMyShow.model.constants.BaseModel;
import com.example.bookMyShow.model.constants.SeatType;
import com.example.bookMyShow.model.constants.Status;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Seat extends BaseModel {
    private int seatNumber;
    @Enumerated(EnumType.STRING)
    private SeatType seatType;
    private Status status;

}
