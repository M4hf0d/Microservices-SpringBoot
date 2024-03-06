package com.nilesat.msbourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nilesat.msbourse.entities.Etudiant;
import com.nilesat.msbourse.rep.EtudiantRep;

@SpringBootApplication
public class MsbourseApplication implements CommandLineRunner {
    @Autowired
    EtudiantRep etudaintRep;

    public static void main(String[] args) {
        SpringApplication.run(MsbourseApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Etudiant etudiant = new Etudiant();
        etudiant.setNCompteCCP(1234567890L);
        etudiant.setSalaireParents(2500.0f);
        etudiant.setSituationImpot(true);

        // Save the etudiant object to the database
        etudaintRep.save(etudiant);

    }

}
