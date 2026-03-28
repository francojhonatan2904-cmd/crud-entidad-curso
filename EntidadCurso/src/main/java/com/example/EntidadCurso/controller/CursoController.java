package com.example.EntidadCurso.controller;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import com.example.EntidadCurso.model.Curso;

@RestController
@RequestMapping("/cursos")
public class CursoController {

    ArrayList<Curso> lista = new ArrayList<>();

    // GET
    @GetMapping
    public ArrayList<Curso> listar() {
        return lista;
    }

    // POST
    @PostMapping
    public Curso crear(@RequestBody Curso curso) {
        lista.add(curso);
        return curso;
    }
}