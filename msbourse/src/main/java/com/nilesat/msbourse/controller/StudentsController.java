package com.nilesat.msbourse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import com.nilesat.msbourse.entities.Etudiant;
import com.nilesat.msbourse.rep.EtudiantRep;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class StudentsController {
    @Autowired
    private EtudiantRep etudiantRep;

    @GetMapping("/etudiants/ccp/{ccp}")
    public Etudiant getEtudiantById(@PathVariable("ccp") Long nCompteCCP) {
        return etudiantRep.findBynCompteCCP(nCompteCCP).get();
    }
}
