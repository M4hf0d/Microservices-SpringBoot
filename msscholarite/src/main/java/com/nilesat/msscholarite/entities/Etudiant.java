package com.nilesat.msscholarite.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdEtudiant;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Date birthDate;

    @Column(nullable = false)
    private Date dateInscription;

    @Column(nullable = false)
    private String promo;

    @Column(nullable = false)
    private Long idFormation;

    @ManyToOne
    @JoinColumn(name = "Id_Etablissement")
    private Etabliessement etablissement;

}