package com.jpa.orm.repository;

import com.jpa.orm.domain.Kecamatan;
import com.jpa.orm.domain.Kota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface KecamatanDao extends JpaRepository<Kecamatan, Integer> {
//    List<Kecamatan> findByKota(Kota kota);

}
