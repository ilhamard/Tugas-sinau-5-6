package com.example.sinauspringlatihan.repository;

import com.example.sinauspringlatihan.entity.Buku;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BukuRepository extends JpaRepository<Buku, Integer> {
}
