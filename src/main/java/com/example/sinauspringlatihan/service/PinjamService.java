package com.example.sinauspringlatihan.service;


import com.example.sinauspringlatihan.entity.Pinjam;
import com.example.sinauspringlatihan.repository.PinjamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PinjamService {

    @Autowired
    PinjamRepository pinjamRepository;

    public List<Pinjam> findAlldata(){return pinjamRepository.findAll();}

    public Pinjam save(Pinjam param){
        Pinjam pinjam = pinjamRepository.save(param);
        return pinjam;
    }

}
