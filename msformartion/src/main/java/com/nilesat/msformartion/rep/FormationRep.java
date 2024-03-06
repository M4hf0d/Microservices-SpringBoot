package com.nilesat.msformartion.rep;

import com.nilesat.msformartion.entities.Formation;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.*;

public interface FormationRep extends JpaRepository<Formation, Long> {
    List<Formation> findByDureeNot(int duree);

    List<Formation> findAllByOrderByDureeDesc();
}
