package com.example.sinauspringlatihan.service;


import com.example.sinauspringlatihan.entity.Buku;
import com.example.sinauspringlatihan.repository.BukuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    BukuRepository bukuRepository;

    public List <Buku> findAlldata(){ return bukuRepository.findAll(); }

    public Buku save (Buku param){
        Buku buku = bukuRepository.save(param);
        return buku;
    }
}
