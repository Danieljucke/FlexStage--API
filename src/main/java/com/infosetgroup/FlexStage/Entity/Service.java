package com.infosetgroup.FlexStage.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter // permet de créer les getters pour toutes les variables que l'on aura dans notre classe
@Setter // permet de créer les setters pour toutes les variables que l'on aura dans notre classe
@AllArgsConstructor // permet de créer les constructeurs
@NoArgsConstructor // permet de créer les constructeurs empty
@Entity // permet de dire que la classe que l'on implemente est une entité
public class Service {
    @Id // permet de dire que la variable id est une clé primaire
    private int id;
    private String nom_service;
    private String code_service;
}
