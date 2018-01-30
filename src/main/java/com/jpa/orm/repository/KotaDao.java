package com.jpa.orm.repository;

import com.jpa.orm.domain.Kota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KotaDao extends JpaRepository<Kota, Integer> {
}
