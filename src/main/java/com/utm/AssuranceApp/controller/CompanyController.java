package com.utm.AssuranceApp.controller;

import com.utm.AssuranceApp.entity.Company;
import com.utm.AssuranceApp.entity.CompanyDetails;
import com.utm.AssuranceApp.repository.CompanyRepository;
import com.utm.AssuranceApp.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("company")
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @GetMapping
    public List<Company> getAll() {
        return companyService.findAllCompanies();
    }

    @GetMapping("/{id}")
    public Company getById(@PathVariable Integer id) {
        return companyService.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void save(@RequestBody Company company) {
        companyService.save(company);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable Integer id, @RequestBody Company company) {
        companyService.update(id, company);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        companyService.delete(id);
    }
}
