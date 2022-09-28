package com.infosetgroup.FlexStage.Entity;

import javax.persistence.*;

@Table(name = "categorie_salle")
@Entity
public class CategorieSalle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}