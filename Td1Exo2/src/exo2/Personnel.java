package exo2;

public abstract class Personnel {

    private final String nom;
    private final String prenom;
    private final int numSec;

    public Personnel(int num, String n, String p) {
        this.nom = n;
        this.prenom = p;
        this.numSec = num;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getNumSec() {
        return numSec;
    }

    public String toString() {
        return this.getClass().getName() + " :\n" + "Nom :" + this.getNom() + "\nPrenom :" + this.getPrenom() + "\nNumero :" + this.getNumSec();
    }


}
