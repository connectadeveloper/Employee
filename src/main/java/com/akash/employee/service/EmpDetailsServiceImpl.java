package com.akash.employee.service;

import com.akash.employee.dao.EmpDetailsDAO;
import com.akash.employee.model.EmpDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpDetailsServiceImpl implements EmpDetailsService{

    @Autowired
    private EmpDetailsDAO empDetailsDAO;

    @Override
    public List<EmpDetails> getAll() {
        return empDetailsDAO.findAll().stream().toList();
    }
}
