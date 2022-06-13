package com.example.sinauspringlatihan.controller;

import com.example.sinauspringlatihan.Response;
import com.example.sinauspringlatihan.entity.Buku;
import com.example.sinauspringlatihan.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/book")
public class BookController {
    @Autowired
    BookService bookService;

    @GetMapping("/getdatabook")
    public Response findAll() {
        return new Response(bookService.findAlldata(), "berhasil", HttpStatus.OK);

    }

    @PostMapping("/savedatabook")
    public Buku save(@RequestBody Buku buku){
        return bookService.save(buku);
    }
}
