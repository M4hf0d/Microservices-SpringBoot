package com.nilesat.msbourse.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Virement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idVirement;

    @Column()
    private Long montant;

    @Temporal(TemporalType.DATE)
    private Date dateVirement;

    @ManyToOne
    @JoinColumn(name = "IdEtudiant")
    private Etudiant etudiant;
}