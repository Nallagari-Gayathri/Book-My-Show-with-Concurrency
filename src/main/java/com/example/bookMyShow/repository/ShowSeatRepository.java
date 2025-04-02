package com.example.bookMyShow.repository;

import com.example.bookMyShow.model.ShowSeat;
import jakarta.persistence.LockModeType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;

import java.util.List;

public interface ShowSeatRepository extends JpaRepository<ShowSeat, Integer> {
    @Lock(LockModeType.PESSIMISTIC_WRITE)
    void saveAll(List<ShowSeat> showSeats);
}
