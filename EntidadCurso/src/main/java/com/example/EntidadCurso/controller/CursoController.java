package com.example.EntidadCurso.controller;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import com.example.EntidadCurso.model.Curso;

@RestController
@RequestMapping("/cursos")
public class CursoController {

    ArrayList<Curso> lista = new ArrayList<>();

    
    @GetMapping
    public ArrayList<Curso> listar() {
        return lista;
    }

    
    @PostMapping
    public Curso crear(@RequestBody Curso curso) {
        lista.add(curso);
        return curso;
    }
}
