package com.example.sinauspringlatihan.controller;


import com.example.sinauspringlatihan.Response;
import com.example.sinauspringlatihan.entity.Buku;
import com.example.sinauspringlatihan.entity.Pinjam;
import com.example.sinauspringlatihan.service.PinjamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "pinjam")
public class PinjamController {

    @Autowired
    PinjamService pinjamService;

    @GetMapping(value = "getpinjam")
    public Response findAll(){
        return new Response(pinjamService.findAlldata(),"berhasil",HttpStatus.OK);
    }
    @PostMapping("/savedatapinjam")
    public Pinjam save(@RequestBody Pinjam pinjam){
        return pinjamService.save(pinjam);
    }
}

