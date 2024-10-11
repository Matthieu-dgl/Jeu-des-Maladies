package com.matthieudeglon;

import com.matthieudeglon.MoteursDeJeu.Jeu;

public class App {
    public static void main(String[] args) {
        try {
            Jeu jeu = new Jeu();
            jeu.lancer();
        } catch (Exception e) {
            System.err.println("Une erreur s'est produite pendant l'exécution du jeu : " + e.getMessage());
            e.printStackTrace();
        }
    }
}

