package com.utm.AssuranceApp.service;

import java.util.List;
import com.utm.AssuranceApp.entity.Company;
import com.utm.AssuranceApp.entity.CompanyDetails;


public interface CompanyService {

    List<Company> findAllCompanies();

    CompanyDetails findById(Integer id);

    void save(Company company);

    void update(Integer  id, Company company);

    void delete(Integer id);
}
