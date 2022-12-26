package com.utm.AssuranceApp.controller;

import com.utm.AssuranceApp.entity.Filiala;
import com.utm.AssuranceApp.entity.FilialaDetails;
import com.utm.AssuranceApp.repository.FilialaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("filiala")

public class FilialaController {

    @Autowired
    private FilialaRepository filialaRepository;

    @GetMapping
    public List<Filiala> getAll() {
        return filialaRepository.findAllBranches();
    }

    @GetMapping("/{id}")
    public FilialaDetails getById(@PathVariable Integer id) {
        return filialaRepository.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void save(@RequestBody Filiala filiala) {
        filialaRepository.save(filiala);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable Integer id, @RequestBody Filiala filiala) {
        filialaRepository.update(id, filiala);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        filialaRepository.delete(id);
    }
}
