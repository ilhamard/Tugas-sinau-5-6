package com.example.sinauspringlatihan.service;


import com.example.sinauspringlatihan.entity.Anggota;
import com.example.sinauspringlatihan.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

        public List<Anggota> findAllData(){
            return userRepository.findAll();
        }

        public Anggota saveUser(Anggota param){
            Anggota anggota = userRepository.save(param);
            return anggota;


        }
    }


