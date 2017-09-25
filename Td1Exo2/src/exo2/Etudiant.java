package exo2;

public class Etudiant extends Personnel {


    private String bourse;

    public Etudiant(int num, String n, String p, String bourse) {
        super(num, n, p);
        this.bourse = bourse;
    }

    public String getBourse() {
        return bourse;
    }

    public void setBourse(String bourse) {
        this.bourse = bourse;
    }


    public String toString() {
        return super.toString() + "\nBourse :" + this.getBourse();
    }
}



