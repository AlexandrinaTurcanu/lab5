package com.utm.AssuranceApp.service.impl;

import com.utm.AssuranceApp.entity.Filiala;
import com.utm.AssuranceApp.entity.FilialaDetails;
import com.utm.AssuranceApp.exception.AlreadyExistException;
import com.utm.AssuranceApp.exception.NotFoundException;
import com.utm.AssuranceApp.repository.FilialaRepository;
import com.utm.AssuranceApp.service.FilialaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service

public class FilialaServiceImpl implements FilialaService {

    @Autowired
    private FilialaRepository filialaRepository;

    @Override
    public List<Filiala> findAllBranches() {
        return filialaRepository.findAllBranches();
    }

    @Override
    public FilialaDetails findById(Integer id) {
        if(!filialaRepository.filialaExist(id))
            throw new NotFoundException(
                    "Filiala with id = " + id + " not exist");

        return filialaRepository.findById(id);
    }

    @Override
    public void save(Filiala filiala) {
        if(filialaRepository.filialaExist(filiala.getId()))
            throw new AlreadyExistException(
                    "Filiala with id = "+ filiala.getId() + " already exist");

        filialaRepository.save(filiala);
    }

    @Override
    public void update(Integer id, Filiala filiala) {
        filialaRepository.update(id,filiala);
    }

    @Override
    public void delete(Integer id) {
        filialaRepository.delete(id);
    }
}
