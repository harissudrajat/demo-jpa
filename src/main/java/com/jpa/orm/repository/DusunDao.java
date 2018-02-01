package com.jpa.orm.repository;

import com.jpa.orm.domain.Dusun;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DusunDao extends JpaRepository<Dusun, Integer> {
}
