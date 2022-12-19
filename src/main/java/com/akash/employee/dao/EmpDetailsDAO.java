package com.akash.employee.dao;

import com.akash.employee.model.EmpDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpDetailsDAO extends JpaRepository<EmpDetails, Integer> {
}
