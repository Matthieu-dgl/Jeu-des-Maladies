package com.matthieudeglon.Models;

public abstract class Maladie {
    protected String nom;
    protected int force;
    protected int dangerosite;
    protected String symptomes;

    public Maladie(String nom, int force, int dangerosite, String symptomes) {
        this.nom = nom;
        this.force = force;
        this.dangerosite = dangerosite;
        this.symptomes = symptomes;
    }

    public boolean estEradiquee() {
        return this.force == 0;
    }

    @Override
    public String toString() {
        return "Maladie [nom=" + nom + ", force=" + force + ", dangerosite=" + dangerosite + ", symptomes=" + symptomes + "]";
    }

    public abstract int evolue();

    public abstract boolean traiter(Medicament med);

    public String getSymptomes() { return symptomes; }
}
