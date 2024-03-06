package com.nilesat.msbourse.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdEtudiant;

    @Column(nullable = false)
    private Long nCompteCCP;

    @Column(nullable = false)
    private Float SalaireParents;

    @Column(nullable = false)
    private Boolean SituationImpot;

    @OneToMany(mappedBy = "etudiant")
    private List<Virement> virements;
}