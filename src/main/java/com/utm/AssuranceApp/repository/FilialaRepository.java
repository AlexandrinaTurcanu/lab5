package com.utm.AssuranceApp.repository;

import com.utm.AssuranceApp.entity.Filiala;
import com.utm.AssuranceApp.entity.FilialaDetails;
import java.util.List;

public interface FilialaRepository {
    List<Filiala> findAllBranches();

    Filiala findById(Integer id);

    void save(Filiala filiala);

    void update(Integer id, Filiala filiala);

    void delete(Integer id);

    boolean filialaExist(Integer id);
}
