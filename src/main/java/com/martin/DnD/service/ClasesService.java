package com.martin.DnD.service;

import com.martin.DnD.Model.Clases;
import com.martin.DnD.Repository.ClaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClasesService {

    @Autowired
    private ClaseRepository claseRepository;

    public List<Clases> getClases(){
        return claseRepository.findAll();
    }
}
