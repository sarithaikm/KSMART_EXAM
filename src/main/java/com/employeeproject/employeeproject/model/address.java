package com.employeeproject.employeeproject.model;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;

import jakarta.persistence.*;

import java.util.Date;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tr_employeeaddress")

public class address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EmpaddressID")
    @NotNull
    private int addressid;

    @Column(name = "EmpID")
    @NotNull
    private int empid;

    @Column(name = "EmphouseName")
    @NotNull
    private String housename;

    
    @Column(name = "EmpplaceName")
    @NotNull
    private String place;

     @Column(name = "Emppin")
    @NotNull
    private String pincode;

}
