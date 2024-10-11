package com.matthieudeglon.Constants;

public enum BacterieSamples {
    GASTRO("Gastro", 100, 1, "Troubles digestifs"),
    RHUME("Rhume", 100, 4, "Mal à la gorge, fatigue, nez qui coule"),
    TUBERCULOSE("Tuberculose", 125, 6, "Fièvre, douleur poitrine, fatigue"),
    TETANOS("Tétanos", 125, 9, "Douleurs muscles de la mâchoire et de la nuque");

    private final String nom;
    private final int force;
    private final int dangerosite;
    private final String effets;

    BacterieSamples(String nom, int force, int dangerosite, String effets) {
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

