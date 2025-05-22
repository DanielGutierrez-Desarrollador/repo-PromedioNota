package com.example.EjerPromedioNota.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Materia {
    
    private int id;
    private String nombreMateria;
    private double nota;

    public Materia() {
    }

    public Materia(int id, String nombreMateria, double nota) {
        this.id = id;
        this.nombreMateria = nombreMateria;
        this.nota = nota;
    }
    
}
