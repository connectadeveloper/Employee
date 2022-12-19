package com.akash.employee.controller;

import com.akash.employee.model.EmpDetails;
import com.akash.employee.service.EmpDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/emp")
public class EmpDetailsCtrl {

    @Autowired
    private EmpDetailsService empDetailsService;

    @GetMapping("/details")
    public List<EmpDetails> getAllEmp (){
        return empDetailsService.getAll();
    }

}
