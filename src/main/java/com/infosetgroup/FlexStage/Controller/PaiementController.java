package com.infosetgroup.FlexStage.Controller;

import com.infosetgroup.FlexStage.Entity.Paiement;
import com.infosetgroup.FlexStage.Repository.PaiementRepository;
import com.infosetgroup.FlexStage.Service.PaiementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/paiement")
public class PaiementController {
    @Autowired
    private PaiementRepository paiementRepository;

    private final PaiementService paiementService;
    @Autowired
    public PaiementController(PaiementService paiementService) {
        this.paiementService = paiementService;
    }

    @GetMapping(path = "/getAll")
    private @ResponseBody
    ResponseEntity <Iterable<Paiement>> prendreToutPaiement(){
        try {
            Iterable<Paiement> paiements = new ArrayList<>();
            paiements=paiementRepository.findAll();
            return new ResponseEntity<>(paiements, HttpStatus.OK);
        }catch (Exception e)
        {
            throw new IllegalStateException(e);
        }
    }

    @GetMapping(path = "/test")
    public List<Paiement> getPaiement(Paiement paiement)
    {
        return paiementService.getPaiement();
    }
    @PostMapping("/payer")
    public void payer(@RequestBody Paiement paiement)
    {
        paiementService.effectuerPaiement(paiement);
    }
    // prend le paiement par id
    private Paiement paiement;
    @GetMapping("/{id}")
    public Paiement getPaiementById(@PathVariable long id) {

        return
                        getPaiement(paiement)
                        .stream()
                        .filter(element -> element.getId() == id)
                        .findFirst()
                        .orElseThrow();
    }
//    @DeleteMapping("/delete/{id}")
//    public void delete(@PathVariable("id") Integer id){
//        paiementService.suppression(id);
//    }
}
