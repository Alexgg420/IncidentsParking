package com.dam.proyects.demo.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.dam.proyects.demo.model.Incident;

@Service
public class IncidentsServiceImpl implements IncidentsService{
    @Override
    public List<Incident> getAll(){
        List<Incident> incidents = new ArrayList<>();
        incidents.add(new Incident(1, "Pomo Roto"));
        incidents.add(new Incident(2, "Puerta Rota"));
        return incidents;
    }
}
