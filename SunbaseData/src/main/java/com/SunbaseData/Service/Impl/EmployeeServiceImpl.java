package com.SunbaseData.Service.Impl;

import com.SunbaseData.DTO.EmployeeDTO;
import com.SunbaseData.Entity.Employee;
import com.SunbaseData.Repository.EmployeeRepository;
import com.SunbaseData.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public String CreateEmployee(EmployeeDTO employeeDTO) {
        Employee employee = new Employee(employeeDTO.getEmployeeID(),
                employeeDTO.getFirst_name(), employeeDTO.getLast_name(),
                employeeDTO.getPhone_number(), employeeDTO.getStreet(),
                employeeDTO.getCity(), employeeDTO.getAddress(), employeeDTO.getEmail(),
                this.passwordEncoder.encode(employeeDTO.getPassword()));
        employeeRepository.save(employee);
        return employee.getFirst_name();
    }
}
