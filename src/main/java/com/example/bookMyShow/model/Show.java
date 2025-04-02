package com.example.bookMyShow.model;

import com.example.bookMyShow.model.constants.BaseModel;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;
import java.util.List;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class Show extends BaseModel {
    @ManyToOne
    private Auditorium auditorium;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    @ManyToOne
    private Movie movie;
    @OneToMany
    private List<ShowSeat> showSeats;
}
/*
 Show Movie
 1      1
 M      1
 */
