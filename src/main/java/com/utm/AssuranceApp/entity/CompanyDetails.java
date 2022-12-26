package com.utm.AssuranceApp.entity;

public class CompanyDetails {

    private Integer id;
    private String denumire;
    private String licenta;
    private Integer nr_filiale;
    private String email;

    public CompanyDetails(Integer id, String denumire, String licenta, Integer nr_filiale, String email){
        this.id = id;
        this.denumire = denumire;
        this.licenta = licenta;
        this.nr_filiale = nr_filiale;
        this.email = email;
    }
}
