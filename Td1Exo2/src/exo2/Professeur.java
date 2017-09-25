package exo2;

import java.util.Date;

public class Professeur extends EnseignantPermanent {

    public Professeur(int num, String n, String p, CDI contrat, String recherche) {
        super(num, n, p, contrat, recherche);
    }

    public String toString() {
        return super.toString();
    }

}
