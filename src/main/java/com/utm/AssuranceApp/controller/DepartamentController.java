package com.utm.AssuranceApp.controller;

import com.utm.AssuranceApp.entity.Departament;
import com.utm.AssuranceApp.entity.DepartamentDetails;
import com.utm.AssuranceApp.service.DepartamentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("departament")
public class DepartamentController {

    @Autowired
    private DepartamentService departamentService;

    @GetMapping
    public List<Departament> getAll() {
        return departamentService.findAllDepartments();
    }

    @GetMapping("/{id}")
    public DepartamentDetails getById(@PathVariable Integer id) {
        return departamentService.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void save(@RequestBody Departament departament) {
        departamentService.save(departament);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable Integer id, @RequestBody Departament departament) {
        departamentService.update(id, departament);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        departamentService.delete(id);
    }
}
