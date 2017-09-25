package exo2;

import java.util.Date;

public abstract class Enseignant extends Personnel{

    protected final Contrat contrat;

    public Enseignant(int num, String n, String p, Contrat c) {
        super(num, n, p);

        this.contrat = c;

    }

    public Date getRecrutement() {
        return this.contrat.getDebut();
    }

    public int getSalaire() {
        return this.contrat.getSalaire();
    }


    public String toString() {
        return super.toString() + "\nRecrutement :" + this.getRecrutement().toString() + "\nSalaire :" + this.getSalaire();
    }


}
