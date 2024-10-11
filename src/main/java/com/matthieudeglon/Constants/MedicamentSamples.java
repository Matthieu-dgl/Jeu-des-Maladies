package com.matthieudeglon.Constants;

public enum MedicamentSamples {
    AMOXICILLINE("Amoxicilline", TypeMedicament.ANTIBIOTIQUE),
    BRISTOPEN("Bristopen", TypeMedicament.ANTIBIOTIQUE),
    CLAMOXYL("Clamoxyl", TypeMedicament.ANTIBIOTIQUE),
    ORBENINE("Orbénine", TypeMedicament.ANTIBIOTIQUE),
    PRIODERM("Prioderm", TypeMedicament.ANTIPARASITE),
    ASCABIOL("Ascabiol", TypeMedicament.ANTIPARASITE),
    FLUVERMAL("Fluvermal", TypeMedicament.ANTIPARASITE),
    COMBANTRIN("Combantrin", TypeMedicament.ANTIPARASITE),
    ACICLOVIR("Aciclovir", TypeMedicament.ANTIVIRAL),
    IDUVIRAN("Iduviran", TypeMedicament.ANTIVIRAL);

    private final String nom;
    private final TypeMedicament type;

    MedicamentSamples(String nom, TypeMedicament type) {
        this.nom = nom;
        this.type = type;
    }

    public String getNom() {
        return nom;
    }

    public TypeMedicament getType() {
        return type;
    }
}

