package com.infosetgroup.FlexStage.Entity;

import com.infosetgroup.FlexStage.Repository.PaiementRepository;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Table(name = "paiement")
@Entity
public class Paiement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "montant", nullable = false)
    private Double montant;

    @Column(name = "mode_paiement", nullable = false, length = 10)
    private String modePaiement;

    @Column(name = "date_paiement", nullable = false)
    private LocalDate datePaiement;

    public LocalDate getDatePaiement() {
        return datePaiement;
    }

    public void setDatePaiement(LocalDate datePaiement) {
        this.datePaiement = datePaiement;
    }

    public String getModePaiement() {
        return modePaiement;
    }

    public void setModePaiement(String modePaiement) {
        this.modePaiement = modePaiement;
    }

    public Double getMontant() {
        return montant;
    }

    public void setMontant(Double montant) {
        this.montant = montant;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}