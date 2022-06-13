package com.example.sinauspringlatihan.entity;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "Pinjam")
public class Pinjam {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id_pinjam;

    @ManyToOne
    private Buku buku;

    @ManyToOne
    private Anggota anggota;


    @Temporal(TemporalType.DATE)
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date tgl_Pinjam;

    @Temporal(TemporalType.DATE)
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date tgl_Kembali;

}
