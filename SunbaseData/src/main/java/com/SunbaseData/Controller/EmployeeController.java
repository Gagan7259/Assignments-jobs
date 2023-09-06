package com.SunbaseData.Controller;

import com.SunbaseData.DTO.EmployeeDTO;
import com.SunbaseData.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("api/v1/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
@PostMapping("add")
    public String saveEmployee(@RequestBody EmployeeDTO employeeDTO) {
        String createEmp = employeeService.CreateEmployee(employeeDTO);
        return createEmp;
    }
}
