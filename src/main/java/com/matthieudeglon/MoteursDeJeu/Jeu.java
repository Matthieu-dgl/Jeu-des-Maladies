package com.matthieudeglon.MoteursDeJeu;

import com.matthieudeglon.Models.Maladie;
import com.matthieudeglon.Models.Medicament;
import com.matthieudeglon.Models.Patient;

import java.util.List;
import java.util.Scanner;

public class Jeu {

    private List<Patient> patients;
    private List<Medicament> medicaments;
    private int niveauDifficulte;

    public Jeu() {
        this.patients = InitJeu.initPatients(InitJeu.initMaladies());
        this.medicaments = InitJeu.initMedicaments();
    }

    public void lancer() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choisissez le niveau de difficulté :");
        System.out.println("1. Normal");
        System.out.println("2. Difficile");
        niveauDifficulte = sc.nextInt();

        boolean jeuTermine = false;

        while (!jeuTermine) {
            jeuTermine = true;

            for (Patient patient : patients) {
                if (!patient.estDecede() && patient.estMalade()) {
                    jeuTermine = false;

                    System.out.println("Patient : " + patient.getPrenom() + " " + patient.getNom());
                    System.out.println("Âge : " + patient.getAge() + " ans");
                    System.out.println("Points de vie : " + patient.getVie());
                    System.out.println("État : " + (patient.estMalade() ? "Malade" : "Sain"));

                    if (niveauDifficulte == 1) {
                        System.out.print("Symptômes : ");
                        for (Maladie maladie : patient.getLesMaladies()) {
                            System.out.print(maladie.getSymptomes() + "; ");
                        }
                        System.out.println();
                    }

                    if (patient.estDecede()) {
                        System.out.println(patient.getPrenom() + " " + patient.getNom() + " est décédé.");
                        System.out.println("Le jeu est terminé.");
                        sc.close();
                        return;
                    }

                    System.out.println(patient.getPrenom() + " est malade.");

                    System.out.println("Choisissez un médicament pour " + patient.getPrenom() + " :");
                    for (int i = 0; i < medicaments.size(); i++) {
                        System.out.println(i + ": " + medicaments.get(i));
                    }

                    int choixMedicament = sc.nextInt();
                    Medicament medicamentChoisi = medicaments.get(choixMedicament);

                    patient.seSoigner(medicamentChoisi);

                    patient.subirMaladie();

                    if (patient.estDecede()) {
                        System.out.println(patient.getPrenom() + " est décédé.");
                        System.out.println("Le jeu est terminé.");
                        sc.close();
                        return;
                    } else {
                        System.out.println(patient.getPrenom() + " a maintenant " + patient.getVie() + " points de vie.");
                    }
                }
            }

            if (tousSains()) {
                jeuTermine = true;
            }
        }

        sc.close();
        finDeJeu();
    }

    private boolean tousSains() {
        for (Patient p : patients) {
            if (p.estMalade()) {
                return false;
            }
        }
        return true;
    }

    private void finDeJeu() {
        if (tousSains()) {
            System.out.println("Tous les patients sont guéris ! Félicitations !");
        }
    }
}
