package com.utm.AssuranceApp.service;

import java.util.List;
import com.utm.AssuranceApp.entity.Company;
import com.utm.AssuranceApp.entity.CompanyDetails;
import com.utm.AssuranceApp.exception.AlreadyExistException;
import com.utm.AssuranceApp.exception.NotFoundException;
import com.utm.AssuranceApp.repository.CompanyRepository;
import com.utm.AssuranceApp.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public interface CompanyService {

    List<Company> findAllCompanies();

    CompanyDetails findById(Integer id);

    void save(Company company);

    void update(Integer  id, Company company);

    void delete(Integer id);
}
