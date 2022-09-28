package com.infosetgroup.FlexStage.Entity;

import javax.persistence.*;
import java.time.LocalDate;

@Table(name = "reservation", indexes = {
        @Index(name = "IDX_42C849552A4C4478", columnList = "paiement_id"),
        @Index(name = "IDX_42C84955A76ED395", columnList = "user_id")
})
@Entity
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "paiement_id")
    private Paiement paiement;

    @Column(name = "date_arriver")
    private LocalDate dateArriver;

    @Column(name = "date_fin")
    private LocalDate dateFin;

    @Column(name = "motif", nullable = false)
    private String motif;

    @ManyToOne(optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getMotif() {
        return motif;
    }

    public void setMotif(String motif) {
        this.motif = motif;
    }

    public LocalDate getDateFin() {
        return dateFin;
    }

    public void setDateFin(LocalDate dateFin) {
        this.dateFin = dateFin;
    }

    public LocalDate getDateArriver() {
        return dateArriver;
    }

    public void setDateArriver(LocalDate dateArriver) {
        this.dateArriver = dateArriver;
    }

    public Paiement getPaiement() {
        return paiement;
    }

    public void setPaiement(Paiement paiement) {
        this.paiement = paiement;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}