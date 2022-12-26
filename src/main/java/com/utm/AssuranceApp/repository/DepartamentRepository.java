package com.utm.AssuranceApp.repository;

import com.utm.AssuranceApp.entity.Departament;
import com.utm.AssuranceApp.entity.DepartamentDetails;
import java.util.List;

public interface DepartamentRepository {

    List<Departament> findAllDepartments();

    DepartamentDetails findById(Integer id);

    void save(Departament departament);

    void update(Integer id, Departament departament);

    void delete(Integer id);

    boolean departamentExist(Integer id);
}
