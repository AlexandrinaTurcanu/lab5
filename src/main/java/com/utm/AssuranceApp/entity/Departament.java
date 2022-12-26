package com.utm.AssuranceApp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Departament {
    private int id;
    private String denumire;
    private int nr_angajati;
    private int filiala_id;
}
