package exo2;

import java.util.Date;

public abstract class Contrat {

    private int salaire;
    private Date debut;

    public Contrat(int salaire, Date debut) {
        this.salaire = salaire;
        this.debut = debut;
    }

    public int getSalaire() {
        return salaire;
    }

    public Date getDebut() {
        return debut;
    }

    public void setSalaire(int salaire) {
        this.salaire = salaire;
    }
}
