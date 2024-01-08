package com.dam.proyects.demo.model;

public class Incident {
    private int id;
    private String description;

    public Incident (int id, String description){
        this.id = id;
        this.description = description;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getDesc(){
        return description;
    }
    public void setDesc(String desc){
        this.description = desc;
    }
}
