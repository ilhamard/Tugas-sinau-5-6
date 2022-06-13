package com.example.sinauspringlatihan.controller;



import com.example.sinauspringlatihan.entity.Anggota;
import com.example.sinauspringlatihan.service.UserService;
import lombok.Getter;
import com.example.sinauspringlatihan.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.sql.ResultSet;
import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("getdata")
    public Response findAll() {
        return new Response(userService.findAllData(),"berhasil",HttpStatus.OK);

    }
    @PostMapping("savedata")
    public Anggota SaveUser(@RequestBody Anggota anggota){
        return userService.saveUser(anggota);
    }
}
