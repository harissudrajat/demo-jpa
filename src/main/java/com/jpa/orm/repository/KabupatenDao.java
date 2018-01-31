package com.jpa.orm.repository;

import com.jpa.orm.domain.Kabupaten;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface KabupatenDao extends JpaRepository<Kabupaten, Integer>{

    List<Kabupaten> findByNama(String nama);
}
