package com.nilesat.msbourse.rep;

import org.springframework.data.jpa.repository.JpaRepository;
import com.nilesat.msbourse.entities.Etudiant;
import java.util.Optional;
import java.util.List;

public interface EtudiantRep extends JpaRepository<Etudiant, Long> {
    Optional<Etudiant> findBynCompteCCP(Long nCompteCCP);

    Optional<List> findBynCompteCCPGreaterThan(Long nCompteCCP);
}
