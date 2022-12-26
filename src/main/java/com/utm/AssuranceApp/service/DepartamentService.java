package com.utm.AssuranceApp.service;

import java.util.List;

import com.utm.AssuranceApp.entity.Departament;
import com.utm.AssuranceApp.entity.DepartamentDetails;


public interface DepartamentService {
    List<Departament> findAllDepartments();

    Departament findById(Integer id);

    void save(Departament departament);

    void update(Integer  id, Departament departament);

    void delete(Integer id);
}
