package com.tarxsoft.ilaclistesi.repository;

import com.tarxsoft.ilaclistesi.entity.Drug;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DrugRepository extends JpaRepository<Drug, Long> {

}
