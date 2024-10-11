package com.matthieudeglon.Constants;

public enum TypeMedicament {
    ANTIBIOTIQUE("Antibiotique"),
    ANTIVIRAL("Antiviral"),
    ANTIPARASITE("Antiparasite");

    private final String nom;

    TypeMedicament(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }
}
