package com.matthieudeglon.Models;

public class Medicament {
    private String nom;
    private String type;

    public Medicament(String nom, String type) {
        this.nom = nom;
        this.type = type;
    }

    public String getNom() {
        return nom;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Medicament{" + "nom='" + nom + '\'' + ", type='" + type + '\'' + '}';
    }
}


