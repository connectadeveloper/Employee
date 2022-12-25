package com.akash.employee;

import com.akash.employee.dao.EmpDetailsDAO;
import com.akash.employee.model.EmpDetails;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = {"com.akash.employee"})
public class EmployeeApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmployeeApplication.class, args);
    }


    @Bean
    public CommandLineRunner insertRecord(EmpDetailsDAO empDetailsDAO){
        /*return args -> {
            EmpDetails empDetails = new EmpDetails();
            empDetails.setName("TestBean");
            empDetails.setPhone(1231231234L);
            empDetailsDAO.save(empDetails);
        };*/
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                EmpDetails empDetails = new EmpDetails();
                empDetails.setName("TestBean"+Math.random());
                empDetails.setPhone(1231231234L);
                empDetailsDAO.save(empDetails);
            }
        };
    }
}
