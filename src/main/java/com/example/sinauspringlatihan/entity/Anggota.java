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
@Table(name = "anggota")
public class Anggota {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;


    private String nama;


    private String alamat;


    private String no_telp;


    @Temporal(TemporalType.DATE)
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date tlg_lahir;


    private String jenis_kelamin;

    @OneToOne
    private Pinjam pinjam;


}
