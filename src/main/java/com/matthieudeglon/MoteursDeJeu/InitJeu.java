package com.matthieudeglon.MoteursDeJeu;

import com.matthieudeglon.Constants.BacterieSamples;
import com.matthieudeglon.Constants.MedicamentSamples;
import com.matthieudeglon.Constants.ParasiteSamples;
import com.matthieudeglon.Constants.VirusSamples;
import com.matthieudeglon.Models.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class InitJeu {

    public static List<Maladie> initMaladies() {
        List<Maladie> maladies = new ArrayList<>();
        maladies.add(new Bacterie(BacterieSamples.GASTRO.getNom(), BacterieSamples.GASTRO.getForce(), BacterieSamples.GASTRO.getDangerosite(), BacterieSamples.GASTRO.getEffets()));
        maladies.add(new Bacterie(BacterieSamples.RHUME.getNom(), BacterieSamples.RHUME.getForce(), BacterieSamples.RHUME.getDangerosite(), BacterieSamples.RHUME.getEffets()));
        maladies.add(new Bacterie(BacterieSamples.TUBERCULOSE.getNom(), BacterieSamples.TUBERCULOSE.getForce(), BacterieSamples.TUBERCULOSE.getDangerosite(), BacterieSamples.TUBERCULOSE.getEffets()));
        maladies.add(new Bacterie(BacterieSamples.TETANOS.getNom(), BacterieSamples.TETANOS.getForce(), BacterieSamples.TETANOS.getDangerosite(), BacterieSamples.TETANOS.getEffets()));

        maladies.add(new Virus(VirusSamples.ANGINE.getNom(), VirusSamples.ANGINE.getForce(), VirusSamples.ANGINE.getDangerosite(), VirusSamples.ANGINE.getEffets()));
        maladies.add(new Virus(VirusSamples.GRIPPE.getNom(), VirusSamples.GRIPPE.getForce(), VirusSamples.GRIPPE.getDangerosite(), VirusSamples.GRIPPE.getEffets()));
        maladies.add(new Virus(VirusSamples.HEPATITE_C.getNom(), VirusSamples.HEPATITE_C.getForce(), VirusSamples.HEPATITE_C.getDangerosite(), VirusSamples.HEPATITE_C.getEffets()));
        maladies.add(new Virus(VirusSamples.HERPES.getNom(), VirusSamples.HERPES.getForce(), VirusSamples.HERPES.getDangerosite(), VirusSamples.HERPES.getEffets()));

        maladies.add(new Parasite(ParasiteSamples.POUX.getNom(), ParasiteSamples.POUX.getForce(), ParasiteSamples.POUX.getDangerosite(), ParasiteSamples.POUX.getEffets()));
        maladies.add(new Parasite(ParasiteSamples.GALE.getNom(), ParasiteSamples.GALE.getForce(), ParasiteSamples.GALE.getDangerosite(), ParasiteSamples.GALE.getEffets()));
        maladies.add(new Parasite(ParasiteSamples.TENIA.getNom(), ParasiteSamples.TENIA.getForce(), ParasiteSamples.TENIA.getDangerosite(), ParasiteSamples.TENIA.getEffets()));
        maladies.add(new Parasite(ParasiteSamples.MALARIA.getNom(), ParasiteSamples.MALARIA.getForce(), ParasiteSamples.MALARIA.getDangerosite(), ParasiteSamples.MALARIA.getEffets()));

        return maladies;
    }

    public static List<Medicament> initMedicaments() {
        List<Medicament> medicaments = new ArrayList<>();

        medicaments.add(new Medicament(MedicamentSamples.AMOXICILLINE.getNom(), MedicamentSamples.AMOXICILLINE.getType().getNom()));
        medicaments.add(new Medicament(MedicamentSamples.BRISTOPEN.getNom(), MedicamentSamples.BRISTOPEN.getType().getNom()));
        medicaments.add(new Medicament(MedicamentSamples.CLAMOXYL.getNom(), MedicamentSamples.CLAMOXYL.getType().getNom()));
        medicaments.add(new Medicament(MedicamentSamples.ORBENINE.getNom(), MedicamentSamples.ORBENINE.getType().getNom()));

        medicaments.add(new Medicament(MedicamentSamples.PRIODERM.getNom(), MedicamentSamples.PRIODERM.getType().getNom()));
        medicaments.add(new Medicament(MedicamentSamples.ASCABIOL.getNom(), MedicamentSamples.ASCABIOL.getType().getNom()));
        medicaments.add(new Medicament(MedicamentSamples.FLUVERMAL.getNom(), MedicamentSamples.FLUVERMAL.getType().getNom()));
        medicaments.add(new Medicament(MedicamentSamples.COMBANTRIN.getNom(), MedicamentSamples.COMBANTRIN.getType().getNom()));

        medicaments.add(new Medicament(MedicamentSamples.ACICLOVIR.getNom(), MedicamentSamples.ACICLOVIR.getType().getNom()));
        medicaments.add(new Medicament(MedicamentSamples.IDUVIRAN.getNom(), MedicamentSamples.IDUVIRAN.getType().getNom()));

        return medicaments;
    }

    public static List<Patient> initPatients(List<Maladie> maladies) {
        List<Patient> patients = new ArrayList<>();
        Random rand = new Random();

        patients.add(new Patient("Alice", "Durand", 100, 30));
        patients.add(new Patient("Bob", "Martin", 80, 24));
        patients.add(new Patient("Claire", "Dupont", 90, 40));
        patients.add(new Patient("David", "Leroy", 70, 70));
        patients.add(new Patient("Emma", "Moreau", 85, 25));

        for (Patient p : patients) {
            int nbMaladies = rand.nextInt(3) + 1;
            for (int i = 0; i < nbMaladies; i++) {
                p.ajoutMaladie(maladies.get(rand.nextInt(maladies.size())));
            }
        }

        return patients;
    }
}

