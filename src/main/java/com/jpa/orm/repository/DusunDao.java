package com.jpa.orm.repository;

import com.jpa.orm.domain.Desa;
import com.jpa.orm.domain.Dusun;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DusunDao extends JpaRepository<Dusun, Integer> {
}
