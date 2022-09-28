package com.infosetgroup.FlexStage.Controller;

import com.infosetgroup.FlexStage.Entity.Paiement;
import com.infosetgroup.FlexStage.Entity.Salle;
import com.infosetgroup.FlexStage.Repository.SalleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/salle")
public class SalleController {

    @Autowired
    private SalleRepository salleRepository;
    public List<Salle> getRoom(){
        return (List<Salle>)salleRepository.findAll();
    }

    @GetMapping(path = "/getAll")
    ResponseEntity <Iterable<Salle>> getAllRoom (){
        try {
            Iterable<Salle> salles =new ArrayList<>();
            salles=salleRepository.findAll();
            return new ResponseEntity<>(salles, HttpStatus.OK);
        }catch (Exception exception)
        {
            throw new IllegalStateException(""+exception);
        }
    }

    @GetMapping(path = "/getSalle/{id}")
    public Salle showSalleById(@PathVariable("id") Integer id){
        return getRoom()
                .stream()
                .filter(element->element.getId() == id)
                .findFirst()
                .orElseThrow();
    }
}
