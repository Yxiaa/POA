package fr.p10.miage.rps.model;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Player {

    private String nom;
    private int score;
    List<RPSEnum> mouvements;
    private int index;
    public static final int MOUVEMENT = 10;

    public Player(String nom, List<RPSEnum> e) {
        this.nom = nom;
        score = 0; index = 0;
        mouvements = new ArrayList<RPSEnum>(e);
    }

    public Player(String nom) {
        this.nom = nom;
        score = 0;
        mouvements = new ArrayList<RPSEnum>();

        for(int i = 0; i<MOUVEMENT; i++)
            mouvements.add(RPSEnum.valueOf(ThreadLocalRandom.current().nextInt(1, 4)));
    }

    public String getNom() {
        return nom;
    }

    public static List<RPSEnum> genererMouvements() {

        List<RPSEnum> m = new ArrayList<RPSEnum>();
        for(int i = 0; i<MOUVEMENT; i++)
            m.add(RPSEnum.valueOf(ThreadLocalRandom.current().nextInt(1, 4)));

        return m;
    }

    public int getScore() {
        return score;
    }

    public static int getMOUVEMENT() {
        return MOUVEMENT;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public RPSEnum getNextMove() {
        index++;
        return mouvements.get(index-1);


    }
}
