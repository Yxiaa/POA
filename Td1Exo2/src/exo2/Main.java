package exo2;

import java.util.Date;

public class Main {

    public static void main (String[] args){

        Secretaire s = new Secretaire(25, "Dupont", "Jean", new CDD(2500, new Date(), new Date()));
        System.out.println(s.toString());

        Professeur pr1 = new Professeur(350, "Dupont", "Jean", new CDI(2500, new Date()), "Info");
        Professeur test = (Professeur) pr1;
        pr1.augmentation(500);



    }

}
