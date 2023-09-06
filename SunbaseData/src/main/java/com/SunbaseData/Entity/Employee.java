package com.SunbaseData.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Employee")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Setter
@Getter
public class Employee {
    @Id
    @Column(name = "Employee_id", length = 45)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int EmployeeID;

    @Column(name = "First_name", length = 255, nullable = false)
    private String first_name;

    @Column(name = "Last_name", length = 255, nullable = false)
    private String last_name;

    @Column(name = "Phone_num", length = 10, nullable = false)
    private int Phone_number;

    @Column(name = "Street", length = 255, nullable = false)
    private String street;

    @Column(name = "City", length = 255, nullable = false)
    private String City;

    @Column(name = "Address", length = 255, nullable = false)
    private String Address;

    @Column(name = "Email", length = 255, nullable = false)
    private String Email;

    @Column(name = "Password", length = 255, nullable = false)
    private String Password;


}

