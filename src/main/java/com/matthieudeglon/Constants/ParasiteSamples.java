package com.matthieudeglon.Constants;

public enum ParasiteSamples {
    POUX("Poux", 20, 1, "Démangeaisons au niveau des cheveux"),
    GALE("Gale", 50, 4, "Importantes démangeaisons au niveau de la peau"),
    TENIA("Ténia", 150, 6, "Perte importante de poids, Maux de ventre violents"),
    MALARIA("Malaria", 300, 9, "Fièvre élevée soudaine, en poussées ou constante");

    private final String nom;
    private final int force;
    private final int dangerosite;
    private final String effets;

    ParasiteSamples(String nom, int force, int dangerosite, String effets) {
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
