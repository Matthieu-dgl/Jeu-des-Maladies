package com.matthieudeglon.Models;
import java.util.Random;

public class Bacterie extends Maladie{

    private int stade;

    public Bacterie(String nom, int force, int dangerosite, String symptomes) {
        super(nom, force, dangerosite, symptomes);
        this.stade = new Random().nextInt(4);
    }

    @Override
    public boolean traiter(Medicament med) {
        if (med.getType().equals("Antibiotique")) {
            switch (stade) {
                case 0:
                    this.force = 0;
                    break;
                case 1:
                    this.force -= 10;
                    break;
                case 2:
                    stade = 2;
                    break;
                case 3:
                    this.force -= 5;
                    break;
            }
        } else if (med.getType().equals("Antiviral") && stade == 1) {
            this.force -= 10;
        } else if (med.getType().equals("Antiviral")) {
            this.force -= 3;
        }
        return estEradiquee();
    }

    @Override
    public int evolue() {
        Random rand = new Random();
        if(rand.nextBoolean()) {
            this.force += 5;
        } else {
            stade = Math.min(4, stade);
        }
        switch(stade) {
            case 0:
                return (int) Math.round(this.force * 0.2);
            case 1:
                return (int) Math.round(this.force * 0.3);
            case 2:
                return (int) Math.round(this.force * 0.7);
            case 3:
                return (int) Math.round(this.force * 0.9);
            default:
                return 0;
        }
    }
}
