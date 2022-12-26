package com.utm.AssuranceApp.service;

import java.util.List;

import com.utm.AssuranceApp.entity.Departament;
import com.utm.AssuranceApp.entity.DepartamentDetails;
import com.utm.AssuranceApp.exception.AlreadyExistException;
import com.utm.AssuranceApp.exception.NotFoundException;
import com.utm.AssuranceApp.repository.DepartamentRepository;
import com.utm.AssuranceApp.service.DepartamentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public interface DepartamentService {
    List<Departament> findAllDepartments();

    DepartamentDetails findById(Integer id);

    void save(Departament departament);

    void update(Integer  id, Departament departament);

    void delete(Integer id);
}
