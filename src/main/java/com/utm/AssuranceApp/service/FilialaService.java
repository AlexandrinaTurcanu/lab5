package com.utm.AssuranceApp.service;

import com.utm.AssuranceApp.entity.Filiala;
import com.utm.AssuranceApp.entity.FilialaDetails;
import com.utm.AssuranceApp.exception.AlreadyExistException;
import com.utm.AssuranceApp.exception.NotFoundException;
import com.utm.AssuranceApp.repository.FilialaRepository;
import com.utm.AssuranceApp.service.FilialaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public interface FilialaService {
    List<Filiala> findAllBranches();

    FilialaDetails findById(Integer id);

    void save(Filiala filiala);

    void update(Integer  id, Filiala filiala);

    void delete(Integer id);
}
