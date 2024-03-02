package com.nilesat.msscholarite.proxy;

import com.nilesat.msscholarite.model.Formation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "ms-formation", url = "localhost:8081")
public interface FormationProxy {
    @GetMapping("formation/{id}")
    public Formation getFormation(
            @PathVariable("id") Long idf);

}