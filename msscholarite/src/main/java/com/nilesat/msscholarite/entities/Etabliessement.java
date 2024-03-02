package com.nilesat.msscholarite.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Etabliessement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Idetabilissement;

    @Column(nullable = false)
    private String nom;

    @OneToMany(mappedBy = "etablissement")
    private List<Etudiant> etudiants;

}
