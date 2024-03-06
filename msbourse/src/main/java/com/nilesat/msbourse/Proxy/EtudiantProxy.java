package com.nilesat.msbourse.Proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import com.nilesat.msbourse.entities.Etudiant;

@FeignClient(name = "ms-scholarite", url = "localhost:8082")
public interface EtudiantProxy {
    @GetMapping("etudiants/{id}")
    public Etudiant getEtudiant(
            @PathVariable("id") Long idf);
}
