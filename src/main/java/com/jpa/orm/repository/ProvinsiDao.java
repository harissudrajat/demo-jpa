package com.jpa.orm.repository;

import com.jpa.orm.domain.Provinsi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProvinsiDao extends JpaRepository<Provinsi, Integer> {

//    List<Provinsi> findById(Integer id);
}
