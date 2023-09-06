package com.SunbaseData.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class EmployeeDTO {
    private int EmployeeID;
    private String first_name;
    private String last_name;
    private int Phone_number;
    private String street;
    private String City;
    private String Address;
    private String Email;
    private String Password;

    @Override
    public String toString() {
        return "EmployeeDTO{" +
                "EmployeeID=" + EmployeeID +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", Phone_number=" + Phone_number +
                ", street='" + street + '\'' +
                ", City='" + City + '\'' +
                ", Address='" + Address + '\'' +
                ", Email='" + Email + '\'' +
                ", Password='" + Password + '\'' +
                '}';
    }
}
