package com.jpa.orm.repository;

import com.jpa.orm.domain.Provinsi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProvinsiDao extends JpaRepository<Provinsi, Integer> {
}
