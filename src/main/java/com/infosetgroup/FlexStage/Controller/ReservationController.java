package com.infosetgroup.FlexStage.Controller;

import com.infosetgroup.FlexStage.Entity.Reservation;
import com.infosetgroup.FlexStage.Repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/reservation")
public class ReservationController {
    @Autowired
private ReservationRepository reservationRepository;

    public List<Reservation> listOfReservation (){
        return (List<Reservation>) reservationRepository.findAll();
    }

    @GetMapping("/getYourReservation/{id}")
    public Reservation checkReservation (@PathVariable("id") Integer id)
    {
        return listOfReservation()
                .stream()
                .filter(element->element.getId()== id)
                .findFirst()
                .orElseThrow(()-> new IllegalStateException("Aucune réservation trouvé !"));
    }
    @PostMapping("/reserver")
    public  Reservation reserverService (@RequestBody Reservation reservation){
        return reservationRepository.save(reservation);
    }
}
