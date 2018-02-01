package com.jpa.orm.repository;

import com.jpa.orm.domain.Desa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DesaDao extends JpaRepository<Desa, Integer>{
}
