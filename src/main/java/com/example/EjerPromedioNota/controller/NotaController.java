package com.example.EjerPromedioNota.controller;

import com.example.EjerPromedioNota.service.IMateriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotaController {
    
    private final IMateriaService mateService;

    @Autowired
    public NotaController(IMateriaService mateService) {
        this.mateService = mateService;
    }
    
    
    @GetMapping("/IngresarNota")
    public String sacarPromedio(@RequestParam double notaA,
                                @RequestParam double notaB,
                                @RequestParam double notaC){
        
        double promedioNota = mateService.sacarPromedioNota(notaA, notaB, notaC);
        
        return "El promedio total de las 3 notas que ingresaste es: " + promedioNota;
    }
    
}
