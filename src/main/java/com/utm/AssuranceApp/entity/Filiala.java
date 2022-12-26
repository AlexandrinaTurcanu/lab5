package com.utm.AssuranceApp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Filiala {
    private int id;
    private String nr_filialei;
    private int nr_produse;
    private String adresa;
    private int compania_id;
}
