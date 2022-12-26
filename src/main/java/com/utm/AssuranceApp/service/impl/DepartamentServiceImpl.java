package com.utm.AssuranceApp.service.impl;

import com.utm.AssuranceApp.entity.Departament;
import com.utm.AssuranceApp.entity.DepartamentDetails;
import com.utm.AssuranceApp.exception.AlreadyExistException;
import com.utm.AssuranceApp.exception.NotFoundException;
import com.utm.AssuranceApp.repository.DepartamentRepository;
import com.utm.AssuranceApp.service.DepartamentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

    @Service
public class DepartamentServiceImpl implements DepartamentService {
    @Autowired
    private DepartamentRepository departamentRepository;

    @Override
    public List<Departament> findAllDepartments() {
        return departamentRepository.findAllDepartments();
    }

    @Override
    public DepartamentDetails findById(Integer id) {
        if(!departamentRepository.departamentExist(id))
            throw new NotFoundException(
                    "Departament with id = " + id + " not found");

        return departamentRepository.findById(id);
    }

    @Override
    public void save(Departament departament) {
        if(departamentRepository.departamentExist(departament.getId()))
            throw new AlreadyExistException(
                    "Departament with id = " + departament.getId() + " already exist");

        departamentRepository.save(departament);
    }

    @Override
    public void update(Integer id, Departament departament) {
        departamentRepository.update(id, departament);
    }

    @Override
    public void delete(Integer id) {
        departamentRepository.delete(id);
    }
}
