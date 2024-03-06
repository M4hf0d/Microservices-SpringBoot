package com.nilesat.msbourse.rep;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nilesat.msbourse.entities.Virement;

public interface VirementRep extends JpaRepository<Virement, Long> {

}