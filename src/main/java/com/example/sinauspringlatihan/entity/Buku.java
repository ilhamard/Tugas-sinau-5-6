package com.example.sinauspringlatihan.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@NoArgsConstructor
@Setter
@Getter
@Table(name = "buku")
public class Buku {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Integer id_buku;


    private String judul;


    private String penulis;


    private String penerbit;


    @Temporal(TemporalType.DATE)
    @JsonFormat(pattern = "yyyy")
    private Date tahun_terbit;


    private String jenis_buku;

    @OneToOne
    private Pinjam pinjam;
}
