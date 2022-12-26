package com.utm.AssuranceApp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Company {
    private Integer id;
    private String denumire;
    private String licenta;
    private Integer nr_filiale;
    private String email;
}
