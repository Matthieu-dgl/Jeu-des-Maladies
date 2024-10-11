package com.matthieudeglon.Constants;

public enum VirusSamples {
    ANGINE("Angine", 70, 1, "Mal à la gorge, fatigue"),
    GRIPPE("Grippe", 100, 4, "État grippal"),
    HEPATITE_C("Hépatite C", 125, 6, "Fièvre, nausées, vomissements"),
    HERPES("Herpès", 45, 3, "Boutons");

    private final String nom;
    private final int force;
    private final int dangerosite;
    private final String effets;

    VirusSamples(String nom, int force, int dangerosite, String effets) {
        this.nom = nom;
        this.force = force;
        this.dangerosite = dangerosite;
        this.effets = effets;
    }

    public String getNom() {
        return nom;
    }

    public int getForce() {
        return force;
    }

    public int getDangerosite() {
        return dangerosite;
    }

    public String getEffets() {
        return effets;
    }
}

