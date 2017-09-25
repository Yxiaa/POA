package exo2;

import java.util.Date;

public abstract class EnseignantPermanent extends Enseignant {

    private String recherche;

    public EnseignantPermanent(int num, String n, String p, CDI contrat, String recherche) {
        super(num, n, p, contrat);
        this.recherche = recherche;
    }

    public String getRecherche() {
        return recherche;
    }

    public void setRecherche(String recherche) {
        this.recherche = recherche;
    }

    public double augmentation(int augmentation)  {
        contrat.setSalaire(contrat.getSalaire()+augmentation);
        return contrat.getSalaire();
    }

    public String toString() {
        return super.toString() + "\nRecherche :" + this.getRecherche();
    }

}
