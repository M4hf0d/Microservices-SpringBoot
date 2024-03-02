package com.nilesat.msformartion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nilesat.msformartion.entities.Formation;
import com.nilesat.msformartion.rep.FormationRep;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class MsformartionApplication implements CommandLineRunner {

    @Autowired
    FormationRep formationRep;

    public static void main(String[] args) {
        SpringApplication.run(MsformartionApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Formation formation1 = new Formation(null, "Clarence Series 1", 2);
        Formation formation2 = new Formation(null, "Clarence Series 2", 50);
        Formation formation3 = new Formation(null, "Clarence Series 3", 53);
        Formation formation4 = new Formation(null, "Clarence Series 4", 22);
        Formation formation5 = new Formation(null, "Clarence Series 5", 9);
        formationRep.saveAll(Arrays.asList(formation1, formation2, formation3,
                formation4, formation5));
    }

}
