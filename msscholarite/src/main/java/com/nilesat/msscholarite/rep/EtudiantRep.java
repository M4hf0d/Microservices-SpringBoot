package com.nilesat.msscholarite.rep;

import org.springframework.data.jpa.repository.JpaRepository;
import com.nilesat.msscholarite.entities.Etudiant;

public interface EtudiantRep extends JpaRepository<Etudiant, Long> {

}
