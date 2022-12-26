package com.utm.AssuranceApp.service.impl;

import com.utm.AssuranceApp.entity.Company;
import com.utm.AssuranceApp.entity.CompanyDetails;
import com.utm.AssuranceApp.exception.AlreadyExistException;
import com.utm.AssuranceApp.exception.NotFoundException;
import com.utm.AssuranceApp.repository.CompanyRepository;
import com.utm.AssuranceApp.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

   @Service
public class CompanyServiceImpl implements CompanyService {

       @Autowired
    private CompanyRepository companyRepository;

    @Override
    public List<Company> findAllCompanies() {
        return companyRepository.findAllCompanies();
    }

    @Override
    public Company findById(Integer id) {
        if(!companyRepository.companyExist(id))
            throw new NotFoundException(
                    "Company with id = " + id + " not exist");

        return companyRepository.findById(id);
    }

    @Override
    public void save(Company company) {
        if(companyRepository.companyExist(company.getId()))
            throw new AlreadyExistException(
                    "Company with id = "+ company.getId() + " already exist");

        companyRepository.save(company);
    }

    @Override
    public void update(Integer id, Company company) {
        companyRepository.update(id,company);
    }

    @Override
    public void delete(Integer id) {
        companyRepository.delete(id);
    }
}
