package exo2;

import java.util.Date;

public class CDD extends Contrat {

    private Date fin;

    public CDD(int salaire, Date debut, Date f) {
        super(salaire, debut);
        this.fin = f;
    }

    public Date getFin() {
        return fin;
    }

    public void setFin(Date fin) {
        this.fin = fin;
    }
}
