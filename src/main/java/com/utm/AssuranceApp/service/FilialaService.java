package com.utm.AssuranceApp.service;

import com.utm.AssuranceApp.entity.Filiala;
import com.utm.AssuranceApp.entity.FilialaDetails;


import java.util.List;

public interface FilialaService {
    List<Filiala> findAllBranches();

    FilialaDetails findById(Integer id);

    void save(Filiala filiala);

    void update(Integer  id, Filiala filiala);

    void delete(Integer id);
}
