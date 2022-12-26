package com.utm.AssuranceApp.repository;

import com.utm.AssuranceApp.entity.Company;
import com.utm.AssuranceApp.entity.CompanyDetails;
import java.util.List;

public interface CompanyRepository {

    List<Company> findAllCompanies();

    CompanyDetails findById(Integer id);

    void save(Company company);

    void update(Integer id, Company company);

    void delete(Integer id);
    boolean companyExist(Integer id);
}
