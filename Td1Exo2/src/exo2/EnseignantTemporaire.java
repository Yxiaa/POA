package exo2;

import java.util.Date;

public abstract class EnseignantTemporaire extends Enseignant {


    public EnseignantTemporaire(int num, String n, String p, CDD contrat) {
        super(num, n, p, contrat);
    }

    public Date getFin() {
        return ((CDD) contrat).getFin();
    }

    public String toString() {
        return super.toString() + "\nDate de fin :" + this.getFin().toString();
    }

}
