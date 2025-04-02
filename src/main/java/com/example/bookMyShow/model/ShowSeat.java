package com.example.bookMyShow.model;

import com.example.bookMyShow.model.constants.BaseModel;
import com.example.bookMyShow.model.constants.ShowSeatStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.EnumType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ShowSeat extends BaseModel {
    private int price;
    @ManyToOne
    private Show show;
    @ManyToOne
    private Seat seat;

    @Enumerated(EnumType.STRING)
    private ShowSeatStatus showSeatStatus;
}
/*
   Seat   ShowSeat
   1      M
   1       1
   Show ShowSeat
    1    M
 */
