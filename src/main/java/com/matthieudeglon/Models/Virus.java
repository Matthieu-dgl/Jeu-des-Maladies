package com.matthieudeglon.Models;

import com.matthieudeglon.Constants.TypeMedicament;

public class Virus extends Maladie {
    public Virus(String nom, int force, int dangerosite, String symptomes) {
        super(nom, force, dangerosite, symptomes);
    }

    @Override
    public boolean traiter(Medicament med) {
        if (med.getType().equals(TypeMedicament.ANTIVIRAL)) {
            this.force -= 10;
        } else if (med.getType().equals(TypeMedicament.ANTIBIOTIQUE)) {
            this.force -= 1;
        }
        return estEradiquee();
    }

    @Override
    public int evolue() {
        int tranches = this.force / 25;
        this.force += 2 * tranches;
        return (int) (this.force * 0.1 * this.dangerosite);
    }
}
