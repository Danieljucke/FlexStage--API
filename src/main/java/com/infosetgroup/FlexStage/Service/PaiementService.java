package com.infosetgroup.FlexStage.Service;

import com.infosetgroup.FlexStage.Entity.Paiement;
import com.infosetgroup.FlexStage.Repository.PaiementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;
import java.util.Optional;

@Service
public class PaiementService {
    private final PaiementRepository paiementRepository;

    @Autowired
    public PaiementService(PaiementRepository paiementRepository) {
        this.paiementRepository = paiementRepository;
    }
    public List<Paiement> getPaiement(){
        return (List<Paiement>) paiementRepository.findAll();
    }

    public void test(Paiement paiement) {
        System.out.println(paiement);
    }


    public void suppression (Integer idPaiement)
    {
        boolean check = paiementRepository.existsById(idPaiement);
        if(!check){
            throw new IllegalStateException("paiement Empty");
        }
        paiementRepository.deleteById(idPaiement);
    }

}
