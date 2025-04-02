package com.example.bookMyShow.service;

import com.example.bookMyShow.exception.ShowSeatAlreadyBookedException;
import com.example.bookMyShow.model.ShowSeat;
import com.example.bookMyShow.model.Ticket;
import com.example.bookMyShow.model.constants.ShowSeatStatus;
import com.example.bookMyShow.repository.ShowSeatRepository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import java.util.List;

@Service
public class TicketServiceImpl implements TicketService {
    @Autowired
    private ShowSeatRepository showSeatRepository;
    @Override
    @Transactional(isolation = Isolation.SERIALIZABLE)
    public Ticket bookTicket(List<Integer> showSeatIds, int userId) throws ShowSeatAlreadyBookedException {
        //check if any one of the ticket is unavailable we will not do booking
        List<ShowSeat> showSeats = showSeatRepository.findAllById(showSeatIds);
        for(ShowSeat showSeat : showSeats){
            if(!showSeat.getShowSeatStatus().equals(ShowSeatStatus.AVAILABLE)){
                throw new ShowSeatAlreadyBookedException("Show Seat is not available");
            }
        }
        for(ShowSeat seat : showSeats){
            seat.setShowSeatStatus(ShowSeatStatus.LOCKED);
        }
        showSeatRepository.saveAll(showSeats);
        return new Ticket();
    }
}
