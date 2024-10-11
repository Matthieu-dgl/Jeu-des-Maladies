package com.matthieudeglon.Models;

import java.util.HashSet;
import java.util.Iterator;

public class Patient {
    private String prenom;
    private String nom;
    private double vie;
    private double age;
    private HashSet<Maladie> lesMaladies;
    private static int nbMalades = 0;

    public Patient(String prenom, String nom, double vie, double age) {
        this.prenom = prenom;
        this.nom = nom;
        this.vie = vie;
        this.age = age;
        this.lesMaladies = new HashSet<>();
        if (!lesMaladies.isEmpty()) {
            nbMalades++;
        }
    }

    public void ajoutMaladie(Maladie m) {
        if (!estMalade()) {
            nbMalades++;
        }
        this.lesMaladies.add(m);
    }


    public boolean estMalade() {
        return !lesMaladies.isEmpty();
    }

    public boolean estDecede() {
        return vie <= 0;
    }

    public void seSoigner(Medicament med) {
        Iterator<Maladie> it = lesMaladies.iterator();
        while (it.hasNext()) {
            Maladie maladie = it.next();
            if (maladie.traiter(med)) {
                it.remove();
            }
        }
        if (!estMalade() && nbMalades > 0) {
            nbMalades--;
        }
    }


    public void subirMaladie() {
        for (Maladie maladie : lesMaladies) {
            int impact = maladie.evolue();
            if (age < 15) {
                impact += impact * 0.25;
            } else if (age > 65) {
                impact += impact * 0.33;
            }
            this.vie -= impact;
            if (this.vie < 0) {
                this.vie = 0;
            }
        }
    }


    @Override
    public String toString() {
        return "Patient{" + "prenom='" + prenom + '\'' + ", nom='" + nom + '\'' + ", vie=" + vie + ", age=" + age + ", maladies=" + lesMaladies + '}';
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getVie() {
        return vie;
    }

    public void setVie(double vie) {
        this.vie = vie;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public HashSet<Maladie> getLesMaladies() {
        return lesMaladies;
    }

    public void setLesMaladies(HashSet<Maladie> lesMaladies) {
        this.lesMaladies = lesMaladies;
    }

    public static int getNbMalades() {
        return nbMalades;
    }

    public static void setNbMalades(int nbMalades) {
        Patient.nbMalades = nbMalades;
    }
}

