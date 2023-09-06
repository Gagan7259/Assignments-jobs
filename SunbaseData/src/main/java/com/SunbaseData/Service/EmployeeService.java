package com.SunbaseData.Service;

import com.SunbaseData.DTO.EmployeeDTO;
import org.springframework.stereotype.Service;

@Service
public interface EmployeeService {
    String CreateEmployee(EmployeeDTO employeeDTO);
}
