package com.nilesat.msscholarite.controller;

import com.nilesat.msscholarite.entities.Etudiant;
import com.nilesat.msscholarite.rep.EtudiantRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class EtudiantController {
    @Autowired
    private EtudiantRep etudiantRep;

    @GetMapping("/etudiants/all")
    public List<Etudiant> getAllEtudiants() {
        return etudiantRep.findAll();
    }
    // http://localhost:8088/api/etudiants/all

    @GetMapping("/etudiants/{id}")
    public Etudiant getEtudiantById(@PathVariable("id") Long IdEtudiant) {
        return etudiantRep.findById(IdEtudiant).get();
    }
    // http://localhost:8088/api/etudiants/3

    @GetMapping("/etudiants")
    public Etudiant getEtudiantById2(@RequestParam("id") Long IdEtudiant) {
        return etudiantRep.findById(IdEtudiant).get();
    }
    // http://localhost:8088/api/etudiants?id=3

    // @RequestMapping(value="/etudiants/{id}", method= {RequestMethod.GET,
    // RequestMethod.POST})
    // public Etudiant getEtudiantById_v2(@PathVariable("id") Long IdEtudiant) {
    // return etudiantRep.findById(IdEtudiant).get();
    // }

    @PostMapping("/etudiants/add")
    public Etudiant createEtudiant(@RequestBody Etudiant etudiant) {
        return etudiantRep.save(etudiant);
    }

    @PutMapping("/etudiants/update/{id}")
    public Etudiant updateEtudiant(@PathVariable(value = "id") Long IdEtudiant, @RequestBody Etudiant etudiant) {
        if (etudiantRep.findById(IdEtudiant).isPresent()) {
            etudiant.setIdEtudiant(IdEtudiant);
            return etudiantRep.save(etudiant);
        }
        return null;
    }

    @DeleteMapping("/etudiants/delete/{id}")
    public void DeleteEtudiant(@PathVariable(value = "id") Long IdEtudiant) {
        if (etudiantRep.findById(IdEtudiant).isPresent()) {
            etudiantRep.deleteById(IdEtudiant);
        }
    }

}