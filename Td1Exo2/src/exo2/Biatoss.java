package exo2;


import java.util.Date;

public class Biatoss extends Personnel {

    private final Contrat contrat;

    public Biatoss(int num, String n, String p, CDD contrat) {
        super(num, n, p);
        this.contrat = contrat;
    }

    public Date getEmbauche() {
        return contrat.getDebut();
    }

    public int getSalaire() {
        return contrat.getSalaire();
    }

    public String toString() {
        return super.toString() + "\nDate embauche :" + this.getEmbauche() + "\nSalaire :" + this.getSalaire();
    }
}
