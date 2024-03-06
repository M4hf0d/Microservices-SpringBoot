package com.nilesat.msscholarite.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

// import com.nilesat.msformartion.rep.FormationRep;
import com.nilesat.msscholarite.model.Formation;
import com.nilesat.msscholarite.rep.EtudiantRep;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("api")
public class FormationController {
    // @Autowired
    // private FormationRep formationRep;

    // @GetMapping("/formations/duree/{duree}")
    // public List<Formation> getFormationsByDuree(@PathVariable("duree") int duree)
    // {
    // return formationRep.findByDureeNot(duree);
    // }

}
