package com.dam.proyects.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import com.dam.proyects.demo.model.Incident;
import com.dam.proyects.demo.service.IncidentsService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class IncidentsController {
    
    private IncidentsService service;

    public IncidentsController(IncidentsService service){
        this.service = service;
    }

    @GetMapping("incidents")
    public List<Incident> GetAllIncidents(){
        return service.getAll();
    }
}
