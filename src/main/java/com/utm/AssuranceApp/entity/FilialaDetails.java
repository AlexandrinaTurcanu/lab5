package com.utm.AssuranceApp.entity;

public class FilialaDetails {
    private int id;
    private String nr_filialei;
    private int nr_produse;
    private String adresa;
    private int compania_id;

    public FilialaDetails(int id, String nr_filialei, int nr_produse, String adresa, int compania_id) {
        this.id = id;
        this.nr_filialei = nr_filialei;
        this.nr_produse = nr_produse;
        this.adresa = adresa;
        this.compania_id = compania_id;
    }
}
