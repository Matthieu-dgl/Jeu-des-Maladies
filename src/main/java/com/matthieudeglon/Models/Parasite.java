package com.matthieudeglon.Models;

public class Parasite extends Maladie {

    public Parasite(String nom, int force, int dangerosite, String symptomes) {
        super(nom, force, dangerosite, symptomes);
    }

    @Override
    public boolean traiter(Medicament med) {
        if (med.getType().equals("Antiparasite")) {
            this.force = 0;
        } else {
            this.force -= 20;
        }
        return estEradiquee();
    }

    @Override
    public int evolue() {
        return 3;
    }
}
