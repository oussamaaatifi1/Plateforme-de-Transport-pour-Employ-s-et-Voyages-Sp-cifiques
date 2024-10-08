package com.platformtrasnport.platformtransport.repository;

import com.platformtrasnport.platformtransport.model.Employe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeRepository extends JpaRepository<Employe, Long> {
}