package com.utm.AssuranceApp.entity;

public class DepartamentDetails {
    private int id;
    private String denumire;
    private int nr_angajati;
    private int filiala_id;

    public DepartamentDetails(int id, String denumire, int nr_angajati, int filiala_id) {
        this.id = id;
        this.denumire = denumire;
        this.nr_angajati = nr_angajati;
        this.filiala_id = filiala_id;
    }
}
