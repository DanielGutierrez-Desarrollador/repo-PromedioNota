package com.example.EjerPromedioNota.service;

import org.springframework.stereotype.Service;

@Service
public class MateriaService implements IMateriaService{

    @Override
    public double sacarPromedioNota(double notaA, double notaB, double notaC) {
        
        double sumaNota = notaA + notaB + notaC;
        double promedio = sumaNota / 3;
        
        return promedio;
    }
    
    
    
}
