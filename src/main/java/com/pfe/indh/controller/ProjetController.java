package com.pfe.indh.controller;


import com.pfe.indh.model.Projet;
import com.pfe.indh.repository.ProjetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/projet")
public class ProjetController {

    @Autowired
    ProjetRepository projetRepository;


    @GetMapping("/all")
    public Iterable<Projet> getAllProjets() {
        return projetRepository.findAll();
    }









}
